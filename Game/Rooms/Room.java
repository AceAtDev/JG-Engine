package Game.Rooms;

public class Room implements Templates {
   



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
      this.up = up;
      this.right = right;
      this.down = down;
      this.left = left;
   }


   public void print(){

      if(right == 2 && left == 0 && up == 0 && down == 0){ // right
         Templates.oneGateRight();
         return;
      }
      if(right == 0 && left == 3 && up == 0 && down == 0){ // left
         Templates.oneGateLeft();
         return;
      }
      if(right == 0 && left == 0 && up == 1 && down == 0){ // up
         Templates.oneGateUp();
         return;
      }
      if(right == 0 && left == 0 && up == 0 && down == 4){ // down
         Templates.oneGateDown();
         return;
      }



      if(right == 2 && left == 3 && up == 0 && down == 0){ // right - left 

         return;
      }
      if(right == 2 && left == 0 && up == 1 && down == 0){ // right - up

         return;
      }
      if(right == 2 && left == 0 && up == 0 && down == 4){ // right - down

         return;
      }

      if(right == 0 && left == 3 && up == 1 && down == 0){ // left - up

         return;
      }
      if(right == 0 && left == 3 && up == 0 && down == 4){ // left - down

         return;
      }
      if(right == 0 && left == 0 && up == 1 && down == 4){ // up - down

         return;
      }






      Templates.mainRoom();
   }
 

}

