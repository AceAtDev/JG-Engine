package Game.Dialogue;

import External.Tools;

public class Dialogue {

   public static void dialogprint(String sentences) {
      char[] senChar = sentences.toCharArray();

      for(int i = 0; i < senChar.length; i++){
         System.out.print(senChar[i]);
         Tools.delayer(43);
      }

      System.out.println("");
   }

}
