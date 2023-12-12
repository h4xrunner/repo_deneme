import java.util.Scanner;

public class deneme4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaçıncı denemede 4'ü elde etmek istediğinizi girin: ");
        int k = scanner.nextInt();

        if (k <= 0) {
            System.out.println("Hatalı giriş. Pozitif bir tam sayı giriniz.");
        } else {
            double p = 1.0 / 6.0; // Tek bir denemede 4'ü elde etme olasılığı (1/6)

            double probability = Math.pow((1 - p), (k - 1)) * p;

            System.out.println("4'ü ilk kez deneme " + k + " sırasında elde etme olasılığı: " + probability);
        }

        scanner.close();
    }
}