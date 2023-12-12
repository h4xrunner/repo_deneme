import java.util.Scanner;

public class gpt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double qp, hp, mp, fp;

        qp = getValidPercentage("Quizzes (%): ", scanner);
        hp = getValidPercentage("Homeworks (%): ", scanner);
        mp = getValidPercentage("Midterm exam (%): ", scanner);
        fp = getValidPercentage("Final exam (%): ", scanner);

        if (qp + hp + mp + fp != 100) {
            System.out.println("ERROR: The sum of percentages must be 100");
            System.exit(0);
        }

        double q, h, m, f;

        q = getValidScore("Quizzes: ", scanner);
        h = getValidScore("Homeworks: ", scanner);
        m = getValidScore("Midterm: ", scanner);
        f = getValidScore("Final: ", scanner);

        System.out.println("Weight of the grades:");
        double qWeighted = q * qp;
        double hWeighted = h * hp;
        double mWeighted = m * mp;
        double fWeighted = f * fp;

        System.out.println("Quizzes: " + qWeighted);
        System.out.println("Homeworks: " + hWeighted);
        System.out.println("Midterm: " + mWeighted);
        System.out.println("Final: " + fWeighted);

        double sc = qWeighted + hWeighted + mWeighted + fWeighted;
        double gpa = calculateGPA(sc);
        String gradeLetter = calculateGradeLetter(gpa);

        System.out.println("İbrahim Gül passed CSE 101 with a score of: " + sc + ", GPA points of " + gpa + ", a grade letter of " + gradeLetter);

        // Scanner'ı kapatmayı unutmayın.
        scanner.close();
    }

    private static double getValidPercentage(String prompt, Scanner scanner) {
        double percentage;
        do {
            System.out.print(prompt);
            percentage = scanner.nextDouble() / 100;
            if (percentage < 0 || percentage > 1) {
                System.out.println("ERROR: Invalid value entered (must be between 0 and 100)");
            }
        } while (percentage < 0 || percentage > 1);
        return percentage;
    }

    private static double getValidScore(String prompt, Scanner scanner) {
        double score;
        do {
            System.out.print(prompt);
            score = scanner.nextDouble();
            if (score < 0 || score > 100) {
                System.out.println("ERROR: Invalid value entered (must be between 0 and 100)");
            }
        } while (score < 0 || score > 100);
        return score;
    }

    private static double calculateGPA(double score) {
        if (score >= 88) return 4.0;
        if (score >= 81) return 3.5;
        if (score >= 74) return 3.0;
        if (score >= 67) return 2.5;
        if (score >= 60) return 2.0;
        if (score >= 53) return 1.5;
        if (score >= 46) return 1.0;
        if (score >= 35) return 0.5;
        return 0.0;
    }

    private static String calculateGradeLetter(double gpa) {
        if (gpa == 4.0) return "AA";
        if (gpa == 3.5) return "BA";
        if (gpa == 3.0) return "BB";
        if (gpa == 2.5) return "CB";
        if (gpa == 2.0) return "CC";
        if (gpa == 1.5) return "DC";
        if (gpa == 1.0) return "DD";
        if (gpa == 0.5) return "FD";
        return "FF";
    }
}