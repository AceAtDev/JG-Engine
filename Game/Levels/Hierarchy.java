package Game.Levels;

import Game.Enemies.Boss;
import Game.Enemies.Enemy;
import Game.Rooms.Floor;
import Game.Rooms.Room;

public class Hierarchy {

   Enemy notCubeL1 = new Enemy(30,12,5);
   Enemy estran = new Boss("estran",100,12,12,1);


   
   private Room fourDirectionRoom = new Room();

   private Room oneGateUp = new Room(false,false,true,false, notCubeL1);
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


   private Room bossRoom = new Room(true, false,false,false, estran);


   protected Room startingRoom = fourDirectionRoom; // the room that game will start at; ONLY ONE SHOULD BE ON THE MAP


   // do mapping here
   private Room[][] baseFloor = { 
      {null, twoGatesDownRight,  twoGatesRightLeft, bossRoom},
      {null, twoGatesDownUp, null},
      {oneGateRight, startingRoom, oneGateLeft},
      {null, oneGateUp, null},
      
      
   };


   
   protected Floor currentFloor = new Floor(baseFloor);



}
