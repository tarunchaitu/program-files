/* Program: Random number generator
 * Written by: Chaitanya from beginnersbook.com
 * Input: None
 * Output:Random number between o and 200*/
import java.util.*;
class GenerateRandomNumber {
   public static void main(String[] args) {
      int counter;
      Random rnum = new Random();
      /* Below code would generate 5 random numbers
       * between 0 and 200.
       */
      System.out.println("Random Numbers:");
      System.out.println("***************");
      System.out.println("***************");
      System.out.println("***************");
      System.out.println("***************");
      for (counter = 1; counter <= 5; counter++) {
         System.out.println(rnum.nextInt(200));
      }
   }
}
