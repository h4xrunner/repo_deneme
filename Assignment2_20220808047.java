import java.util.Scanner;
/*
* @author ibrahim Gül
* @since 09.11.2023
*/
public class Assignment2_20220808047 {

    // first character upperchase, other characters lowercase
    static String formatCategoryName(String name) {
        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }

    // quantity verifier
    static boolean isQuantityValid(int quantity) {
        return quantity > 0;
    }

    //Function that checks the validity of the weight
    static boolean isWeightValid(int weight, int totalWeight) {
        return (!((weight <= 0 || weight > 100) || totalWeight > 100));
    }


    // Function that determines letter grade
    static String gradeLetter(double grade) {
        if (grade < 35) {
            return "FF";
        } else if (grade < 46) {
            return "FD";
        } else if (grade < 53) {
            return "DD";
        } else if (grade < 60) {
            return "DC";
        } else if (grade < 67) {
            return "CC";
        } else if (grade < 74) {
            return "CB";
        } else if (grade < 81) {
            return "BB";
        } else if (grade < 88) {
            return "BA";
        } else if (grade <= 100) {
            return "AA";
        } else {
            return "Invalid Grade";
        }
    }

    // Function that determines GPA score
    static double gpaPoints(double grade) {
        if (grade >= 88) {
            return 4.0;
        } else if (grade >= 81) {
            return 3.5;
        } else if (grade >= 74) {
            return 3.0;
        } else if (grade >= 67) {
            return 2.5;
        } else if (grade >= 60) {
            return 2.0;
        } else if (grade >= 53) {
            return 1.5;
        } else if (grade >= 46) {
            return 1.0;
        } else if (grade >= 35) {
            return 0.5;
        } else {
            return 0.0;
        }
    }

    // Function that determines the student's status
    static String status(double grade) {
        if (grade >= 60) {
            return "passed";
        } else if (grade >= 46) {
            return "conditionally passed";
        } else {
            return "failed";
        }
    }

    // Function that performs operations related to the category
    static void categoryOperations(int[] weights, int[] given, String[] cat, String catNumber, int indexNumber) {
        Scanner opt = new Scanner(System.in);
        int totalWeight = 0;    
        // Gets the category name from the user
        System.out.print("Please enter the name of category " + catNumber + ":");
        String category = opt.nextLine();

        // Gets the category name from the user
        System.out.print("Please enter how many items of type " + formatCategoryName(category) + " were given:");
        given[indexNumber] = opt.nextInt();

        // It stays in the loop until the input is valid
        while (!isQuantityValid(given[indexNumber])) {
            System.out.print("Please enter how many items of type " + formatCategoryName(category) + " were given:");
            given[indexNumber] = opt.nextInt();
        }

        // Gets weight percentage for specific category from user
        System.out.print("Please enter the percentage weight of " + formatCategoryName(category) + ":");
        weights[indexNumber] = opt.nextInt();

        // If invalid weight or total weight exceeds 100 it stays in the loop until it receives new input
        for (int i = 0; i < indexNumber+1; i++) {
            totalWeight = totalWeight + weights[i];
        }
        while (!isWeightValid(weights[indexNumber],totalWeight)) {
            System.out.print("Please enter the percentage weight of " + formatCategoryName(category) + ":");
            weights[indexNumber] = opt.nextInt();
        }

        cat[indexNumber] = category; // Save category name in array

        
    }

    // Function that calculates the average of grades in a particular category
    static double averagePointOfCategory(double[] givenPoints) {
        double sum = 0;
        for (double givenPoint : givenPoints) {
            sum += givenPoint;
        }
        return (double) sum / givenPoints.length;
    }

    public static void main(String[] args) {
        Scanner opt = new Scanner(System.in);

        int[] weights = {0, 0, 0, 0, 0}; // Stores category weights
        int[] given = {0, 0, 0, 0, 0}; // Stores the number of items given in the given category
        double[] averages = {0, 0, 0, 0, 0};
        String[] cat = new String[5];

        System.out.println("\n\n******** Category Information Entry ********\n\n");

        // Performs operations for 5 categories
        for (int i = 0; i < 5; i++) {
            categoryOperations(weights, given, cat, Integer.toString(i + 1), i);
        }

        System.out.println("\n\n******** Students Grades Entry ********\n\n" +
                "\n Please enter values that the students earned for each item");

        double[] weightedAverages = new double[5];

        for (int i = 0; i < 5; i++) {
            double[] grades = new double[given[i]];
            for (int j = 0; j < given[i]; j++) {
                // Gets each student's grade from the user
                System.out.print(formatCategoryName(cat[i]) + " " + (j + 1) + ":");
                double grade = opt.nextDouble();
                grades[j] = grade;
            }

            // Calculate weighted average and save to array
            weightedAverages[i] = averagePointOfCategory(grades) * weights[i] / 100.0;
            averages[i] = averagePointOfCategory(grades);
        }
        System.out.println("\n\n******** Student Results ********\n\n");
        double totalPoints = 0;
        for (double weightedAverage : weightedAverages) {
            // Calculate total score
            totalPoints += weightedAverage;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(formatCategoryName(cat[i]) + ": " + averages[i]);
        }

        System.out.println("The student has " + status(totalPoints) + " CSE 101 with a score of " + totalPoints + ", GPA points of "
                + gpaPoints(totalPoints) + ", and a grade letter of " + gradeLetter((int) totalPoints));

        
    }
}
