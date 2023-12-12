import java.util.Scanner;

public class Ex02_20220808047 {
    /**
     * @param args
     */
    public static void main(String[] args) {
    //the second to last digit of the entered integer
    Scanner hane2 = new Scanner(System.in);
    System.out.println("enter a number for last 2 digit: ");
    int num = hane2.nextInt();
    System.out.println((num%100- num%10)/10);
     
    //how much price we heave to pay in internet cafe
    System.out.println("enter the passed minutes in internet cafe:");
   
    //m = passed minutes
    int m = hane2.nextInt();
    //rp = real price
    double rp= m*(5.0/6);
    //fp = fake price
    int fp = (((m/60)+1)*50);
    System.out.println("you have to pay "+ fp+ "tl but you should to pay " + rp);
    
    
    //throw dice to get 4
    
    System.out.println("enter the number of times you will try to get 4 for the first time: ");
    int k = hane2.nextInt();
    double p = 1.0/6;
    double rs = (Math.pow((1.0-p), (k-1.0))*p);
    System.out.print("The probability of getting 4 on the first try "+ k + " is "+  rs);
    hane2.close();
    System.exit(0);



        
   
















    }
}
