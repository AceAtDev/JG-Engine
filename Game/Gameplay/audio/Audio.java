package Game.Gameplay.audio;

import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


// |AudioSystem and controllor|
// I adivse to make another script and creating this object inside that script
// by that, you could make a ststic meathods
public class Audio {

   Clip clip;
   URL soundURL[] = new URL[13];

   //AudioClip ac = getAudioClip(getCodeBase(), soundFile);

   public Audio() {
      // Write sound place in getResource("")
      soundURL[0] = getClass().getResource("./files/Violet Stars - battle.wav");
      soundURL[1] = getClass().getResource("./files/Violet Stars - OST.wav");
      soundURL[2] = getClass().getResource("./files/lose sound start.wav");
      soundURL[3] = getClass().getResource("./files/lose sound 2.wav");
      soundURL[4] = getClass().getResource("./files/talk SFX.wav");
      soundURL[5] = getClass().getResource("./files/Encounter Full-HQ.wav");
      soundURL[6] = getClass().getResource("./files/Soul Damaged-HQ.wav");
      soundURL[7] = getClass().getResource("./files/Normal Attack-HQ.wav");
      soundURL[8] = getClass().getResource("./files/Celeste Original Soundtrack - 03 - Resurrections.wav");
      soundURL[9] = getClass().getResource("./files/epic-sword-clang-2.wav");
      soundURL[10] = getClass().getResource("./files/bumpelsnake__bump3.wav");
      soundURL[11] = getClass().getResource("./files/victory.wav");
      soundURL[12] = getClass().getResource("./files/sound-of-the-walk.wav");
      //soundURL[8] = getClass().getResource("./files/talk SFX.wav");

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
      if(clip == null){
         return;
      }
      clip.stop();
   }



}
