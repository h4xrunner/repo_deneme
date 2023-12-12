import java.util.Random;
import java.util.Scanner;
public class Lab03 {
    public static void main(String[] args) {
        
        
        /*Scanner input = new Scanner(System.in);
        System.out.println("enter a integer number:");
        double number = input.nextInt();
        if (number>0){
            System.out.println("this number is positive");
        }
        else {
            if (number<0) {
            System.out.println("this number is negative");
        
        }
            else  {
                if (number == 0);
                System.out.println("this number = 0");
            }

    }
}*/

        /*Scanner input = new Scanner(System.in);

        System.out.println("enter your quadratic equation's ax^2+bx+c in this order a, b, c");
        double a = input.nextInt();
        double b = input.nextInt();
        double c = input.nextInt();
        System.out.println("1st root is:");
        System.out.println(((-Math.pow((Math.pow(b,2)-(4*a*c)),1/2)-b)/2*a));
        System.out.println(((+Math.pow((Math.pow(b,2)-(4*a*c)),1/2)-b)/2*a));
        */

        /*Scanner input = new Scanner(System.in);
        System.out.print("Enter an age");
        double age = input.nextInt();
        if(age>10){
            System.out.println("you can get bike");
        
        }
        if (age<10){
            System.out.println("enter an kid's height ");
            double height = input.nextDouble();
            if (height>120){
            System.out.println ("kid can get a bike");
               
        }
        if (height<120){
            System.out.println("kid can't get bike gtfo");
        }
    }*/
        Scanner input = new Scanner(System.in);
        System.out.println("enter your choice rock(1), paper(2) or scissor(3)");
        int number1 = input.nextInt();
        Random random=new Random();
        int min = 1;
        int max = 3;
        int ran = (random.nextInt(max-min+1)+min);
       if (number1 == 2){
        if (ran==3){
            System.out.println("lose");
            
        }
       }
        

        







    }
}
