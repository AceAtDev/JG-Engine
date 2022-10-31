package Game.Gameplay.Controls;


import External.Tools;
import Game.Gameplay.audio.MusicManager;
import Game.Gameplay.audio.SoundManager;
import Game.Rooms.Floor;
import Game.Rooms.Room;

public class PlayerController extends PlayerStates{ // this class should not be instansited but once

   private Floor floor;
   private Room startingRoom;

   private Room currentRoom;
   private static boolean isFinishedLevel = false;


   public PlayerController(Floor currentFloor, Room startingRoom){
      this.floor = currentFloor;
      this.startingRoom = startingRoom;

   }


   
   public void start(){
      
      Room currentRoom = floor.lookForStartingRoom(startingRoom);
      currentRoom.print();

      MusicManager.playMusic(8);
      
      if(isFinishedLevel == true){
         isFinishedLevel = false;
      }

      while (isFinishedLevel == false){

         navigateRooms();


      }
     
   }

   
   private void navigateRooms(){

      currentRoom = floor.getCurrentRoom();

      if(currentRoom == null){
         System.out.println("you've been restarted in your first room");
         System.out.println("Someting worng happend plase talk to the developer about it");
         currentRoom = floor.lookForStartingRoom(startingRoom);
      }


      char playerChose = Tools.AskChar("Where do you wish to go? \n" + 
      "W: up\n" +
      "D: right\n" +
      "A: left\n" +
      "S: down");
      playerChose = Character.toLowerCase(playerChose);



      if(playerChose == 'd' && currentRoom.getRoomExitRight()){ // there is an exit to the right
         SoundManager.playSE(12);
         currentRoom = floor.moveRight();
         currentRoom.print();
      }

      else if(playerChose == 'a' && currentRoom.getRoomExitLeft()){ // there is an exit to the left
         SoundManager.playSE(12);
         currentRoom = floor.moveLeft();
         currentRoom.print();
      }

      else if(playerChose == 'w' && currentRoom.getRoomExitUp()){ // there is an exit to the up
         SoundManager.playSE(12);
         currentRoom = floor.moveUp();
         currentRoom.print();
      }

      else if(playerChose == 's' && currentRoom.getRoomExitDown()){ // there is an exit to the down
         SoundManager.playSE(12);
         currentRoom = floor.moveDown();
         currentRoom.print();
      }

      else {
         currentRoom.print();
         System.out.println("Can't go that direction");
      }
   
   }


   public static void levelFinished(){ // call when the player gets to a point where level is finished!
      isFinishedLevel = true;
   }

}
