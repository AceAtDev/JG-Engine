package Game.Gameplay.Controls;

import External.Tools;
import Game.Rooms.Map;
import Game.Rooms.Room;

public class PlayerController {
   
   protected boolean isChosing;
   

   Map chart = new Map();
   Room currentRoom = Map.startingRoom;

   public static void start(){
      

     

      int playerchose = Tools.AskInt("Where do you wish to go? \n" +
       "(Pleasa Enter a number) \n" +
        "1: Right\n" +
        "2: Left\n");

      // Serach Rooms
     
   }

   Room findCurrentRoom(){

      for (Room[] line : chart.map){
         for (Room currentRoom : line){

            if(currentRoom == currentRoom){ // Serach for the current room
               return currentRoom;
            }
         }
      }
      return currentRoom;
   }

}
