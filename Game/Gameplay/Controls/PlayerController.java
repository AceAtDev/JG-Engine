package Game.Gameplay.Controls;

import External.Tools;
import Game.Rooms.Map;
import Game.Rooms.Room;

public class PlayerController {
   
   
   private static boolean canMoveRight;
   private static boolean canMoveLeft;
   private static boolean canMoveUp;
   private static boolean canMoveDown;
   

   public static void start(){

      Map _map = new Map();
      _map.startingRoom = new Room();
      _map.currentRoom = _map.startingRoom;

      Room leftRoom = _map.findPossibleEntryRoomHorizontal(false);
      Room rightRoom = _map.findPossibleEntryRoomHorizontal(true);


      int playerChose = Tools.AskInt("Where do you want to move? \n" +
      "1: move right \n" +
      "2: move left \n");
      
      switch (playerChose) {

         case 1:
            if(rightRoom == null){
               System.out.println("Can't go there");
               start();
               break;
            }
            System.out.println("moved right");
            

         break;

         case 2:
         if(leftRoom == null){
            System.out.println("Can't go there");
            start();
            break;
         }
         System.out.println("moved left");
         
         break;

      }
      

      
      start();
      System.out.println("Opps... Something went wrong :(");
     
   }







}
