// Sourse of Music and only the one, you could play some SFX but it something you don't wanna do
// because it will break the music otherwise
// Date: 10/28/2022

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

