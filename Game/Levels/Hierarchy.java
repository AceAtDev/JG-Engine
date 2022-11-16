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


   private Enemy notCubeL1 = new Enemy(50,0,2);
   private Enemy notCubeL2 = new Enemy(75,1,5);
   private Enemy notCubeL3 = new Enemy(100,1,7);
   private Enemy notCubeL4 = new Enemy(110,1,9);
   private Enemy notCubeL5 = new Enemy(125,2,10);
   private Enemy notCubeL6 = new Enemy(150,3,14);

   Boss estran = new Boss("Estran",200,3,15,true);


   
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


   // Rooms with enemy in
   private Room oneGateUpE = new Room(false,false,true,false);
   private Room oneGateRightE = new Room(true,false,false,false, notCubeL6);
   private Room oneGateLeftE = new Room(false,true,false,false, notCubeL1);
   private Room oneGateDownE = new Room(false,false,false,true, notCubeL4);

   private Room twoGatesUpRightE = new Room(true,false,true,false, notCubeL2);
   private Room twoGatesDownRightE = new Room(true,false,false,true);
   private Room twoGatesDownLeftE = new Room(false,true,false,true);
   private Room twoGatesUpLeftE = new Room(false,true,true,false, notCubeL5);
   private Room twoGatesRightLeftE = new Room(true,true,false, false, notCubeL2);
   private Room twoGatesDownUpE = new Room(false,false,true, true, notCubeL1);
   
   private Room threeGatesLeftUpDownE = new Room(false,true,true,true, notCubeL3);
   private Room threeGatesLeftUpRightE = new Room(true,true,true,false);
   private Room threeGatesDownRightLeftE = new Room(true, true,false,true, notCubeL3);
   private Room threeGatesRightDownUpE = new Room(true, false,true,true, notCubeL2);
   
   
   private Room twoGatesRightLeftN = new Room(true,true,false, false);


   private Room bossRoom = new Room(true,true,false,false, estran);


   private Stairs stairs = new Stairs(true);
   
   
   protected Room startingRoom = fourDirectionRoom; // the room that player will start at; ONLY ONE SHOULD BE ON PER MAP/FLOOR
   
   
   // do mapping here
   private Room[][] toturialRooms = { 
      {null,    twoGatesDownRight,  twoGatesRightLeftE, stairs},
      {null,    twoGatesDownUp,     null},
      {oneGateRight, startingRoom,     oneGateLeft},
      {null,    twoGatesUpRight,    oneGateLeftE},
   };
   // null are non-exsited area/Room
   
   private Room[][] secondRooms = { 
      {stairs,             threeGatesDownRightLeftE,    oneGateLeft,        null},
      {null,               threeGatesRightDownUp,    twoGatesRightLeft,    oneGateLeftE},
      {twoGatesDownRight,   startingRoom,          oneGateLeft,             null},
      {oneGateUp,          twoGatesUpRightE,        twoGatesRightLeft,    oneGateLeft},
   };

   private Room[][] thiredRooms = { 
      {stairs,       twoGatesDownLeft,              null,                oneGateDownE,        null},
      {null,         threeGatesRightDownUp,    twoGatesDownLeft,      twoGatesDownUp,        null},
      {null,            oneGateUp,           twoGatesUpRight,            threeGatesLeftUpDownE,    null},
      {oneGateRightE,   twoGatesRightLeft,    twoGatesRightLeft,          startingRoom,    twoGatesDownLeft},
      {null,               null,              oneGateRight,            threeGatesLeftUpRight,    twoGatesUpLeftE}
   };

   private Room[][] finalRooms = {
      {null,             oneGateDown,        null},
      {oneGateRight,    startingRoom,   twoGatesRightLeft,    twoGatesRightLeft,    twoGatesRightLeft,    twoGatesRightLeft,    bossRoom,    stairs},
      {null,             oneGateUp,          null},
   };


   private Floor toturialFloor = new Floor(toturialRooms);
   private Floor secondFloor = new Floor(secondRooms);
   private Floor thiredFloor = new Floor(thiredRooms);
   private Floor bossFloor = new Floor(finalRooms);


   protected Floor[] currentFloor = {toturialFloor, secondFloor, thiredFloor, bossFloor};


}