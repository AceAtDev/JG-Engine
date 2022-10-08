package Game.Rooms;

public class Room implements Templates {
   
   protected boolean upDoor;
   protected boolean downDoor;
   protected boolean leftDoor;
   protected boolean rightDoor;
   protected boolean isClosedRoom;
   
   private int id;


   /* Room Directions


                      UP: 1
               +------------------+
               +                  +
               +                  +
 Left: 3 <--   +                  +  --> Right: 2
               +                  +
               +                  +
               +                  +
               +------------------+
                      Down: 0
   
   
   */
   

   public int getRoomValue(){
      id = -1;
      return id;
   }


   public Room(){ // Starting Room
      
   }

   public Room(boolean isClosedRoom){
      this.isClosedRoom = isClosedRoom;
   }

   public void printMainRoom(){
      Templates.mainRoom();
   }

   public Room(int direction){

   }

   

}

