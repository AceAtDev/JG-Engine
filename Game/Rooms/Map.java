package Game.Rooms;

public class Map {
   
   public double currentRoom;

   final static double startingRoom = 5;

   public void manageRooms(){
      double[][] map = 
         {{0,0,0,0,0},
          {0,0,1,0,0},
          {0,1,5,1,0},
          {0,0,1,0,0},
          {0,0,0,0,0}};

      for (double[] line : map) {
         for (double roomValue : line){
            if (roomValue == 5){

            }
         }
      }
   }

   public double findPotentialRooms(){
      return (Double) null;
   }

   
}
