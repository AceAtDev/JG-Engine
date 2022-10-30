// The backbone of the levels where things gets specified in it and levels can know what their need to do 
// Date: 10/28/2022
package Game.Levels;


import Game.Enemies.Boss;
import Game.Enemies.Enemy;
import Game.Rooms.Floor;
import Game.Rooms.Room;
import Game.Rooms.Stairs;

public class Hierarchy {

   protected int currentFloorIndex = 0;


   Enemy notCubeL1 = new Enemy(50,0,2);
   Boss estran = new Boss("Estran",100,1,12,true);


   
   private Room fourDirectionRoom = new Room();

   private Room oneGateUp = new Room(false,false,true,false);
   private Room oneGateRight = new Room(true,false,false,false);
   private Room oneGateLeft = new Room(false,true,false,false);
   private Room oneGateDown = new Room(false,false,false,true);

   private Room twoGatesUpRight = new Room(true,false,true,false);
   private Room twoGatesDownRight = new Room(true,false,false,true);
   private Room twoGatesDownLeft = new Room(false,true,false,true);
   private Room twoGatesUpLeft = new Room(false,true,true,false);
   private Room twoGatesRightLeft = new Room(true,true,false, false);
   private Room twoGatesDownUp = new Room(false,false,true, true);
   
   private Room threeGatesLeftUpDown = new Room(false,true,true,true);
   private Room threeGatesLeftUpRight = new Room(true,true,true,false);
   private Room threeGatesDownRightLeft = new Room(true, true,false,true);
   private Room threeGatesRightDownUp = new Room(true, false,true,true);


   private Room bossRoom = new Room(false,true,false,false, estran);


   private Stairs stairs = new Stairs(true);
   
   
   protected Room startingRoom = fourDirectionRoom; // the room that player will start at; ONLY ONE SHOULD BE ON PER MAP/FLOOR
   
   
   // do mapping here
   private Room[][] toturialRooms = { 
      {null, twoGatesDownRight,  twoGatesRightLeft, stairs},
      {null, twoGatesDownUp, null},
      {oneGateRight, startingRoom, oneGateLeft},
      {null, twoGatesUpRight, oneGateLeft},
   };
   // null are non-exsited area/Room

   
   private Room[][] secondRooms = { 
   {stairs,             threeGatesDownRightLeft,    oneGateLeft,        null},
   {null,               threeGatesRightDownUp,    twoGatesRightLeft,    oneGateLeft},
   {twoGatesDownRight,   startingRoom,          oneGateLeft,             null},
   {oneGateUp,          twoGatesUpRight,        twoGatesRightLeft,    oneGateLeft},
   };

   private Room[][] thiredRooms = { 
   {stairs,       twoGatesDownLeft,              null,                oneGateDown,        null},
   {null,         threeGatesRightDownUp,    twoGatesDownLeft,      twoGatesDownUp,        null},
   {null,            oneGateUp,           twoGatesUpRight,            threeGatesLeftUpDown,    null},
   {oneGateRight,   twoGatesRightLeft,    twoGatesRightLeft,          startingRoom,    twoGatesDownLeft},
   {null,               null,              oneGateRight,            threeGatesLeftUpRight,    twoGatesUpLeft}
   };

   private Room[][] finalRooms = {
      {null,             oneGateDown,        null},
      {oneGateRight,    startingRoom,   twoGatesRightLeft,    twoGatesRightLeft,    twoGatesRightLeft,    twoGatesRightLeft,    bossRoom},
      {null,             oneGateUp,          null},
   };


   private Floor toturialFloor = new Floor(toturialRooms);
   private Floor secondFloor = new Floor(secondRooms);
   private Floor thiredFloor = new Floor(thiredRooms);
   private Floor bossFloor = new Floor(finalRooms);


   protected Floor[] currentFloor = {toturialFloor, secondFloor, thiredFloor, bossFloor};


}