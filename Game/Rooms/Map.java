package Game.Rooms;

public class Map {
   
   

   
   public static Room startingRoom = new Room();

   Room CR = new Room(true); // Closed room/Unreachable room
   
   
   
   public Room[][] map = 
   {{null , null , null,},

    {null , startingRoom , null},

    {null , null , null,}};


   

  
   public Object[][] getMap(){

      return map;
   }




   
}
