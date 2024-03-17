public class class3 {
    public static void main(String[] args) {

        // example of for loop
        // for( int i=0 ; i<10 ; i+=2){

        //     //statement
        //     System.out.println("this a print statement" + i);
        //     if( i < 5){
        //         System.out.println("i is less than 5");
        //     }
        //     else
        //     {
        //         System.out.println("i is greater than 5");
        //     }
        // }

        // int i=0;

        // while(i<-1){
        //     //statement
        //     System.out.println("this a print statement" + i);
        //     if( i < 5){
        //         System.out.println("i is less than 5");
        //     }
        //     else
        //     {
        //         System.out.println("i is greater than 5");
        //     }
        //     i+=2;
        // }
        // i=0;

        // do {

        //     System.out.println("this a print statement" + i);
        //     if( i < 5){
        //         System.out.println("i is less than 5");
        //     }
        //     else
        //     {
        //         System.out.println("i is greater than 5");
        //     }
            
        // } while (i<-1);




        // int[] intArray = new int[10];

        // intArray[0]  equivalent to  intArray;

        // intArray[0] = 21;
        // intArray[1] = 22;
        // intArray[2] = 23;
        // intArray[3] = 24;
        // intArray[4] = 25;
        // intArray[5] = 26;
        // intArray[6] = 27;
        // intArray[7] = 28;
        // intArray[8] = 29;
        // intArray[9] = 30;

        // for(int i=0; i<10; i++){
        //     intArray[i] = 21+i;
        // }

        // System.out.println(intArray[0]);
        // System.out.println(intArray[1]);
        // System.out.println(intArray[2]);
        // System.out.println(intArray[3]);
        // System.out.println(intArray[4]);
        // System.out.println(intArray[5]);
        // System.out.println(intArray[6]);
        // System.out.println(intArray[7]);
        // System.out.println(intArray[8]);
        // System.out.println(intArray[9]);



        // for(int i=0; i<10; i++){
        //     System.out.println(intArray[i]);
        // }



        // int[] arr = {5, 2, 5, 3,9,11};

        // int length = arr.length;

        // for(int i=0; i<length; i++){
        //     System.out.println(arr[i]);
        // }

        // int i=3;


        // System.out.println(arr[i]);


        // int a=7;
        // int b=a;

        // System.out.println(a);
        // System.out.println(b);

        // a=10;
        // System.out.println(a);
        // System.out.println(b);

        // b=15;
        // System.out.println(a);
        // System.out.println(b);






        int[] arr1={1,2,3,4,5};
        int[] arr2=arr1;
        System.out.println("array 1");

        for(int i=0; i<5; i++){
            System.out.print (" "+arr1[i]);
        }
        System.out.println();
        System.out.println("array 2");
        for(int i=0; i<5; i++){
            System.out.print (" "+arr2[i]);
        }

        arr1[0]=27;

        System.out.println();
        System.out.println("array 1");
        for(int i=0; i<5; i++){
            System.out.print (" "+arr1[i]);
        }
        System.out.println();
        System.out.println("array 2");
        for(int i=0; i<5; i++){
            System.out.print (" "+arr2[i]);
        }













    
        
    }
    
}
