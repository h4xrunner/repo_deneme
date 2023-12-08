import java.util.Scanner;

/*
* @author Cem Ali Görmez
* @since 12.11.2023
*/

public class deneme {
 
    static Scanner scan = new Scanner(System.in);

    static void main() {
    String cat1,cat2,cat3,cat4,cat5;
    int q1,q2,q3,q4,q5,w1,w2,w3,w4,w5;
    double p1,p2,p3,p4,p5;
    p1 = p2 = p3 = p4 = p5 = 0;
    
    System.out.println("******** Category Information Entry ********");
    System.out.println();
    
    System.out.println("Please enter the name of the category 1:");
    cat1 = formatCategoryName(scan.nextLine());
    
    
    do {
        System.out.println("Please enter how many items of type " + cat1 + " were given:");
        q1 = scan.nextInt();
    } while (!isQuantityValid(q1));

    
    do {
        System.out.println("Please enter the percentage weight of " + cat1 + ":");
        w1 = scan.nextInt();
    } while (!isWeightValid(w1, 0));

    scan.nextLine();
    
    System.out.println("Please enter the name of the category 2:");
	cat2 = formatCategoryName(scan.nextLine());
	
	
    do {
        System.out.println("Please enter how many items of type " + cat2 + " were given:");
        q2 = scan.nextInt();
    } while (!isQuantityValid(q2));
    
    
    do {
        System.out.println("Please enter the percentage weight of " + cat2 + ":");
        w2 = scan.nextInt();
    } while (!isWeightValid(w2, w1));
    
    scan.nextLine();
	
    System.out.println("Please enter the name of the category 3:");
	cat3 = formatCategoryName(scan.nextLine());
	
    do {
        System.out.println("Please enter how many items of type " + cat3 + " were given:");
        q3 = scan.nextInt();
    } while (!isQuantityValid(q3));

    
    do {
        System.out.println("Please enter the percentage weight of " + cat3 + ":");
        w3 = scan.nextInt();
    } while (!isWeightValid(w3, w1 + w2));
	
    scan.nextLine();
	
	System.out.println("Please enter the name of the category 4:");
	cat4 = formatCategoryName(scan.nextLine());
	
	
    do {
        System.out.println("Please enter how many items of type " + cat4 + " were given:");
        q4 = scan.nextInt();
    } while (!isQuantityValid(q4));

    
    do {
        System.out.println("Please enter the percentage weight of " + cat4 + ":");
        w4 = scan.nextInt();
    } while (!isWeightValid(w4, w1 + w2 + w3));
	
    scan.nextLine();
    
	System.out.println("Please enter the name of the category 5:");
	cat5 = formatCategoryName(scan.nextLine());
    
	
    do {
        System.out.println("Please enter how many items of type " + cat5 + " were given:");
        q5 = scan.nextInt();
    } while (!isQuantityValid(q5));

    
    do {
        System.out.println("Please enter the percentage weight of " + cat5 + ":");
        w5 = scan.nextInt();
    } while (!isWeightValid(w5, w1 + w2 + w3 + w4));
   
    System.out.println();
    System.out.println();
    
    if(w1 + w2 + w3 + w4 + w5 == 100) {
    System.out.println("******** Student Grades Entry ********");
    System.out.println();   
    System.out.println("Please enter values that the student earned for each item:");

    for(int i = 1 ; i - 1 < q1 ; i++) {
    System.out.println(cat1 + " " + i + ":");
    p1 += scan.nextDouble();
    }

    for(int i = 1 ; i - 1 < q2 ; i++) {
    System.out.println(cat2 + " " + i + ":");
    p2 += scan.nextDouble();
    }
    
    for(int i = 1 ; i - 1 < q3 ; i++) {
    System.out.println(cat3 + " " + i + ":");
    p3 += scan.nextDouble();
    }
    
    for(int i = 1 ; i - 1 < q4 ; i++) {
    System.out.println(cat4 + " " + i + ":");
    p4 += scan.nextDouble();
    }
    
    for(int i = 1 ; i - 1 < q5 ; i++) {
    System.out.println(cat5 + " " + i + ":");
    p5 += scan.nextDouble();
    }

    System.out.println();
    System.out.println();
    System.out.println("******* Student Results *******");
    System.out.println();
    System.out.println(cat1 + ": " + p1/q1);
    System.out.println(cat2 + ": " + p2/q2);
    System.out.println(cat3 + ": " + p3/q3);
    System.out.println(cat4 + ": " + p4/q4);
    System.out.println(cat5 + ": " + p5/q5);
    System.out.println("The student has "
    + status((p1/q1*w1 + p2/q2*w2 + p3/q3*w3 + p4/q4*w4 + p5/q5*w5)
    / w1 + w2 + w3 + w4 + w5) + " CSE 101 with a score of "
    + (p1/q1*w1 + p2/q2*w2 + p3/q3*w3 + p4/q4*w4 + p5/q5*w5)
    / w1 + w2 + w3 + w4 + w5 + ", GPA points of "
    + gpaPoints((p1/q1*w1 + p2/q2*w2 + p3/q3*w3 + p4/q4*w4 + p5/q5*w5)
    / w1 + w2 + w3 + w4 + w5) + ", and a grade letter of "
    + gradeLetter((p1/q1*w1 + p2/q2*w2 + p3/q3*w3 + p4/q4*w4 + p5/q5*w5)
    / w1 + w2 + w3 + w4 + w5) + ".");
    
    
    }
    else {
    System.out.println("ERROR: The values sum to " + (w1 + w2 + w3 + w4 + w5) + " but should sum to 100.");	
    }

    }
    
    
    static String formatCategoryName(String name) {
        return (name.charAt(0) + "").toUpperCase()
.concat(name.substring(1).toLowerCase());
    }

    
    
    static boolean isQuantityValid(int quantity) {
        return (quantity>0) ? true : false;
    }

    
    
    static boolean isWeightValid(int weight, int totalWeight){
    	return (weight + totalWeight <= 100 && weight >= 0) ? true : false;
    }
    
    
    
    static String gradeLetter(double grade) {
    	if (grade > 87)
    	    return "AA";
    	else if (grade > 80)
    	    return "BA";
    	else if (grade > 73)
    	    return "BB";
    	else if (grade > 66)
    	    return "CB";
    	else if (grade > 59)
    	    return "CC";
    	else if (grade > 52)
    	    return "DC";
    	else if (grade > 45)
    	    return "DD";
    	else if (grade > 34)
    	    return "FD";
    	else
    	    return "FF";
    }

    
    
    static double gpaPoints(double grade) {
    	if (grade > 87)
    	    return 4.0;
    	else if (grade > 80)
    	    return 3.5;
    	else if (grade > 73)
    	    return 3.0;
    	else if (grade > 66)
    	    return 2.5;
    	else if (grade > 59)
    	    return 2.0;
    	else if (grade > 52)
    	    return 1.5;
    	else if (grade > 45)
    	    return 1.0;
    	else if (grade > 34)
    	    return 0.5;
    	else
    	    return 0.0;
    }

    
    
    static String status(double grade) {
    	if (grade > 59)
    	    return "passed";
    	else if (grade > 45)
    	    return "conditionally passed";
    	else
    	    return "failed";
    }
    
   
    
    public static void main(String[] args) 

    main();   
        
    }
        
