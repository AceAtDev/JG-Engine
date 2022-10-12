package Game.Gameplay.Controls;

import External.Tools;
import Game.Rooms.Floor;
import Game.Rooms.Room;

public class PlayerController {
   
   
   public static void start(){


      double playerHp = 100;

      while(playerHp > 0){
         int playerChose = Tools.AskInt("Where do you want to move? \n" +
         "1: move right \n" +
         "2: move left \n");
      
         switch (playerChose) {

         }


      }

      
      

      
      throw new IllegalArgumentException("You shouldn't get to this message unless you're dead");
     
   }


}
