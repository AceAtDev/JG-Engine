package Game.Levels;

import Game.Gameplay.Controls.PlayerController;

public class Level1 extends Hierarchy{
   
   public void start(){

      

      PlayerController pc = new PlayerController(currentFloor, startingRoom);
      pc.start();
      
   }

}
