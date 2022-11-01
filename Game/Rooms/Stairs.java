// From the name we can know what is this!
// NOTE: level wil end and go to the next level after reaching the stairs!
// Date: 10/28/2022

package Game.Rooms;

import External.Tools;
import Game.Dialogue.Dialogue;
import Game.Gameplay.Controls.PlayerController;
import Game.Gameplay.audio.MusicManager;
import Game.Gameplay.audio.SoundManager;
import Game.Main.WinScreen;

public class Stairs extends Room{

   

   public Stairs(boolean hasStairs) {

      this.hasStairs = hasStairs;

   }

   public void moveNextFloor(){
      
      
      Tools.ClearConsole();
      MusicManager.stopMusic();
      Tools.delayer(150);
      SoundManager.playSE(14);
      Tools.delayer(500);
      Dialogue.dialogprint("You have climbed the stairs to get closer to system");
      Tools.delayer(1500);

      PlayerController.levelFinished(); // go to the next level
   }



}
