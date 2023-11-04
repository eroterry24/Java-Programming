public class LargeAndSmallNumba {


    public static void main(String[] args) {
//     Create an array of numbers

       int [] numberArray = {3, 4, 21, 98, 4, 1};


       int smallestNumber = numberArray[0];// Assume the first element is the minimum
       int largestNumber = numberArray[0];// Assume the first element is the maximum

//       then i looped over the array. Giving it the starting point and the ending point
       for (int index = 1; index < numberArray.length; index++){
           if (numberArray[index] < smallestNumber) {
               smallestNumber = numberArray[index];
           }
           if (numberArray[index] > largestNumber){
               largestNumber = numberArray[index];


           }
       }
        System.out.println("The largest number is" + largestNumber);
        System.out.println("The smallest number is " + smallestNumber);
    }


}
