package External.prototyping;

import External.Tools;
import Game.Gameplay.audio.SoundManager;

class Prototyping{

   public static void main(String[] args) throws InterruptedException{
      example("this is a conversion that is happing right now that it should get animated and make sure on the sound because it is kninda importent");
      Tools.delayer(1000);
      example("this is also some text to check on because testing things is fun as wow");
   }

   static void example(String sentences) throws InterruptedException{
      char[] senChar = sentences.toCharArray();
      SoundManager.playMusic(4);
      for(int i = 0; i < senChar.length; i++){
         System.out.print(senChar[i]);
         Tools.delayer(30);
      }

      System.out.println("");
      SoundManager.stopMusic();
   }
}