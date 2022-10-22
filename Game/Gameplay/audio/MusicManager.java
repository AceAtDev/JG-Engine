package Game.Gameplay.audio;

// Use this only for music control
public class MusicManager {
   private static Audio music = new Audio();

   public static void playMusic(int i){
      music.setFile(i);
      music.play();
      music.loop();
   }

   public static void stopMusic(){
      music.stop();
   }

   public static void playSE(int i){
      music.setFile(i);
      music.play();
   }


   // Transform form the current music to another music
   public static void transformFromCurrentMusicToOther(int newMusicIndex){ 
      music.stop();
      playMusic(newMusicIndex);
   }
}

