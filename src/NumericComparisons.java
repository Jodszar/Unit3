import java.util.Scanner;
public class NumericComparisons {

        public static boolean isOdd(int num) {
            return num % 2 != 0;
        }

        public static boolean isZero(int num) {
            return num == 0;
        }
        public static boolean isPositive(int num) {
            return num > 0;
        }
        public static boolean isNegative(int num) {
            return num < 0;
        }
        public static boolean isNonNegative(int num) {
            return num >= 0;
        }
        public static boolean isNonPositive(int num) {
            return num <= 0;
        }


        public static void main(String[] args ) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        System.out.println(isOdd(num1));
        System.out.println(isZero(num1));
        System.out.println(isPositive(num1));
        System.out.println(isNegative(num1));
        System.out.println(isNonNegative(num1));
        System.out.println(isNonPositive(num1));


        

    }
}
