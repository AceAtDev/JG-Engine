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
         System.out.println(losingEffect + losingEffect + losingEffect);
      }

      Tools.delayer(1500);
      System.out.println("YOU DIED");
      System.out.println("AND YOU HAVE LOST YOUR CHANCE IN FIND WEALTH");

      System.exit(0);

   }
}
