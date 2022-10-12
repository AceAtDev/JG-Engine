package Game.Rooms;


import External.Tools;

public class Floor {


   private Room currentRoom;
   
   
   private Room[] floor = 
   {
      
   };



   public Room[] getFloor(){
      return floor;
   }

   public Room[] setFloor(Room[] newFloor){
      floor = newFloor;
      return floor;
   }



   public Room getCurrentRoom(){
      return currentRoom;
   }

   public Room setCurrentRoom(Room room){
      currentRoom = room;
      return currentRoom;
   }







}
