package Game.Main;

import java.util.Random;

import External.Tools;

public class LoseScreen {
   
   public static void playLoseScreen(){

      // play audio
      Random rand = new Random();

      for (int i = 0; i < 150; i++){
         int losingEffect = rand.nextInt(100000000);
         Tools.delayer(20);
         System.out.println(losingEffect);
      }

      System.out.println("YOU DED");
      Tools.delayer(1500);
      System.out.println("lol");

      System.exit(0);

   }
}
