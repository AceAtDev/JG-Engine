package Game.Levels;

import Game.Enemies.Enemy;
import Game.Rooms.Floor;
import Game.Rooms.Room;

public class Hicrocy {

   Enemy notCubeL1 = new Enemy();


   
   private Room fourDirectionRoom = new Room();

   private Room oneGateUp = new Room(false,false,true,false, notCubeL1);
   private Room oneGateRight = new Room(true,false,false,false);
   private Room oneGateLeft = new Room(false,true,false,false);
   private Room oneGateDown = new Room(false,false,false,true);

   private Room twoGatesUpRight = new Room(true,false,true,false);
   private Room twoGatesDownRight = new Room(true,false,false,true);
   private Room twoGatesDownLeft = new Room(false,true,false,true);
   private Room twoGatesUpLeft = new Room(false,true,true,false);

   private Room threeGatesLeftUpDown = new Room(false,true,true,true);
   private Room threeGatesLeftUpRight = new Room(true,true,true,false);


   protected Room startingRoom = fourDirectionRoom; // the room that game will start at; ONLY ONE SHOULD BE ON THE MAP


   // do mapping here
   private Room[][] baseFloor = { 
      {null, oneGateDown, null},
      {oneGateRight, startingRoom, oneGateLeft},
      {null, oneGateUp, null},
   };


   
   protected Floor currentFloor = new Floor(baseFloor);



}
