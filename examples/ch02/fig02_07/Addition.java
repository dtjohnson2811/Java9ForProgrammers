// Fig. 2.7 Addition.java
//Addition program that inputs two numbers then displays their sum.
import java.util.Scanner; //program usses class scanner

public class Addition {
   // main method begins execution of Java applications
   public static void main(String[] args) {
      //create a Scanner to obtain input from the command window
      Scanner input = new Scanner(System.in);

      System.out.print("Enter your first integer: "); //prompt
      int number1 = input.nextInt(); //read first number from user

      System.out.print("Enter your second integer: "); //prompt
      int number2 = input.nextInt(); // read second number from user

      int sum = number1 + number2; // add numbers, then store the total in sum

      System.out.printf("Sum is %d%n", sum); // display sum
   } // end method main
} // end class Addition