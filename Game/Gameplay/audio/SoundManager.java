package Game.Gameplay.audio;




// this class is should only be used for SFX and
public class SoundManager{
   
   private static Audio sounds = new Audio();

   // This is used only for the dialog sound; this meathod should only be used for one call and stop call
   public static void playRepeative(int i){
      sounds.setFile(i);
      sounds.play();
      sounds.loop();
   }

   public static void stop(){
      sounds.stop();
   }

   public static void playSE(int i){
      sounds.setFile(i);
      sounds.play();
   }

   /* 
   public static void manualMusicStop(int i){
      sounds.setFile(i);
      sounds.stop();
   }
   
   public static void allStopMusic(){
      for (int i = 0; i < sounds.soundURL.length - 1; i++){
         sounds.setFile(i);
         sounds.stop();
      }
   }
   */
}
