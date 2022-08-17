// Fig. 5.2: ForCounter.java
// Counter-controlled iteration with the for iteration statement.

public class ForCounter{
   public static void main(String[] args) {
      // for statement header includes initialization,
      // loop-continuation condition, and increment
      for (int i = 1; i <= 10; i++){
         System.out.printf("%d ", i);
      }

      System.out.println("\nOut of the for loop");
   }
}
