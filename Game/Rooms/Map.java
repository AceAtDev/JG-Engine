package Game.Rooms;

import java.util.stream.IntStream; 

import External.Tools;

public class Map {
   

   public Room startingRoom;


   //public Room mainRoom = new Room();
   
   public Room currentRoom = new Room();




   Room CR = new Room(true); // Closed room/Unreachable room
   
   public Room[][] map =    {

      {null , null , null,},
   
      {null , currentRoom , null},
   
      {null , null , null,}
   
     };;


   public Map(){

   }

   //public void initializeMap(){

   //}


   public Room getCurrentRoom(){
      return currentRoom;
   }

   public Room setCurrentRoom(Room room){
      currentRoom = room;
      return currentRoom;
   }

   public Room findRoom(Room target) 
   {  

      for (int i = 0; i <  map.length; i++)
      {
         for (int j = 0; j < map.length; j++){
            if (map[i][j] == target) {
               System.out.println(i + " " + j);
               return map[i][j];
           }
         }
        
      }
 
      throw new IllegalArgumentException("could not find main room");

   } 

   public Room findPossibleEntryRoomHorizontal(boolean isRight) 
   { 
      int leftRightDirection;

      if(isRight){
         leftRightDirection = 1;
      }
      else{
         leftRightDirection = -1;
      }


      for (int i = 0; i < map.length; i++)
      {
         for (int j = 0; j < map.length; j++){
            if (map[i][j] == currentRoom) {

               try{
                  System.out.println(map[i][j + leftRightDirection]); // there is room
                  return map[i][j + leftRightDirection];
               }
               catch (Exception e) {
                  return null; // hit wall; can't go there
               }
               
           }
         }
        
      }
 
      throw new IllegalArgumentException("something went wrong with \" findPossibleEntryRoomHorizontal \" funcation");

   }
    
   public Room findPossibleEntryRoomVertical(boolean isUp) 
   { 
      int leftRightDirection;
 
      if(isUp){
         leftRightDirection = 1;
      }
      else{
         leftRightDirection = -1;
      }
       
 
       
 
      for (int i = 0; i < map.length; i++)
       {
         for (int j = 0; j < map.length; j++){
            if (map[i][j] == currentRoom) {
 
               try{
                  return map[i][j + leftRightDirection]; // there is room
               }
               catch (Exception e) {
                  return null; // hit wall; can't go there
               }
                
            }
         }
         
      }
  
      throw new IllegalArgumentException("something went wrong with \" findPossibleEntryRoomVertical \" funcation");
 
   }


}
