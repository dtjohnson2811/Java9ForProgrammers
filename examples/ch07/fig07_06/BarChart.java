// Fig. 7.6: BarChart.java
// Bar chart printing program.

public class BarChart {
   public static void main(String[] args) {
      int[] array = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};

      System.out.println("Grade distribution:");

      // for each array element, output a bar of the chart 
      for (int counter = 0; counter < array.length; counter++) {
         // ouput bar label ("00-09: ", ... , "90-99:" , "100:")
         if (counter == 10) {
            System.out.printf("%5d: ", 100);
         }
         else {
            System.out.printf("%2d-%02d: " ,
            counter * 10, counter * 10 + 9);
         }
         
         // print bar of asterisks
         for (int stars = 0; stars < array[counter]; stars++) {
            System.out.print("*");
         }

         System.out.println();
      }
   }
}
