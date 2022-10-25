package Game.Levels;

import Game.Gameplay.Controls.PlayerController;
import Game.Gameplay.Cutscenes.Cutscene;

public class Level1 extends Hierarchy{
   
   public void start(){

      Cutscene.startingCutscene();

      PlayerController pc = new PlayerController(currentFloor, startingRoom);
      pc.start();
      
   }

}
