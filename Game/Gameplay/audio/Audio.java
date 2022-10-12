package Game.Gameplay.audio;

import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


// |AudioSystem and controllor|
// I adivse to make another script and creating this object inside that script
// by that, you could name you sound effects and music instated of calling tham by indexs
public class Audio {

   Clip clip;
   URL soundURL[] = new URL[30];

   public Audio() {
      soundURL[0] = getClass().getResource(null); // Write sound place in your folders
   }

   public void setFile(int fileIndex) {
      try {
         AudioInputStream ais = AudioSystem.getAudioInputStream(soundURL[fileIndex]);
         clip = AudioSystem.getClip();
         clip.open(ais);
      }
      catch (Exception e) {
         System.out.println("Graping File failled");
         System.out.println("Make sure that the file index is currect and file place is currect");
      }
   }

   public void play(){
      clip.start();
   }

   public void loop(){
      clip.loop(clip.LOOP_CONTINUOUSLY);
   }

   public void stop(){
      clip.stop();
   }

   
}
