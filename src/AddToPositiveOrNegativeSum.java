import java.util.Scanner;
public class AddToPositiveOrNegativeSum {
    public static void main(String[] args) {

        Scanner num= new Scanner(System.in);
        int posnum=0;
        int negnum=0;

        for (int i = 1; i <= 10; i++) {

            System.out.println("Enter s number: ");

            int number = num.nextInt();
            if (number > 0) {
                posnum += number;
            }
            if (number < 0) {
                negnum += number;
            }

        }
        System.out.println("The sum of the positive numbers is " +posnum);
        System.out.println("The sum of the negative numbers is " +negnum);

    }
}



