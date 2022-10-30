package Game.Levels;

import Game.Gameplay.Controls.PlayerController;

public class Level3 extends Hierarchy{

   public void start() {

      PlayerController pc = new PlayerController(currentFloor[2], startingRoom);
      pc.start();
   }
}
