package Game.Gameplay.audio;

public class SoundManager {
   
   private static Audio sounds = new Audio();

   public static void playMusic(int i){
      sounds.setFile(i);
      sounds.play();
      sounds.loop();
   }

   public static void stopMusic(){
      sounds.stop();
   }

   public static void playSE(int i){
      sounds.setFile(i);
      sounds.play();
   }

   /* 
   public static void allStopMusic(){
      for (int i = 0; i < sounds.soundURL.length; i++){
         sounds.soundURL[i].
         
      }
   }
   */
}
