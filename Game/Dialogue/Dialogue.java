// This the print function of java but will makes text prints as if we were in an RPG game.
// Date: 10/28/2022
package Game.Dialogue;

import Game.Tools;
import Game.Gameplay.audio.SoundManager;

public class Dialogue {

   public static void dialogprint(String sentences) {
      char[] senChar = sentences.toCharArray();
      SoundManager.playRepeative(4);
      for(int i = 0; i < senChar.length; i++){
         System.out.print(senChar[i]);
         Tools.delayer(40);
      }

      SoundManager.stop();
      System.out.println("");
   }

}
