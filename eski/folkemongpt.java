
import java.util.Random;
import java.util.Scanner;

public class folkemongpt {
    public static void main(String[] args) {
        Scanner opt = new Scanner(System.in);
        System.out.println("Test your folkemon card with two type attack\n " +
                "Attack 1: Flip 2 coins, if both are heads this attack does 60 damage" +
                ", otherwise this attack does nothing.\n Attack 2: Flip 2 coins. This attack" +
                "does 50 damage plus 20 more damage for each heads.");

        // Kullanıcıdan saldırı türünü seçmesi isteniyor.
        int typeofattack = opt.nextInt();

        // Girilen saldırı türünün geçerli olup olmadığı kontrol ediliyor.
        if (typeofattack < 1 || typeofattack > 2) {
            System.out.println("Invalid value entered");
            System.exit(0);
        }

        // Kullanıcıdan atışlar için giriş yapılması isteniyor.
        System.out.println("If you want to throw heads, enter '0'\nIf you want to throw tails, enter '1'\nIf you want to throw randomly, enter '2");

        int typeofthrow1 = opt.nextInt();
        int typeofthrow2 = opt.nextInt();

        // Girilen atışların geçerli olup olmadığı kontrol ediliyor.
        if ((typeofthrow1 < 0 || typeofthrow1 > 2) || (typeofthrow2 < 0 || typeofthrow2 > 2)) {
            System.out.println("Invalid value has been entered");
            System.exit(0);
        }

        // Rastgele atışlar yapılıyor
        Random random = new Random();

        if (typeofthrow1 == 2) {
            typeofthrow1 = random.nextInt(2);
        }
        
        if (typeofthrow2 == 2) {
            typeofthrow2 = random.nextInt(2);
        }

        // Atışların string karşılıkları atanıyor.
        String strtypeofthrow1 = (typeofthrow1 == 0) ? "heads" : "tails";
        String strtypeofthrow2 = (typeofthrow2 == 0) ? "heads" : "tails";

        // Hasar hesaplanıyor
        double damage = 0;

        if (typeofattack == 1 && typeofthrow1 == 1 && typeofthrow2 == 1) {
            damage += 60;
        } else if (typeofattack == 2) {
            damage += 50;
            if (typeofthrow1 != typeofthrow2) {
                damage += 20;
            }
        }

        // Sonuçlar ekrana yazdırılıyor.
        System.out.println("1st throw is " + strtypeofthrow1 +
                "\n2nd throw is " + strtypeofthrow2 + "\nTotal damage = " + damage);
    }
}
