import java.util.Scanner;
// import static java.lang.Math.pow;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println(" Hello, World! This is my first Java program. ");

        // double myDouble;
        // int myInt;
        boolean hasInt=false;
        int myNumber=0;

        Scanner sc; // scannner object declaration
        sc = new Scanner(System.in); // scanner object initialization
        System.out.println("Enter a number: ");
        hasInt = sc.hasNextInt();
        if( hasInt){

            myNumber = sc.nextInt();
            System.out.println("You entered: " + myNumber);
        }
        else {

            System.out.println("You did not enter a integer");
            System.out.println("You entered: " + myNumber);
        }


        // myDouble=56.87;
        // System.out.println("myDouble: " + myDouble);
    
        // myInt= (int) myDouble;
        // System.out.println("myInt: " + myInt);

        // myInt = 87;
        // myDouble= (double) myInt;
        // System.out.println("myDouble: " + myDouble);

        //  Hello it is "Saimon" \t \n 


        // System.out.print("this is \"Saimon\"  this is backslash \\ ");


        int a=5;
        int b= 10;
        double c= Math.pow(a, b);
        System.out.println(c);









        sc.close();

    }
}





