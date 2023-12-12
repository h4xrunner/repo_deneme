import java.util.Random;
import java.util.Scanner;
public class folkemon {
    public static void main(String[] args){
        Scanner opt = new Scanner(System.in);
        System.out.println("Test your folkemon card with two type attack\n " +
        "Attack 1: Flip 2 coins, if both are heads this attack does 60 damage" +
        ", otherwise this attack does nothing.\n Attack 2: Flip 2 coins. This attack" +
        "does 50 damage plus 20 more damage for each heads.");
        //Expecting select type of attack from user
        int typeofattack = opt.nextInt();
        //Controlling invalid value or valid valid value
        if (typeofattack<1 || 3<typeofattack) {
             System.out.print("invalid value entered");
            System.exit(0);
        }
        //Waiting enter the type of throws
        System.out.println(" if you want throw heads, enter '0'\n if you want"+
        " throw tails, enter '1'\n if you want throw random, enter '2'");
        int typeofthrow1 = opt.nextInt();
        //Waiting for enter the type of throw 2
        System.out.println("enter the second throw like upper");
        int typeofthrow2 = opt.nextInt();
        //Controlling entered value invalid or valid
        if ((typeofthrow1 < 0 || typeofthrow1 > 2) || (typeofthrow2 < 0 || typeofthrow2 > 2)) {
            System.out.println("Invalid value has been entered");
            System.exit(0);
        }
        //Random throw creating
        if (typeofthrow1 == 2) {
             Random random = new Random();
            typeofthrow1 = random.nextInt(2);
        }
         if (typeofthrow2 == 2) {
             Random random = new Random();
            typeofthrow2 = random.nextInt(2);
        }
        //I defined type of throws to string
        String strtypeofthrow1 = (typeofthrow1 == 0) ? "heads" : "tails";
        String strtypeofthrow2 = (typeofthrow2 == 0) ? "heads" : "tails";
        double damage = 0;
        //one way of the start 1st attack
        if (typeofattack == 1 && typeofthrow1 == 1 && typeofthrow2 == 1) {
                damage += 60;
        }
        else if (typeofattack == 2) {
            damage += 50;
            if (typeofthrow1 == 1 ^ typeofthrow2 ==1) {
                damage +=20;
            }
            else if (typeofthrow1 == 1 && typeofthrow2 == 1) {
                    damage += 40;
                }
        }
        System.out.println(" 1. throw is " + strtypeofthrow1 +
        " 2. throw is " + strtypeofthrow2 + " Total damage = " + damage);
    }
}
