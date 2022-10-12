package Game.Rooms;


import External.Tools;

public class Floor {


   
   
   private Room fourDirectionRoom = new Room();
   private Room startingRoom = fourDirectionRoom; // the room that game will start at; ONLY ONE SHOULD BE ON THE MAP

   private Room oneGateUp = new Room(1,0,0,0);
   private Room oneGateRight = new Room(0,2,0,0);
   private Room oneGateLeft = new Room(0,0,3,0);
   private Room oneGateDown = new Room(0,0,0,4);

   private Room twoGatesUpRight = new Room(1,2,0,0);
   private Room twoGatesDownRight = new Room(0,2,3,0);
   private Room twoGatesDownLeft = new Room(0,0,3,4);
   private Room twoGatesUpLeft = new Room(1,0,3,0);

   private Room threeGatesLeftUpDown = new Room(1,0,3,4);
   private Room threeGatesLeftUpRight = new Room(1,2,3,0);



   private Room currentRoom = null;
   private int currentRoomX = 0;
   private int currentRoomY = 0;
   

   private Room[][] floor = 
   {
      {null,         oneGateUp,        oneGateUp,           oneGateUp},
      {oneGateRight, startingRoom, threeGatesLeftUpRight, twoGatesUpLeft},
      {null, oneGateDown, null,      null,           null}
   };



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
      return currentRoom = floor[currentRoomY][currentRoomX + 1];
   }

   public Room moveLeft(){
      return currentRoom = floor[currentRoomY][currentRoomX - 1];
   }

   public Room moveUp(){
      return currentRoom = floor[currentRoomY + 1][currentRoomX];
   }

   public Room moveDown(){
      return currentRoom = floor[currentRoomY - 1][currentRoomX];
   }



   public void lookForStartingRoom(){

      for(int y = 0; y < floor.length; y++){
         for(int x = 0; x < floor.length; x++){
            if(floor[y][x] == startingRoom){
               currentRoomX = x;
               currentRoomY = y;
               currentRoom = startingRoom;
            }
         }
      }

   }





}
