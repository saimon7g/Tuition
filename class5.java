import java.util.ArrayList;
import java.util.Scanner;

public class class5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


       
        
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int sum1= getnext5sum(input1);
        int sum2= getnext5sum(input2);

        int average = (sum1+sum2)/2;
        System.out.println("Average of the sum of next 5 numbers: " + average);
    

    }

    private static int getnext5sum(int x){
        int sum=0;
        // sum+=x;
        // sum+=x+1;
        // sum+=x+2;
        // sum+=x+3;
        // sum+=x+4;

        for (int i = 0; i < 5; i++) {
            sum+=x+i;
        }

        System.out.println("Sum of next 5 numbers: " + sum);


        Math.sqrt(25);
        return sum;


    }

    //public access
    //private access
    //protected access

    // numer1*numer1 == givenNumber
    // process 2;

}
