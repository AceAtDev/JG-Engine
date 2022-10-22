package Game.Main;

import java.util.Random;

import External.Tools;
import Game.Gameplay.audio.MusicManager;
import Game.Gameplay.audio.SoundManager;

public class LoseScreen {
   
   public static void playLoseScreen(){

      MusicManager.stopMusic();
      SoundManager.playSE(2);
      SoundManager.playSE(3);
      Random rand = new Random();

      for (int i = 0; i < 340; i++){
         int losingEffect = rand.nextInt(999999999);
         int losingEffect2 = rand.nextInt(999999);
         Tools.delayer(20);
         System.out.println(losingEffect + "" + losingEffect2 + "" + losingEffect + "" + losingEffect2 + "" + losingEffect
         + "" + losingEffect2+ "" + losingEffect);
      }

      
      Tools.delayer(1500);
      System.out.println("YOU DIED");
      System.out.println("AND YOU HAVE LOST YOUR CHANCE IN FINDING WEALTH, OR DID YOU?");

      System.exit(0);

   }
}
