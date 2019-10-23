import java.util.Scanner;
public class FindLargest {
    public static void main(String[] args){

        Scanner fl = new Scanner(System.in);
        System.out.println("Enter the first Number: ");
        int num1 = fl.nextInt();
        System.out.println("Enter the second Number: ");
        int num2= fl.nextInt();

        if (num2>num1)
        {
            System.out.println(num2+ " is bigger than " +num1);
        }

        if(num1==num2)
        {
            System.out.println(num1+ " and " +num2 +" are equal ");
        }

        if(num1>num2)
        {
            System.out.println(num1+ " is larger than " +num2);
        }





 }
}
