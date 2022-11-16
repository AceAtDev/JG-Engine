// play this screen after the death of the player
// Date: 10/28/2022
package Game.Main;

import java.util.Random;

import Game.Tools;
import Game.Gameplay.audio.MusicManager;
import Game.Gameplay.audio.SoundManager;

public class LoseScreen {
   
   public static void playLoseScreen(){

      MusicManager.stopMusic();
      SoundManager.playSE(2);
      SoundManager.playSE(3);
      Random rand = new Random();

      for (int i = 0; i < 340; i++){ // Just to add some effects to losing
         int losingEffect = rand.nextInt(999999999);
         int losingEffect2 = rand.nextInt(999999999);
         int losingEffect3 = rand.nextInt(999999999);
         Tools.delayer(20);
         System.out.println(losingEffect + "" + losingEffect2 + "" + losingEffect3 + "" + losingEffect2 + "" + losingEffect
         + "" + losingEffect2+ "" + losingEffect3);
      }

      
      Tools.delayer(1500);
      System.out.println("YOU DIED");
      System.out.println("AND YOU HAVE PROVEN TO BE A SAD TOOL");

      System.exit(0);

   }
}
