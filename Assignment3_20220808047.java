import java.util.Scanner;
/*
* @author ibrahim Gül
* @since 09.11.2023
*/
public class Assignment3_20220808047 {

    // first character upperchase, other characters lowercase
    static String formatCategoryName(String name) {
        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }
     private static void formatCategoryName(String[] cat) {
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

    // Function that calculates the average of grades in a particular category
    static double averagePointOfCategory(double[] givenPoints) {
        double sum = 0;
        for (double givenPoint : givenPoints) {
            sum += givenPoint;
        }
        return (double) sum / givenPoints.length;
    }
    static void calculateGrade(String[] category, int[] quantity, int[] weight) {
        Scanner opt = new Scanner(System.in);

        double[] averages = new double[4];
        double[] weightedAverages = new double[4];
        double totalPoints = 0;

        // Her bir kategori için döngü
        for (int i = 0; i < category.length; i++) {
            // Kategori adını ilk harfini büyük, diğer harflerini küçük yaparak düzenle
            category[i] = formatCategoryName(category[i]);

            double[] grades = new double[quantity[i]];

            // Kategorideki her bir öğe için notları al
            for (int j = 0; j < quantity[i]; j++) {
                System.out.print("Please enter grade for " + category[i] + " " + (j + 1) + " >>");
                double grade = opt.nextDouble();
                grades[j] = grade;
            }

            // Calculate weighted average and save to array
            weightedAverages[i] = averagePointOfCategory(grades) * weight[i] / 100.0;
            averages[i] = averagePointOfCategory(grades);
            totalPoints += weightedAverages[i];
        }


    
        gradeInformation(category, averages, totalPoints);
    }
        
    static void gradeInformation(String[] category, double[] averages, double totalPoints) {
        System.out.println("\n\nCategory Information :");
        for (int i = 0; i < 4; i++) {
            System.out.println(formatCategoryName(category[i]) + "- " + averages[i]);
    }
    System.out.println("\n\nOverall grade - " + totalPoints+ "\nGrade Letter - " + gradeLetter(totalPoints) + 
    "\nGPA Points - " + gpaPoints(totalPoints) + "\nStatus - " + status(totalPoints));
    
    }
    
    public static void main(String[] args) {
        Scanner opt = new Scanner(System.in);

        int[] weight = {10, 20, 30, 40}; // Stores category weights
        int[] quantity = {4, 3, 1, 1}; // Stores the number of items given in the given category
        double[] averages = {0, 0, 0, 0};
        String[] category = {"Quiz", "Homework", "Midterm exam", "FiNal Exam"};
        formatCategoryName(category);
        double[] weightedAverages = new double[4];
        calculateGrade(category, quantity, weight);
        

        

       

           

        
    }




   
}
