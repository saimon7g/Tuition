import java.util.Scanner; 

public class class2 {

    public static void main(String[] args) {
        
        int a;
        float b;
        // double c;
        // boolean test; 
       
        // something like scanf("%d", &a);

        Scanner sc; // scannner object declaration
        sc = new Scanner(System.in); // scanner object initialization

        
        // test = sc.hasNextInt();

        // if(test == false){
        //     System.out.println("You did not enter an integer");
        //     System.exit(0);
        // }
        // else{
        //     a= sc.nextInt();
        //     System.out.println("You entered an integer: " + a);
        // }

        System.out.println("Enter a integer: ");
        a= sc.nextInt();
        System.out.println("You entered an integer: " + a);

        System.out.println("Enter a float: ");
        b= sc.nextFloat();
        System.out.println("You entered a float: " + b);

        System.out.println("Enter a string: ");
        sc.nextLine(); // to clear the buffer
        String str = sc.nextLine();
        System.out.println("You entered: " + str);


        System.out.println("Sum of a and b: " + (a+b)); // addition
        System.out.println("String addition: " + str + a); // concatenation












        sc.close();







    }
    
}
