package External;
// A class which will be called to make life easier.
// Note: every function here is independed and only require to be called and input values.


import java.util.Random;
import java.util.Scanner;


public class Tools{

   // A method that will clear console output
   public static void ClearConsole() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }

   
   // A function which print a String to the user
   public static void OutString(String message) { 
      String newMessage = message + "\n";
      
      System.out.println( newMessage );
   }


   // Will print a message and start looking for *String* input; better to store it in a value
   public static String AskString(String message) {

      String theMessage = message;
      System.out.println(theMessage);
      
      try  {
         Scanner userInput = new Scanner(System.in);
         String inputs = userInput.nextLine();
         return inputs;
      }
      catch (Exception e) {
         System.out.println("Unacceptable value, plaese try again \n");
         return AskString(theMessage);
      }

   }

   public static char AskChar(String message) {

      String theMessage = message;
      System.out.println(theMessage);
      
      try  {
         Scanner userInput = new Scanner(System.in);
         char inputs = userInput.nextLine().charAt(0);
         return inputs;
      }
      catch (Exception e) {
         System.out.println("Unacceptable value, plaese try again \n");
         return AskChar(theMessage);
      }

   }


   // Will print a message and start looking for *Int* input; better to store it in a value
   public static int AskInt(String message) {

      String theMessage = message;
      System.out.println(theMessage);

      try  {
         Scanner userInput = new Scanner(System.in);
         int input = userInput.nextInt();
         return input;
      }
      catch (Exception e) {
         System.out.println("Unacceptable value, plaese enter a non-decimal number \n\n");
         return AskInt(theMessage);
      }

   }


   // Will print a message and start looking for *Double* input; better to store it in a value
   public static double AskDouble(String message) {

      String theMessage = message;
      System.out.println(theMessage);

      try  {
         Scanner userInput = new Scanner(System.in);
         double input = userInput.nextDouble();
         return input;
      }
      catch (Exception e) {
         System.out.println("Unacceptable value, plaese try again \n\n");
         return AskDouble(theMessage);
      }

   }
      

   // Insertion Sort is the primity idea of this algorithm
   public static int[] SortInt(int[] array){

      for (int i = 0; i < array.length; i++) {
         
         int currentIndex = i;
         int item = array[i];

         while(currentIndex > 0 && array[currentIndex - 1] > item) {
            array[currentIndex] = array[currentIndex - 1];
            currentIndex--;
         }

         array[currentIndex] = item;
      }

      return array;
   }


   // It's the same as "SortInt" but with change in the while loop condition which makes it sorts by reverse
   public static int[] ReverseSortInt(int[] array){

      for (int i = 0; i < array.length; i++) {
         
         int currentIndex = i;
         int item = array[i];

         while(currentIndex > 0 && array[currentIndex - 1] < item) {
            array[currentIndex] = array[currentIndex - 1];
            currentIndex--;
         }

         array[currentIndex] = item;
      }

      return array;
   }


   // From the name =)
   public static double AverageArrayValues(int[] array){

      int overallValues = 0;

      for(int i = 0; i <= array.length - 1; i++){
         
         overallValues += array[i];
      }

      double result = overallValues / array.length;
      return result;
   }

   // frezze the code for a period of seconds
   public static void delayer (long time) {
      
      try{
         Thread.sleep(time);
      }
      catch (InterruptedException e) {
         Thread.currentThread().interrupt();
      }
      
   }

   // roll a random number number
   public static int randomNumRoller(int maxNumber) {
      Random rand = new Random();
      return rand.nextInt(maxNumber);
      
   }
   
}