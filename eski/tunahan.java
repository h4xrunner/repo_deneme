import java.util.Scanner;

public class tunahan {
    static double percentageCalcs(String percantage){
        Scanner scan = new Scanner(System.in);
        System.out.print(percantage);
        double p = (scan.nextDouble()/100);
        if (p<=0 || p>=1){
            System.out.print("ERROR: invalid value entered (must be between 0 and 100)");
            scan.close();
            System.exit(0);
        }
        return p;
    }
    static double gradeCalcs(String grade){
        Scanner scan = new Scanner(System.in);
        System.out.print(grade);
        double g = scan.nextDouble();
        if (g<=0 || g>=100){
            System.out.print("ERROR: invalid value entered (must be between 0 and 100)");
            scan.close();
            System.exit(0);
        }

        return g;
        
    }
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the grading weight (percentages) for the following categories");
        //percentage of values
        double qp = percentageCalcs("Quizzes:");   
        double hp = percentageCalcs("Homework:");  
        double mp = percentageCalcs("Midterm exam:");  
        double fp = percentageCalcs("Final exam:");
       
            if ((qp+hp+mp+fp) != 1){
                System.out.print("The values sum to"+ (qp+hp+mp+fp) +" but should sum to 100");
                System.exit(0);          
//until we can enter negative percentages, fix it
        }
        if (qp < 0 || hp < 0 || mp < 0 || fp < 0 || qp > 100 || hp > 100 || mp > 100 || fp > 100) {
            System.out.print("you have to enter grading weight between 0 and 100");
            System.exit(0);
        }
       System.out.println("Please enter the what İbrahim Gül earned from the each category;");

        double q = gradeCalcs("Quizzes:");   
        double h = gradeCalcs("Homework:");  
        double m = gradeCalcs("Midterm exam:");  
        double f = gradeCalcs("Final exam:");       
        


      
        double sc = (q*qp + h*hp + m*mp + f*fp);
        double gpa = 0.0;
        String gl = "";
        String rs = "";
        if (sc>=0 && sc<35){
            gpa = 0.0;
            gl = "FF";
            rs = "failed";
        } else if (sc < 46) {
            gpa = 0.5;
            gl = "FD";
            rs = "failed";
        } else if (sc >= 46 && sc < 53) {
            gpa = 1.0;
            gl = "DD";
            rs =  "conditionally passed";
        } else if (sc>=53 && sc<60){
            gpa = 1.5;
            gl = "DC";
            rs = "conditionally passed";
        } else if (sc>=60 && sc<67){
            gpa = 2.0;
            gl = "CC";
            rs = "passed";
        } else if (sc>=67 && sc<74){
            gpa = 2.5;
            gl = "CB";
            rs = "passed";
        } else if (sc>=74 && sc<81){
            gpa = 3.0;
            gl = "BB";
            rs = "passed";
        } else if (sc>=81 && sc<88){
            gpa = 3.5;
            gl = "BA";
            rs = "passed";
        } else if (sc>=88 && sc<=100){
            gpa = 4.0;
            gl = "AA";
            rs = "passed";
        }
        
        
        System.out.print("İbrahim Gül " + rs+  " SE 101 with a score of " + sc+ ", GPA points of "+ gpa + ", a grade letter of " + gl );
        

        // Scanner'ı kapatmayı unutmayın.
        scanner.close();
    }
}
