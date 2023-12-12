import java.util.Scanner;
/*
* @author ibrahim Gül
* @since 09.11.2023
*/
public class Assignment3_20220808047 {
    static void formatCategoryName(String[] name){
        for(int i = 0; i < name.length; i++){
            //formating the names in name array as capitalize the first letter and lowercase others as in section 3.a
            name[i]= name[i].substring(0, 1).toUpperCase() + name[i].substring(1).toLowerCase(); 
                
        }
    }
    static int menu(Scanner input, String[] item){
        formatCategoryName(item);
        for(int i = 0; i < item.length; i++){
            System.out.println(i + " - " + item[i]); //list the String[] item with index numbers
        }
        System.out.println("Q - to Quit"); //Quit line
        String userInput = input.next(); //keep the user input in one variable
        if(userInput.charAt(0) == 'Q' ||userInput.charAt(0) == 'q'){ //Check if user insert Q or q for quit as in section 1.c
            return -1; // as in 1.f
        }
        try {
            return Integer.parseInt(userInput); //if user didn't insert q or Q return the user Input but only the Integer
        } catch (NumberFormatException e) {
            return -1; //if user didn't insert q or Q and any Integer value it will just return -1 anyways
        } 
    
    }
    static void averageCalculator(double[] averageGrades, double[] gradeOfOneCategory, int index){
        double total = 0;
        for (double k : gradeOfOneCategory) {
                        
            total = total + k;
                            
        }
        averageGrades[index] = total / gradeOfOneCategory.length;
        index++;
    }
    static double overallGrade(double[] averageGrades, int[] weight){
        double overallGrade = 0;
        int index = 0;
        for (double i : averageGrades) {
            
            overallGrade += ((i * (double)weight[index]) / 100.0);
            index++;
            
        }
        return overallGrade;
    }
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
    static String status(double grade) {
        if (grade >= 60) {
            return "passed";
        } else if (grade >= 46) {
            return "conditionally passed";
        } else {
            return "failed";
        }
    }
    static void calculateGrade(String[] category, int[] quantity, int[] weight){
        Scanner inp = new Scanner(System.in);
        //checks the arrays have the same length as in 2.iv
        if(!(category.length == quantity.length && weight.length == quantity.length)){
            //display an error and exit if the arrays have not same the length as in 2.iv
            System.out.println("ERROR: Array lengths are not all the same");
            System.exit(0); 
        }
        //weight conditions checking
        int totalWeight = 0;
        for (int i : weight) {
            if(i<0){
                System.out.println("ERROR: Invalid weight entered");
                System.exit(0); 
            }
            totalWeight += i;
            
        }
        if(totalWeight != 100){
            System.out.println("ERROR: Invalid weight entered");
            System.exit(0); 
        }
        for (int i : quantity) {
            if(i<0){
                System.out.println("ERROR: Invalid quantity entered");
                System.exit(0); 
            }
            
            
        }

        //formating the names in name array as capitalize the first letter and lowercase others as in section 2.a.i.1
        formatCategoryName(category);
        //Declaring a two dimensional array like a matrix because i have multiple category which have multiple quantities so it is a better way to do store data
        double[][] grades = new double[category.length][];
        for (int i = 0; i < category.length; i++) {
            //Initializing this arrays second dimmension as quantity of a give category
            grades[i] = new double[quantity[i]];
        }

        double[] averageGrades = new double[category.length];
        //get each category grades
        System.out.println("Welcome to our university grade system.");
        for(;;){
            
            String[] list = {"enter all grades","display grade information","change a single grade"};
            System.out.println("Please enter a choice below:");
            int val = menu(inp, list);
            
            int index = 0;
            switch (val) {
                case 0:
                    index = 0;
                    for (String i : category) {
                        for (int j = 0; j < quantity[index]; j++) {
                            if(quantity[index] == 1){
                                System.out.print("Please enter grade for " + i + " >> ");
                            }else{
                                System.out.print("Please enter grade for " + i + " " + (j + 1) + " >> ");
                            }
                           
                            int currentGradeInput = inp.nextInt();
                            if (currentGradeInput >= 0 && currentGradeInput <= 100) {
                                grades[index][j] = currentGradeInput;
                            } else {
                                System.out.println("Invalid grade!");
                                j--; 
                            }
                        }
                        //calculate average grades
                        averageCalculator(averageGrades, grades[index], index);
                        index++;
                    }
                    System.out.println();
                    break;
            
                case 1:
                    System.out.println("\nCategory information;");
                    index = 0;
                    for (String i : category) {
                        System.out.println(i + " - " + averageGrades[index]);
                        index++;
                    }
                    
                    double grade = overallGrade(averageGrades, weight);

                    System.out.println("\nOverall grade - " + grade);
                    System.out.println("Grade letter - " + gradeLetter(grade));
                    System.out.println("GPA points - " + gpaPoints(grade));
                    System.out.println("Status points - " + status(grade) + "\n");


                    break;    
                case 2:
                    System.out.println("\nPlease enter the category");
                    val = menu(inp , category);
               
                        
                    for(int i = 0; i<category.length; i++){
                        if(val == i){
                            String selectedName;
                            int selected;
                            if(quantity[i]==1){
                                selectedName = category[i];
                                selected = 0;
                            }else{
                                System.out.print("Please enter the which " + category[i] + " you would like to change (1 - " + (quantity[i]) + ") >> " );
                                selected = inp.nextInt();
                                if(selected <= 0 && selected > (quantity[i])){
                                    System.out.println("Invalid choice.");
                                    break;                             
                                }
                                selectedName = category[i] + " " + (quantity[i]);
                                selected -= 1;
                            }

                            System.out.println("The current grade for " + selectedName + " is " + grades[i][selected]);
                            System.out.print("Please enter the new grade value >> ");
                            int newGrade = inp.nextInt();
                            if(newGrade < 0 && newGrade > 100){
                                System.out.println("Invalid choice.");
                                break;                                  
                            }
                            grades[i][selected] = (double) newGrade;
                            averageCalculator(averageGrades,grades[i],i);


                        }else if(val == -1){
                            System.out.print("Quiting from category selection");
                            break;
                        }
                        
                    }
                    System.out.println();
                    break;
                case -1:
                    System.out.println("Thank you for using our system. Have a nice day.");
                    System.exit(0);
                    break;
            
                default:
                    System.out.println("Invalid choice.");
                    
                    break;
            }
            
        }

    }
    public static void main(String[] args) {
        String[] category = {"quiz","homework","midterm exam","final exam"};
        int[] quantity = {4,3,1,1};
        int[] weight = {10,15,25,50};
        calculateGrade(category, quantity, weight);
        
    }
}