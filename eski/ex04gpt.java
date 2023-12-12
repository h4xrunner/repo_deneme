import java.util.Scanner;

public class ex04gpt {
    public static void main(String[] args) {
        Scanner ex04 = new Scanner(System.in);

        System.out.println("Enter the first city name:");
        String city1 = ex04.nextLine();

        System.out.println("Enter the second city name:");
        String city2 = ex04.nextLine();

        System.out.println("Enter the third city name:");
        String city3 = ex04.nextLine();

        int c1 = city1.hashCode();
        int c2 = city2.hashCode();
        int c3 = city3.hashCode();

        if (c1 < c2 && c1 < c3) {
            if (c2 < c3) {
                System.out.println(city1 + " " + city2 + " " + city3);
            } else {
                System.out.println(city1 + " " + city3 + " " + city2);
            }
        } else if (c2 < c1 && c2 < c3) {
            if (c1 < c3) {
                System.out.println(city2 + " " + city1 + " " + city3);
            } else {
                System.out.println(city2 + " " + city3 + " " + city1);
            }
        } else {
            if (c1 < c2) {
                System.out.println(city3 + " " + city1 + " " + city2);
            } else {
                System.out.println(city3 + " " + city2 + " " + city1);
            }
        }

        ex04.close();
    }
}
