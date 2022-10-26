package Game.Levels;

import Game.Enemies.Boss;
import Game.Enemies.Enemy;
import Game.Rooms.Floor;
import Game.Rooms.Room;

public class Hierarchy {

   Enemy notCubeL1 = new Enemy(999,0,1);
   Boss estran = new Boss("Estran",100,1,12,1);


   
   private Room fourDirectionRoom = new Room();

   private Room oneGateUp = new Room(false,false,true,false);
   private Room oneGateRight = new Room(true,false,false,false);
   private Room oneGateLeft = new Room(false,true,false,false);
   private Room oneGateDown = new Room(false,false,false,true);

   private Room twoGatesUpRight = new Room(true,false,true,false, notCubeL1);
   private Room twoGatesDownRight = new Room(true,false,false,true);
   private Room twoGatesDownLeft = new Room(false,true,false,true);
   private Room twoGatesUpLeft = new Room(false,true,true,false);
   private Room twoGatesRightLeft = new Room(true,true,false, false);
   private Room twoGatesDownUp = new Room(false,false,true, true);
   
   private Room threeGatesLeftUpDown = new Room(false,true,true,true);
   private Room threeGatesLeftUpRight = new Room(true,true,true,false);
   private Room threeGatesDownRightLeft = new Room(true, true,false,true);


   private Room bossRoom = new Room(false, true,false,false, true);


   protected Room startingRoom = fourDirectionRoom; // the room that game will start at; ONLY ONE SHOULD BE ON THE MAP


   // do mapping here
   private Room[][] ToturalFloor = { 
      {null, twoGatesDownRight,  twoGatesRightLeft, bossRoom},
      {null, twoGatesDownUp, null},
      {oneGateRight, startingRoom, oneGateLeft},
      {null, twoGatesUpRight, oneGateLeft},
      
      
   };
   // null are non-exsited area/Room

   private Room[][] firstFloor = { // Should only be used when deadline is reached & couldn't finishing styling in the main floor
      // 8x8
      // UNFINISHED
      {null,   null,    null,    null},
      {null,   null,    null,    null},
      {null,   null,    null,    null},
      {null,   null,    null,     null},
      
   };

   
   protected Floor currentFloor = new Floor(ToturalFloor);



}