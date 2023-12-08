import java.util.Scanner;

public class test {

    static int factorial (int n){
        int f = 1;
        for(int i = 2; i <= n; i ++)
        f *= i;
        return f;
    }
        

    public static void main(String[] args) {
        for(int i = 1; i <= 13; i++)
        System.out.println(i + "! = " + factorial(i));
}
}
        

