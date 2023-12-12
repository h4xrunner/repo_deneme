import java.util.Scanner;

public class Ex03_alternative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Yemek ve içecek seçeneklerini tanımlayın
        String[] meals = {"Doner", "Kebab", "Lahmacun"};
        int[] mealPrices = {80, 110, 75};
        
        String[] drinks = {"Ayran", "Kola", "Salgam"};
        int[] drinkPrices = {10, 20, 15};

        // Kullanıcıya seçenekleri gösterin
        System.out.println("Yemek seçenekleri:");
        for (int i = 0; i < meals.length; i++) {
            System.out.println((i + 1) + ". " + meals[i] + " " + mealPrices[i] + "tl");
        }

        System.out.println("İçecek seçenekleri:");
        for (int i = 0; i < drinks.length; i++) {
            System.out.println((i + 1) + ". " + drinks[i] + " " + drinkPrices[i] + "tl");
        }

        // Kullanıcıdan seçimleri alın
        int mealChoice = getUserChoice("Yemek seçeneğini girin (1-3): ", 1, 3, scanner);
        int drinkChoice = getUserChoice("İçecek seçeneğini girin (1-3): ", 1, 3, scanner);

        // Seçilen yemek ve içeceğin adını ve fiyatını alın
        String selectedMeal = meals[mealChoice - 1];
        String selectedDrink = drinks[drinkChoice - 1];
        int mealPrice = mealPrices[mealChoice - 1];
        int drinkPrice = drinkPrices[drinkChoice - 1];

        // Toplam maliyeti hesaplayın
        int totalCost = mealPrice + drinkPrice;

        // Sonucu yazdırın
        System.out.println(selectedMeal + " and " + selectedDrink + " is " + totalCost + "tl");
    }

    // Kullanıcının geçerli bir seçim yapmasını sağlayan yardımcı fonksiyon
    private static int getUserChoice(String prompt, int min, int max, Scanner scanner) {
        int choice;
        do {
            System.out.print(prompt);
            choice = scanner.nextInt();
        } while (choice < min || choice > max);
        return choice;
    }
}
