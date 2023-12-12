import java.util.Scanner;

public class Assignment1b_20220808047 {


    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the grading weight (percentages) for the following categories");
        //percentage of values
        System.out.print("Quizzes:");
        //qp is quizz percentage
        double qp = (scanner.nextDouble()/100);
        if (qp<0 || qp>1){
            System.out.print("ERROR: invalid value entered (must be between 0 and 100)");
            System.exit(0);
        }
        System.out.print("Homeworks:");
        //hp is homework percentage
        double hp = (scanner.nextDouble()/100);
        if (hp<0 || hp>1){
            System.out.print("ERROR: invalid value entered (must be between 0 and 100)");
            System.exit(0);
        }
        System.out.print("Midterm exam:");
        double mp = ((scanner.nextDouble()/100));
        //mp is midterm exam percentage
        if (mp<0 || mp>1){
            System.out.print("ERROR: invalid value entered (must be between 0 and 100)");
            System.exit(0);
        }
        System.out.print("Final exam:");
        double fp = ((scanner.nextDouble()/100));
        //fp is final exam percentage
        if (fp<0 || fp>1){
            System.out.print("ERROR: invalid value entered (must be between 0 and 100)");
        }
            if ((qp+hp+mp+fp) != 1){
                System.out.print("The values sum to "+ (qp+hp+mp+fp)*100 +" but should sum to 100");
                System.exit(0);          
//until we can enter negative percentages, fix it
        }
        if (qp < 0 || hp < 0 || mp < 0 || fp < 0 || qp > 100 || hp > 100 || mp > 100 || fp > 100) {
            System.out.print("you have to enter grading weight between 0 and 100");
            System.exit(0);
        }
       System.out.println("Please enter the what İbrahim Gül earned from the each category;");
       
        

        System.out.print(" Quizzes: ");
        double q = scanner.nextInt();
        //q is quizz grade
        if (q < 0 || q > 100){
            System.out.print("ERROR:invalid value entered (must be between 0 and 100)");
            System.exit(0);
        }


        System.out.print("Homework: ");
        double h = scanner.nextInt();
        //h is homework grade
        if (h < 0 || h > 100){
            System.out.print("ERROR:invalid value entered (must be between 0 and 100)");
            System.exit(0);
        }
        
        System.out.print("Midterm:");
        double m = scanner.nextInt();
        //m is midterm exam grade
        if (m < 0 || m > 100){
            System.out.print("ERROR:invalid value entered (must be between 0 and 100)");
            System.exit(0);
        }
        System.out.print("Final:");
        double f = scanner.nextInt();
        //f is final exam grade
        if (f < 0 || f > 100){
            System.out.print("ERROR:invalid value entered (must be between 0 and 100)");
            System.exit(0);
        }
      
        double sc = (q*qp + h*hp + m*mp + f*fp);
        //sc is score
           
       

        
        double gpa = 0.0;
        String gl = "";
        //gl is grade letter
        String rs = "";
        //rs is result
        if (sc>=0 && sc<35){
            gpa = 0.0;
            gl = "FF";
            rs = "failed";
        } else if (sc >= 35 && sc < 46) {
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
               
        scanner.close();
    }
}