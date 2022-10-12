package Game.Rooms;

public class Room implements RoomTemplates {
   



   protected int up = 1;
   protected int right = 2;
   protected int left = 3;
   protected int down = 0;

   private int id;


   /* Room Directio:ns
                      UP: 1
               +------------------+
               +                  +
               +                  +
 Left: 3 <--   +                  +  --> Right: 2
               +                  +
               +                  +
               +                  +
               +------------------+
                      Down: 4  
   */
   

   public Room(){

   }

   public Room(int id, int up, int right, int left, int down){
      this.id = id;
      this.up = up;
      this.right = right;
      this.down = down;
      this.left = left;
   }



   public void print(){

      if(right == 2 && left == 0 && up == 0 && down == 0){ // right
         RoomTemplates.oneGateRight();
         return;
      }
      if(right == 0 && left == 3 && up == 0 && down == 0){ // left
         RoomTemplates.oneGateLeft();
         return;
      }
      if(right == 0 && left == 0 && up == 1 && down == 0){ // up
         RoomTemplates.oneGateUp();
         return;
      }
      if(right == 0 && left == 0 && up == 0 && down == 4){ // down
         RoomTemplates.oneGateDown();
         return;
      }



      if(right == 2 && left == 3 && up == 0 && down == 0){ // right - left 
         RoomTemplates.twoGatesRightLeft();
         return;
      }
      if(right == 2 && left == 0 && up == 1 && down == 0){ // right - up
         RoomTemplates.twoGatesUpRight();
         return;
      }
      if(right == 2 && left == 0 && up == 0 && down == 4){ // right - down
         RoomTemplates.twoGatesRightDown();
         return;
      }

      if(right == 0 && left == 3 && up == 1 && down == 0){ // left - up
         RoomTemplates.twoGatesUpLeft();
         return;
      }
      if(right == 0 && left == 3 && up == 0 && down == 4){ // left - down
         RoomTemplates.twoGatesLeftDown();
         return;
      }
      if(right == 0 && left == 0 && up == 1 && down == 4){ // up - down
         RoomTemplates.twoGatesUpRight();
         return;
      }



      if(right == 2 && left == 3 && up == 1 && down == 0){ // right - left - up
         RoomTemplates.threeGatesLeftRightUp();
         return;
      }
      if(right == 2 && left == 3 && up == 0 && down == 4){ // right - left - down
         RoomTemplates.threeGatesDownRightLeft();
         return;
      }
      if(right == 2 && left == 0 && up == 1 && down == 4){ // right - up - down
         RoomTemplates.threeGatesRightDownUp();
         return;
      }
      if(right == 0 && left == 3 && up == 1 && down == 4){ // left - up - down
         RoomTemplates.threeGatesLeftUpDown();
         return;
      }



      if(right == 2 && left == 3 && up == 1 && down == 4){ // open form every direction
         RoomTemplates.mainRoom();
         return;
      }



      throw new IllegalStateException("Could not find match to draw Room with\n" +
         "Right: " + right + "\n" +
         "Left: " + left + "\n" +
         "Up: " + up + "\n" +
         "Down: " + down + "\n" +
         "Are you missing a possible room with those values?");

   }
 

}

