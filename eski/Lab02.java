import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {

        /*Scanner in = new Scanner(System.in);
        System.out.print("please enter the celcius degree");
        double celcius = in.nextDouble();
        double Fahrenheith = 9/5 * celcius + 32;
        System.out.println("Fahrenheith " + Fahrenheith);*/

        /*Scanner input = new Scanner(System.in);
        System.out.println("please enter a radius ");
        double r = input.nextDouble();
        double area = r*r*3.14;
        System.out.println("enter a lenght");
        double l = input.nextDouble();
        double volume = area*l;
        System.out.print(volume);*/


        /*Scanner scanner = new Scanner(System.in);
        System.out.println("input radius");
        double radius = scanner.nextDouble();
        double area = Math.PI * (Math.pow(radius, 2));
        System.out.println("input a height");*/

        /*Scanner input = new Scanner(System.in);
        System.out.println("enter a number between 0 and 1000");
        int value = input.nextInt();
        
        System.out.println("islemin sonucu " + ((value /100) + ((value % 100)/10) + (value % 10)));*/
        
        /*Scanner time = new Scanner(System.in);
        System.out.println("enter a value of minutes");
        int value = time.nextInt();
        System.out.println(value%(24*60)%60);
        System.out.println((value%(60*24)) / 60);
        System.out.println(value/60/24);*/
//Exercise 11
        Scanner bodymass = new Scanner(System.in);
        System.out.println("enter your weight as pound ");
        double pound = bodymass.nextDouble();
        System.out.println("enter your height as inches ");
        double inc = bodymass.nextDouble(); 
        // pound = 0.45359237kg
        //inch = 0.0254m
        double kg = (pound*0.45359237);
        System.out.println("your weight as kg: "+ kg );
        double m = (inc*0.0254);
        System.out.println("your height as m: " + m );
        //i couldn't make a button to continue
        System.out.println("pres 0+enter to continue");
        double x = bodymass.nextDouble();
        System.out.println("your body mass index is :");
        System.out.print(kg/Math.pow(m,2));
    






    }



}
