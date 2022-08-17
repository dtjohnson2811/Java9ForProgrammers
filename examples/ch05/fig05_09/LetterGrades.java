// Fig. 5.9: LetterGrades.java
// LetterGrades class uses the switch statement to count letter grades.
import java.util.Scanner;

public class LetterGrades{
   public static void main(String[] args){
      int total = 0; // used for the sum of grades
      int gradeCounter = 0; // the number of grades entered
      int aCount = 0; //the count of A grades
      int bCount = 0; // the count of B grades
      int cCount = 0; // the count of C grades
      int dCount = 0; // the count of D grades
      int fCount = 0; // the count of F grades

      Scanner input = new Scanner(System.in); // declaring a Scanner to take input from the user

      System.out.printf("%s%n%s%n   %s%n   %s%n",
         "Enter the integer grades in the range 0-100.",
         "Type the end-of-file indicator to terminate input:",
         "On UNIX/Linux/macOS type <Ctrl> d then press Enter",
         "On windows type <Ctrl> z then press Enter");

         // loop until user enters the end-of-file indicator
         while(input.hasNext()) {
            int grade = input.nextInt(); // read grade
            total += grade; // add grade to total
            ++gradeCounter; // incrememnt number of grades

            // increment appropriate letter-grade counter
            switch (grade / 10) { //the controlling expression here performs integer division which truncates the fractional part of the result
               case 9: // grade was between 90
               case 10: // and 100, inclusive
                  ++aCount;
                  break; // exits switch
               case 8: // grade was between 80 and 89
                  ++bCount;
                  break; // exits switch
               case 7: // grade was between 70 and 79
                  ++cCount;
                  break; // exits switch
               case 6: // grade was between 60 and 69
                  ++dCount;
                  break; // exits switch
               default: // grade was less than 60
                  ++fCount;
                  break; // exits swtich
               }
         }

         // display grade report
         System.out.printf("%nGrade Report:%n");

         // if user entered at least one grade
         if (gradeCounter != 0) {
            // calculate average of all grades entered
            double average = (double) total / gradeCounter;

            // output summary of results
            System.out.printf("Total of the %d grades entered is %d%n",
               gradeCounter, total);
            System.out.printf("Class average is %.2f%n", average);
            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
               "Number of students who received each grade:",
               "A: ", aCount, // display number of A grades
               "B: ", bCount, // display number of B grades
               "C: ", cCount, // display number of C grades
               "D: ", dCount, // display number of D grades
               "F: ", fCount); // display number of F grades
         } else { // if no grades were entered
            System.out.println("No grades were entered.");
         }

         input.close();
   }
}
