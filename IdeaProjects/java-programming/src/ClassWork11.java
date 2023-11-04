public class ClassWork11 {

//    Write a Java program that counts the number of the even and odd number in an array


    public static void main(String[] args) {

//        when we have an array of number but there is no number in the array, by default the even
//          and odd will be 0 thats why we have "countEvenNumber" and " countOddNumber" = 0
        int countEvenNumber = 0;
        int countOddNumber = 0;
//
//        then i created array of integers

        int[] listOfNumber = {2, 5, 6, 22, 8, 32, 5, 84, 10,};

//      then i created a variable named Number variable to divide all the integers by 2 and
//        make sure the reminder is equals to 0, then count it as an even number



        for (int number : listOfNumber){

//          this the formula to generate even number
            if (number % 2 == 0){
//
//                then we said, if the reminder is equal 0, then count it as an even number

            countEvenNumber++;

//            else count it as an odd number

            }
        else
            countOddNumber++;


        }
        System.out.println("we have" + countEvenNumber + "even number");
//        System.out.println("we have" + countOddNumber + "odd number");

         }

    }
