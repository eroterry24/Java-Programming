import java.util.Scanner;

public class Age {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter age");
        int age = input.nextInt();

        if (age >= 18){
            System.out.println("you are an adult");

        }
        else {
            System.out.println(" you are not an adult");
        }
    }
}

