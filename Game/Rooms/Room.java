package Game.Rooms;

public class Room implements Templates {
   
   protected boolean upDoor;
   protected boolean downDoor;
   protected boolean leftDoor;
   protected boolean rightDoor;
   
   private boolean startingRoom;


   public Room(boolean startingRoom ,boolean upDoor, boolean downDoor, 
   boolean leftDoor, boolean rightDoor){
      this.startingRoom = startingRoom;
      this.upDoor = upDoor;
      this.downDoor = downDoor;
      this.leftDoor = leftDoor;
      this.rightDoor = rightDoor;
      
   }

   public Room(){
      Templates.mainRoom();
   }

   

   public void roomGenerater(int openingDirection){

      if(openingDirection == 1){ // need bottom door

      }
      else if(openingDirection == 2){ // need top door

      }
      else if(openingDirection == 3){ // need left door

      }
      else if(openingDirection == 4){ // need right door

      }

      
   }
}

