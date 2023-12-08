import java.util.Random;
import java.util.Scanner;
public class cafe {
    public static void main(String[] args) {
        Scanner opt = new Scanner(System.in);
        System.out.println("Meal options:\n1. Doner 80tl\n2. Kebab 110tl\n3. Lahmacun 75tl\nselect your food (1-3):");
        //waiting for enter a kind of meal from user
        int a = opt.nextInt();

        System.out.println("Drink options:\n1. Ayran 10tl\n2. Kola 20tl\n3. Salgam 15tl\nSelect your drink (1-3):");
        //Waiting for enter a kind of drink from user
        int b = opt.nextInt();
        if ((a < 1 || a > 3) || (b < 1 || b > 3)) {
            System.out.println("Invalid value entered");
            System.exit(0);
        }
        String selectedmeal = "";
        String selecteddrink = "";
        int selectedmealprice = 0;
        int selecteddrinkprice  = 0;
        if (a == 1){
            selectedmeal = "doner";
            selectedmealprice += 80;
        } else if (a == 2){
            selectedmeal = "Kebab";
            selectedmealprice += 110;
        } else if (a == 3){
            selectedmeal = "Lahmacun";
            selectedmealprice += 75;
        }
        if (b==1){
            selecteddrink = "Ayran";
            selecteddrinkprice += 10;
        } else if (b==2){
            selecteddrink = "Kola";
            selecteddrinkprice += 20;
        } else if (b==3){
            selecteddrink = "Salgam";
            selecteddrinkprice += 15;
        }
        int total = selecteddrinkprice+selectedmealprice;
        System.out.println(selectedmeal + " and " + selecteddrink + " is "+ total + " lira" );
        
        
        System.out.println("An internet provider has 2 types of membership."+
        " Type 1 has 100 GB quota for 80 lira and 3 lira per GB use  with 15% tax. "+
        "Type 2 has 200 GB qouta for 140 lira and 5 lira per GB with 10% tax."+
        " Which is your opinion 1 or 2? ");
        //ms = type of membership
        int ms = opt.nextInt();
        //tc = total cost
        double tc=0;
        double tax = 0;
        if (ms != 1 && ms != 2){
            System.exit(0);
        }else if (ms == 1 || ms == 2){
        System.out.println("Enter how much internet you will use:");
        double usage = opt.nextDouble();
                    //getting information for using  first type of membership
        if(ms == 1) {
                
                if (usage > 100) {
                    tax = ((80 + ((usage-100)*3))*15/100);
                    tc += 80 + ((usage-100)*3)+ tax;
                }
                else {
                    tax = (80*15/100);
                    tc += 80 + tax;
                }
                }        
                    //getting information for using  second type of membership
            if(ms==2){
                
                if (usage>200) {
                    tax = ((140 + ((usage-200)*5))*10/100);
                    tc += 140 + ((usage-200)*5)+ tax;
                }
                else {
                        tax = (140*10/100);
                        tc += 140 + tax;
                      }
                }
                }
                    System.out.println("you have to pay " + tc + " lira");

                    //folkeman card balance program
                    System.out.println("Test your folkemon card with two type attack\n " +
                    "Attack 1: Flip 2 coins, if both are heads this attack does 60 damage" +
                    ", otherwise this attack does nothing.\n Attack 2: Flip 2 coins. This attack" +
                    "does 50 damage plus 20 more damage for each heads.\n select your attack, 1 or 2");
                    //Expecting select type of attack from user
                    int typeofattack = opt.nextInt();
                    //Controlling invalid value or valid valid value
                    if (typeofattack<1 || 3<typeofattack) {
                         System.out.print("invalid value entered");
                        System.exit(0);
                    }
                    //Waiting enter the type of throws
                    System.out.println(" if you want throw tails, enter '0'\n if you want"+
                    " throw heads, enter '1'\n if you want throw random, enter '2'");
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
                    String strtypeofthrow1 = (typeofthrow1 == 0) ? "tails" : "heads";
                    String strtypeofthrow2 = (typeofthrow2 == 0) ? "tails" : "heads";
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
                    opt.close();
                    System.exit(0);      
            }
        }

 

