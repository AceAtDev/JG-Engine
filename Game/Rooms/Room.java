package Game.Rooms;

public class Room implements RoomTemplates {
   



   //protected int up = 1;
   //protected int right = 2;
   //protected int left = 3;
   //protected int down = 4;

   protected boolean right = true;
   protected boolean left = true;
   protected boolean up = true;
   protected boolean down = true;


   //private int id;


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

   public Room(boolean right, boolean left, boolean up, boolean down){
      this.up = up;
      this.right = right;
      this.down = down;
      this.left = left;

   }



   public boolean getRoomExitLeft(){
      return left;
   }
   public boolean getRoomExitRight(){
      return right;
   }
   public boolean getRoomExitUp(){
      return up;
   }
   public boolean getRoomExitDown(){
      return down;
   }
   

   public void print(){

      if(right && !left && !up && !down){ // right
         RoomTemplates.oneGateRight();
         return;
      }
      if(!right && left && !up && !down){ // left
         RoomTemplates.oneGateLeft();
         return;
      }
      if(!right && !left && up && !down){ // up
         RoomTemplates.oneGateUp();
         return;
      }
      if(!right && !left  && !up && down){ // down
         RoomTemplates.oneGateDown();
         return;
      }



      if(right && left && !up && !down ){ // right - left 
         RoomTemplates.twoGatesRightLeft();
         return;
      }
      if(right && !left && up  && !down ){ // right - up
         RoomTemplates.twoGatesUpRight();
         return;
      }
      if(right && !left  && !up  && down ){ // right - down
         RoomTemplates.twoGatesRightDown();
         return;
      }

      if(!right  && left  && up && !down ){ // left - up
         RoomTemplates.twoGatesUpLeft();
         return;
      }
      if(!right && left  && !up  && down ){ // left - down
         RoomTemplates.twoGatesLeftDown();
         return;
      }
      if(!right && !left && up && down ){ // up - down
         RoomTemplates.twoGatesUpRight();
         return;
      }



      if(right  && left  && up && !down ){ // right - left - up
         RoomTemplates.threeGatesLeftRightUp();
         return;
      }
      if(right && left && !up && down ){ // right - left - down
         RoomTemplates.threeGatesDownRightLeft();
         return;
      }
      if(right && !left && up && down ){ // right - up - down
         RoomTemplates.threeGatesRightDownUp();
         return;
      }
      if(!right && left  && up && down ){ // left - up - down
         RoomTemplates.threeGatesLeftUpDown();
         return;
      }



      if(right && left && up && down ){ // open form every direction
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

