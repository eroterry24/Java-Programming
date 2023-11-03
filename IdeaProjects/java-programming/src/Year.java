import javax.swing.*;
import java.util.Scanner;

public class Year {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter year");
        int yearVariable = input.nextInt();


        if (yearVariable % 4 == 0){
        System.out.println(" is a leap year");
        }
           else {
        System.out.println("Not a leap year");

           }






    }
}
