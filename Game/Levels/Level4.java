package Game.Levels;

import Game.Gameplay.Controls.PlayerController;

public class Level4 extends Hierarchy{

   public void start() {

      PlayerController pc = new PlayerController(currentFloor[3], startingRoom);
      pc.start();
   }
   
}
