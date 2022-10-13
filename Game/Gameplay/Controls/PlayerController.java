package Game.Gameplay.Controls;

import java.io.Serializable;

import External.Tools;
import Game.Rooms.Floor;
import Game.Rooms.Room;

public class PlayerController {
   
   Floor floor = new Floor();
   
   public void start(){

      GameStates gs = GameStates.WANDERING;
      
      int playerHp = 100;

      floor.lookForStartingRoom();
      Room startingRoom = floor.getCurrentRoom();
      startingRoom.print();



      while(gs == GameStates.WANDERING){
         
         navigateRooms();


      }
     
      throw new IllegalArgumentException("You shouldn't get to this message unless you're dead and Game STATE is LOSE");
     
   }

   
   void navigateRooms(){
      
      Room currentRoom = floor.getCurrentRoom();

      System.out.println("X-pos " + floor.currentRoomX);
      System.out.println("Y-pos " + floor.currentRoomY);


      int playerChose = Tools.AskInt("Where do you wish to go? \n" + 
      "1: right\n" +
      "2: left\n" +
      "3: up\n" +
      "4: down");

      if(playerChose == 1 && currentRoom.getRoomExitRight()){ // there is an exit to the right
         currentRoom = floor.moveRight();
         currentRoom.print();
      }

      if(playerChose == 2 && currentRoom.getRoomExitLeft()){ // there is an exit to the left
         currentRoom = floor.moveLeft();
         currentRoom.print();
      }

      if(playerChose == 3 && currentRoom.getRoomExitUp()){
         currentRoom = floor.moveUp();
         currentRoom.print();
      }

      if(playerChose == 4 && currentRoom.getRoomExitDown()){
         currentRoom = floor.moveDown();
         currentRoom.print();
      }

   
   }


}
