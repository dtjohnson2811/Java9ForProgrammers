// Fig. 4.7: Analysis.java
// Analysis of examination results using nested control statements.
import java.util.Scanner; // class uses scanner

public class Analysis{
   public static void main(String[] args){
      // create a scanner to obtain input from command line 
      Scanner input = new Scanner(System.in);

      // initializing variables in declarations
      int passes = 0;
      int failures = 0;
      int studentCounter = 1;

      // process 10 students using counter-controlled loop
      while (studentCounter <= 10) {
         //prompt user for input and obtain value from
         System.out.print("Enter result (1 = pass, 2 = fail: ");
         int result = input.nextInt();

         if (result == 1 || result == 2){
            // if..else is nested in the while statement
            if (result == 1) {
               passes += 1;
               // System.out.println(passes);
            } else {
               failures += 1;
               // System.out.println(failures);
         } 
         // increment studentCounter so loop eventually terminates
         studentCounter += 1;
         // System.out.println(studentCounter);
      } else {
         System.out.println("Enter a 1 or 2 please.");
      }
   }

      // termination phase; prepare to display results
      System.out.printf("Passed: %d%nFailed: %d%n",  passes, failures);
      
      // determine whether more than 8 students passed
      if (passes > 8) {
         System.out.println("Bonus to the instructor!");
      }

      input.close();
   }
}