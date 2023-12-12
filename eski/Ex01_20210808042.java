public class Ex01_20210808042 {


    public static void main(String[] args){

        //Exercise1
        System.out.println("a " + "a^2 " + "a^3 ");
        System.out.println((int)Math.pow(1,1) + "  " + (int)Math.pow(1,2) + "   " + (int)Math.pow(1,3));
        System.out.println((int)Math.pow(2,1) + "  " + (int)Math.pow(2,2) + "   " + (int)Math.pow(2,3));
        System.out.println((int)Math.pow(3,1) + "  " + (int)Math.pow(3,2) + "   " + (int)Math.pow(3,3));
        System.out.println((int)Math.pow(4,1) + "  " + (int)Math.pow(4,2) + "  " + (int)Math.pow(4,3));
        //Exercise2
        System.out.println("(9.5*4.5-2.5*3)/(45.5-3.5)= " +(9.5*4.5-2.5*3)/(45.5-3.5));
        //Exercise3
        float a;
        float b = 0;
        float aproximatellyPi1 = 0;
        for (float i = 1; i<10; i+=4){

            a = (1/i)-(1/(i+2));

            b += a;
        }
        aproximatellyPi1 = 4*b;
        System.out.println("Pi1= " +aproximatellyPi1);
        double aproximatellyPi2 =4.0*(1.0-(1.0/3) + (1.0/5) -(1.0/7)+(1.0/9)-(1.0/11) + (1.0/13));
        System.out.println("Pi2= " +aproximatellyPi2);

        //Exercise4
        System.out.println("perimeter of circle with aproximatellyPi1= " + 2*aproximatellyPi1*5.5);
        System.out.println("perimeter of circle with aproximatellyPi2 = " + 2*aproximatellyPi2*5.5);
        System.out.println("the area of circle with aproximatellyPi1= " + aproximatellyPi1*Math.pow(5.5,2));
        System.out.println("the area of circle with aproximatellyPi2 = " + aproximatellyPi2*Math.pow(5.5,2));
        //Exercise5
        double x=((44.5*0.55-50.2*5.9)/(3.4*0.55-50.2*2.1));
        double y=((3.4*5.9-44.5*2.1)/(3.4*0.55-50.2*2.1));
        System.out.println("x= "+x);
        System.out.println("y= "+y);
        double e = (3.4*x)+(50.2*y);
        double f = (2.1*x)+(0.55*y);
        System.out.println("e= "+e);
        System.out.println("f= "+f);

    }
}
