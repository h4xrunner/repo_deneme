public class  Ex01_20220808047 {
    /**
     * @param args
     */
    // i defined the this function for the last exercise to use after
            static double xCalculator(double e, double d, double b, double f, double a, double c) {

                double x = ((e*d)-(b*f))/((a*d)-(b*c));

                return x;

            }
            static double yCalculator(double a, double b, double c, double d, double e, double f) {

                double y = ((a*f)-(e*c))/((a*d)-(b*c));

                return y;

            }

    public static void main(String[] args) {
// Exercise 1
            System.out.println("(1) - The following table");
        for (int i=1; i<5; i++){
            if (i==1){
                System.out.println("a a^2 a^3");
            }

            System.out.print(i);
            System.out.print((" ") + Math.pow(i,2));
            System.out.println((" ") + Math.pow(i,3));
        }

// Exercise 2
        System.out.println(("(2) - the result of process : ") + (9.5*4.5-2.5*3)/(45.5-3.5));
        // Exercise 3
        System.out.println(("(3) - a)the approximate value of pi : ") + (1.0-1.0/3+1.0/5-1.0/7+1.0/9-1.0/11)*4);
        System.out.println(("(3) - b)the more approximate value of pi : ") + 4*(1.0-1.0/3+1.0/5-1.0/7+1.0/9-1.0/11+1.0/13));
        // Exercise 4
        double pi =  4*(1.0-1.0/3+1.0/5-1.0/7+1.0/9-1.0/11+1.0/13);
        double r = (5.5);
        
        System.out.println(("(4) - The area of circle : ") +(pi*r*r));
        // Exercise 5
        System.out.println("(5) - value of x,y,e and f");
        System.out.println("3.4x + 50.2y = 44.5");
        System.out.println("2.1x + 0.55y = 5.9");
        
        
        
        double x = xCalculator(44.5,0.55,50.2,5.9,3.4,2.1);
        double y = yCalculator(3.4,50.2,2.1,0.55,44.5,5.9);
       
        System.out.println(("x = ") + x);
        System.out.println(("y = ") + y); 
        
        double e = (3.4*x)+(50.2*y);
        System.out.println(("e = ")+e);
        double f = (2.1*x)+(0.55*y);
        System.out.println(("f = ")+f);





        
    }
    
}
