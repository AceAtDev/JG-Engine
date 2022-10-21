package Game.Gameplay.Controls;


import External.Tools;
import Game.Rooms.Floor;
import Game.Rooms.Room;

public class PlayerController extends PlayerBattleController{ // this class should not be created but once

   private Floor floor;
   private Room startingRoom;


   public PlayerController(Floor currentFloor, Room startingRoom){
      this.floor = currentFloor;
      this.startingRoom = startingRoom;

   }



   
   public void start(){


      GameStates gs = GameStates.WANDERING;
      
      Room currentRoom = floor.lookForStartingRoom(startingRoom);
      currentRoom.print();
      

      while (getCurrentHP() > 0){

         if ( gs == GameStates.WANDERING){
            navigateRooms();
         }


      }

     
      throw new IllegalArgumentException("You shouldn't be here");
     
   }

   
   private void navigateRooms(){
      
      Room currentRoom = floor.getCurrentRoom();

      System.out.println("X-pos " + floor.currentRoomX); // delete after finishing builiding
      System.out.println("Y-pos " + floor.currentRoomY); // delete after finishing builiding


      int playerChose = Tools.AskInt("Where do you wish to go? \n" + 
      "1: right\n" +
      "2: left\n" +
      "3: up\n" +
      "4: down");

      if(playerChose == 1 && currentRoom.getRoomExitRight()){ // there is an exit to the right
         currentRoom = floor.moveRight();
         currentRoom.print();
      }

      else if(playerChose == 2 && currentRoom.getRoomExitLeft()){ // there is an exit to the left
         currentRoom = floor.moveLeft();
         currentRoom.print();
      }

      else if(playerChose == 3 && currentRoom.getRoomExitUp()){ // there is an exit to the up
         currentRoom = floor.moveUp();
         currentRoom.print();
      }

      else if(playerChose == 4 && currentRoom.getRoomExitDown()){ // there is an exit to the down
         currentRoom = floor.moveDown();
         currentRoom.print();
      }

      else {
         currentRoom.print();
         System.out.println("Can't go that direction");
      }
   
   }


}
