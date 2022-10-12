package Game.Gameplay.Controls;

import java.io.Serializable;

import External.Tools;
import Game.Rooms.Floor;
import Game.Rooms.Room;

public class PlayerController {
   
   
   public void start(){

      GameStates gs = GameStates.WANDERING;
      
      int playerHp = 100;

      Floor floor = new Floor();
      floor.lookForStartingRoom();
      Room startingRoom = floor.getCurrentRoom();
      startingRoom.print();


      scanCurrentRoomExits();


      while(gs == GameStates.WANDERING){

         Room currentRoom = floor.getCurrentRoom();


         int playerChose = Tools.AskInt("Where do you wish to go? \n" + 
         "1: right\n" +
         "2: left\n" +
         "3: up\n" +
         "4: down");

         if(playerChose == 1 && currentRoom.getRoomExitRight()){ // there is an exit to the right
            currentRoom = floor.moveRight();
            currentRoom.print();
         }
         else{ // can't go that way
            //System.out.println("Can't go there");
         }

         if(playerChose == 2 && currentRoom.getRoomExitLeft()){ // there is an exit to the left
            currentRoom = floor.moveLeft();
            currentRoom.print();
         }
         else{ // can't go that way
            //System.out.println("Can't go there");
         }

         if(playerChose == 3 && currentRoom.getRoomExitUp()){
            currentRoom = floor.moveUp();
            currentRoom.print();
         }
         else{ // can't go that way
            //System.out.println("Can't go there");
         }

         if(playerChose == 4 && currentRoom.getRoomExitDown()){
            currentRoom = floor.moveDown();
            currentRoom.print();
         }
         else{ // can't go that way
            //System.out.println("Can't go there");
         }

      



      }

      
      

      
      throw new IllegalArgumentException("You shouldn't get to this message unless you're dead and Game STATE is LOSE");
     
   }

   public void scanCurrentRoomExits(){

   }


}
