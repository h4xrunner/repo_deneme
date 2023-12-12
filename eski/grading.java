import java.util.Scanner;




public class grading {

    static double gracecalc(double q, double h, double m, double f) {

           double score = ((q/10)+(h/5)+(m*3/10)+(f*2/5));

            return score;



    }




    public static void main(String[] args){


       


        Scanner grading = new Scanner(System.in);
        System.out.println("enter your grades in this order--> quiz, homeworks, midterm exams, finalexam ");
        double score = grading.nextDouble(q) + grading.nextDouble(h);








    }




}
