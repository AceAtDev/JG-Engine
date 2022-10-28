package Game.Gameplay.Controls;


import External.Tools;
import Game.Gameplay.audio.MusicManager;
import Game.Gameplay.audio.SoundManager;
import Game.Rooms.Floor;
import Game.Rooms.Room;

public class PlayerController extends PlayerBattleController{ // this class should not be instansited but once

   private Floor floor;
   private Room startingRoom;


   public PlayerController(Floor currentFloor, Room startingRoom){
      this.floor = currentFloor;
      this.startingRoom = startingRoom;

   }



   
   public void start(){
      
      Room currentRoom = floor.lookForStartingRoom(startingRoom);
      currentRoom.print();

      MusicManager.playMusic(8);
      

      while (getCurrentHP() > 0){

         navigateRooms();


      }

     
      throw new IllegalArgumentException("State out of bounds");
     
   }

   
   private void navigateRooms(){
      Room currentRoom = floor.getCurrentRoom();
      

      if(currentRoom == null){
         System.out.println("you've been restarted in your first room");
         System.out.println("Someting worng happend plase talk to the developer about it");
         currentRoom = floor.lookForStartingRoom(startingRoom);
      }


      int playerChose = Tools.AskInt("Where do you wish to go? \n" + 
      "1: right\n" +
      "2: left\n" +
      "3: up\n" +
      "4: down");

      if(playerChose == 1 && currentRoom.getRoomExitRight()){ // there is an exit to the right
         SoundManager.playSE(12);
         currentRoom = floor.moveRight();
         currentRoom.print();
      }

      else if(playerChose == 2 && currentRoom.getRoomExitLeft()){ // there is an exit to the left
         SoundManager.playSE(12);
         currentRoom = floor.moveLeft();
         currentRoom.print();
      }

      else if(playerChose == 3 && currentRoom.getRoomExitUp()){ // there is an exit to the up
         SoundManager.playSE(12);
         currentRoom = floor.moveUp();
         currentRoom.print();
      }

      else if(playerChose == 4 && currentRoom.getRoomExitDown()){ // there is an exit to the down
         SoundManager.playSE(12);
         currentRoom = floor.moveDown();
         currentRoom.print();
      }

      else {
         currentRoom.print();
         System.out.println("Can't go that direction");
      }
   
   }


}
