package Game.Rooms;


import External.Tools;

public class Floor {


   
   /* 
   private Room fourDirectionRoom = new Room();
   private Room startingRoom = fourDirectionRoom; // the room that game will start at; ONLY ONE SHOULD BE ON THE MAP

   private Room oneGateUp = new Room(false,false,true,false);
   private Room oneGateRight = new Room(true,false,false,false);
   private Room oneGateLeft = new Room(false,true,false,false);
   private Room oneGateDown = new Room(false,false,false,true);

   private Room twoGatesUpRight = new Room(true,false,true,false);
   private Room twoGatesDownRight = new Room(true,false,false,true);
   private Room twoGatesDownLeft = new Room(false,true,false,true);
   private Room twoGatesUpLeft = new Room(false,true,true,false);

   private Room threeGatesLeftUpDown = new Room(false,true,true,true);
   private Room threeGatesLeftUpRight = new Room(true,true,true,false);
   */



   private Room currentRoom = null;
   public int currentRoomX = 0;
   public int currentRoomY = 0;
   

   private Room[][] floor;
   



   public Floor(Room[][] arrayOfRooms){
      this.floor = arrayOfRooms;
   }


   public Room[][] getFloor(){
      return floor;
   }

   public Room[][] setFloor(Room[][] newFloor){
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

   public Room getCurrentRoomPosition(){
      return floor[currentRoomX][currentRoomY];
   }

   public Room setCurrentRoomPosition(int x, int y){
      currentRoom = floor[x][y];
      return currentRoom;
   }



   public Room moveRight(){
      currentRoomX += 1;
      return updateRoom();
   }

   public Room moveLeft(){
      currentRoomX -= 1;
      return updateRoom();
   }

   public Room moveUp(){
      currentRoomY -= 1;
      return updateRoom();
   }

   public Room moveDown(){
      currentRoomY += 1;
      return updateRoom();
   }


   private Room updateRoom(){
      return currentRoom = floor[currentRoomY][currentRoomX];
   }


   public Room lookForStartingRoom(Room startingRoom){

      for(int y = 0; y < floor.length; y++){
         for(int x = 0; x < floor.length; x++){
            if(floor[y][x] == startingRoom){
               currentRoomX = x;
               currentRoomY = y;
               currentRoom = startingRoom;
               return currentRoom;
            }
         }
      }

      throw new IllegalStateException("could not find starting Room");
   }





}

//public interface Rodom{

//}
