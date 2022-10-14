package Game.Dialogue;

import External.Tools;

public class Dialogue {

   public void dialogPrinit(String sentences) throws InterruptedException{
      char[] senChar = sentences.toCharArray();

      for(int i = 0; i < senChar.length; i++){
         System.out.print(senChar[i]);
         Tools.delayer(40);
      }

      System.out.println("");
   }

}
