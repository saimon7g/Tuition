import java.util.Scanner; 

public class class2 {

    public static void main(String[] args) {
        
        // int a;
        // float b;
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

        // System.out.println("Enter a integer: ");
        // a= sc.nextInt();
        // System.out.println("You entered an integer: " + a);

        // System.out.println("Enter a float: ");
        // b= sc.nextFloat();
        // System.out.println("You entered a float: " + b);

        // System.out.println("Enter a string: ");
        // sc.nextLine(); // to clear the buffer
        // String str = sc.nextLine();
        // System.out.println("You entered: " + str);


        // System.out.println("Sum of a and b: " + (a+b)); // addition
        // System.out.println("String addition: " + str + a); // concatenation

        // System.out.println("abc" + "2");
        // System.out.println(2 + 4 + "3");
        // System.out.println("3" + 2 + 4);
        // System.out.println("3" + 2 + 4 / 2);

        // a = (int) (5.0 / 2);

        // int array[] = new int[100];

        // array[0] = 10;
        // array[1] = 20;
        // array[2] = 30;
        // array[3] = 40;

        // int x= array[2] + array[3];

        // char ch[] = new char[100];
        // ch[0] = 'S';
        // ch[1] = 'a';
        // ch[2] = 'i';
        // ch[3] = 'm';
        // ch[4] = 'o';
        // ch[5] = 'n';

        // System.out.println(ch);

        // String str1 = "I Love Programming";
        // String str2 = "I Love programming";

        // System.out.println(str1.charAt(2));
        // System.out.println(str1.indexOf('o')); // first occurence
        // System.out.println(str1.lastIndexOf('o')); // last occurence

        // System.out.println(str.length());
        // System.out.println(str.toLowerCase());
        // System.out.println(str.toUpperCase());
        // System.out.println(str.substring(2, 6));
        // System.out.println(str);

        // if(str1.equalsIgnoreCase(str2)){
        //     System.out.println("Equal");
        // }
        // else{
        //     System.out.println("Not Equal");
        // }


        int studen1Mark=78;


        if(studen1Mark>40){
            System.out.println("Pass");
            if(studen1Mark>60){
                System.out.println("First Class");
                if(studen1Mark>80){
                    System.out.println("Distinction");
                }
                else{
                    System.out.println("No Distinction");
                }
            }
            else{
                System.out.println("Second Class");
            }
        }
        else{
            System.out.println("Fail");
            //no nothiing
        }




        





    















        sc.close();







    }
    
}
