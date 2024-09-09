import java.util.Scanner;

public class may07 {

    public static void main(String[] args) {
        double totalBill = 0;
        Scanner sc = new Scanner(System.in);
        // entering number of people
        System.out.printf("Enter the number of people:" );
        int numOfPeople = sc.nextInt();
        // entering price of each food
        System.out.printf("Enter the price of each food");
        // for loop used to show input of price of each and the input stop when user
        // inputs 0 or something less than that
        for (int i = 1;; i++) {
            double priceOfFood = sc.nextDouble();
            if (priceOfFood <= 0) {
                break;
            }
            totalBill += priceOfFood;
        }
        // cost per person
        double costperPerson = totalBill / numOfPeople;
        System.out.printf("Total: %.2f CAD\n", totalBill);
        System.out.println("Divided by" + numOfPeople + ":" + costperPerson + " " + "CAD");
    }
}
