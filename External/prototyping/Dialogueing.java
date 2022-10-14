package External.prototyping;

import External.Tools;

class Prototyping{

   public static void main(String[] args) throws InterruptedException{
      example("this is a conversion that is happing right now that it should get animated");
   }

   static void example(String sentences) throws InterruptedException{
      char[] senChar = sentences.toCharArray();

      for(int i = 0; i < senChar.length; i++){
         System.out.print(senChar[i]);
         Tools.delayer(40);
      }

      System.out.println("");
   }
}