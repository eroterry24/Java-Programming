import java.util.Scanner;

public class Abstract {
    public static void main(String[] args) {
        Scanner addNumber = new Scanner(System.in);

        System.out.println("Enter first number; ");
        int firstNumberResult = addNumber. nextInt();

        System.out.println("Enter second number; ");
        int secondNumberResult = addNumber.nextInt();

        int result = firstNumberResult + secondNumberResult;
        System.out.println(" the sum of the two is" + result);

    }
}
