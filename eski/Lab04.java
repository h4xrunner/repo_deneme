import java.util.Scanner;


public class Lab04 {
    public static void main(String[] args){
        Scanner opt = new Scanner(System.in);
        /*System.out.println("Enter (x1)");
        double x1 = Math.toRadians(opt.nextDouble());
        double y1 = Math.toRadians(opt.nextDouble());
        System.out.println("enter the next point");
        double x2 = Math.toRadians(opt.nextDouble());
        double y2 = Math.toRadians(opt.nextDouble());
        final double RADIUS = 6371.01;

        double sinMult = Math.sin(x1) * Math.sin(x2);*/
        /*String input = opt.next();
        if  (input.length()!=1){
            System.out.println("Error: Invalid input");
        }
        else {
            char grade = input.charAt(0);
            if (Character.isLetter(grade)){
                grade = Character.toUpperCase(grade);
                
                if (grade <= 'F' && grade != 'E') {
                    int value = grade == 'F' ? 0: 'E' - grade;

                 }
            }
            
        }
    */
        System.out.println("enter a name");
        String name1 = opt.next();
        System.out.println("enter a name too");
        String name2 = opt.next();
        if (name1.equals(name2)){
            System.out.println("names are the same");
        }
        else {
            System.out.println("names are not the same");
        }
        System.out.println(name1+ " has " + name1.length() + " letter");
        System.out.println(name2+ " has " + name2.length() + " letter");
        System.out.print("the last letters:  " + name1.charAt(name1.length()-1)+ "  " +
        name2.charAt(name2.length() - 1));
    
    }
        
            
        }
















