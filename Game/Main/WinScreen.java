package Game.Main;

import External.Tools;
import Game.Dialogue.Dialogue;
import Game.Gameplay.audio.MusicManager;
import Game.Gameplay.audio.SoundManager;

public class WinScreen {
   
   public static void printWin(){
      
      Tools.ClearConsole();
      Tools.delayer(3500);

      Dialogue.dialogprint("YOU DID IT!");
      SoundManager.playSE(11);
      Tools.delayer(2500);
      
      MusicManager.transformFromCurrentMusicToOther(13);
      Dialogue.dialogprint("you have deffend the windows deffender! well done!");
      Dialogue.dialogprint("and you have returned with the informations that will the help the FBI in their investigation!");
      Tools.delayer(3500);
      Dialogue.dialogprint("Game made by: Mohamed Elshoubky");

      Tools.delayer(18500);

      Dialogue.dialogprint("???: You sure have a great future and potential...");
      Dialogue.dialogprint("???: I'll make sure to keep you as a secret weapon of my own");
      Dialogue.dialogprint("???: after all, I own you =)");
      Tools.delayer(3500);
      System.exit(0);
   }
}
