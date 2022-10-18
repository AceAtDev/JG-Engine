package Game.Main;

import java.util.Random;

import External.Tools;
import Game.Gameplay.audio.SoundManager;

public class LoseScreen {
   
   public static void playLoseScreen(){

      SoundManager.allStopMusic();
      SoundManager.playSE(2);
      SoundManager.playSE(3);
      Random rand = new Random();

      for (int i = 0; i < 330; i++){
         int losingEffect = rand.nextInt(999999999);
         Tools.delayer(20);
         System.out.println(losingEffect + "" + losingEffect + "" + losingEffect + "" + losingEffect + "" + losingEffect);
      }

      Tools.delayer(1500);
      System.out.println("YOU DIED");
      System.out.println("AND YOU HAVE LOST YOUR CHANCE IN FINDING WEALTH");

      System.exit(0);

   }
}
