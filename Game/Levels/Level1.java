package Game.Levels;

import Game.Gameplay.Controls.PlayerController;

public class Level1 extends Hierarchy{
   
   public void start(){
      int currentFloorIndex = 0;

      PlayerController pc = new PlayerController(currentFloor[currentFloorIndex], startingRoom);
      pc.start();
      
   }

}
