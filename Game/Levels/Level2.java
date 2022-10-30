package Game.Levels;

import Game.Gameplay.Controls.PlayerController;

public class Level2 extends Hierarchy {
   
   public void start() {

      PlayerController pc = new PlayerController(currentFloor[1], startingRoom);
      pc.start();
   }
}
