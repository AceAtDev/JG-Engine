package Game.Rooms;

import External.Tools;
import Game.Dialogue.Dialogue;
import Game.Gameplay.audio.MusicManager;
import Game.Gameplay.audio.SoundManager;

public class Stairs extends Room {
   
   private int currentFloorIndex;

   public Stairs(boolean right, boolean left, boolean up, boolean down, int currentFloorIndex) {

      super(right, left, up, down);
      this.currentFloorIndex = currentFloorIndex;

   }

   public void moveNextFloor(){

      Tools.ClearConsole();
      MusicManager.stopMusic();
      Tools.delayer(150);
      SoundManager.playSE(14);
      Tools.delayer(2000);
      Dialogue.dialogprint("You have climbed the stairs to get closer to system");

      currentFloorIndex++;
   }

}
