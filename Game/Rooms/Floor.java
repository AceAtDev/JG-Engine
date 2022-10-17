package Game.Rooms;


public class Floor {


   private Room currentRoom = null;
   public int currentRoomX = 0; // put them private after testing
   public int currentRoomY = 0; // put them private after testing
   

   private Room[][] floor;
   



   public Floor(Room[][] arrayOfRooms){
      this.floor = arrayOfRooms;
   }


   public Room[][] getFloor(){
      return floor;
   }

   public Room[][] setFloor(Room[][] newFloor){
      floor = newFloor;
      return floor;
   }


   public Room getCurrentRoom(){
      return currentRoom;
   }

   public Room setCurrentRoom(Room room){
      currentRoom = room;
      return currentRoom;
   }

   public Room getCurrentRoomPosition(){
      return floor[currentRoomX][currentRoomY];
   }

   public Room setCurrentRoomPosition(int x, int y){
      currentRoom = floor[x][y];
      return currentRoom;
   }



   public Room moveRight(){
      currentRoomX += 1;
      updateRoom();
      checkEnemy();
      return currentRoom;
   }

   public Room moveLeft(){
      currentRoomX -= 1;
      updateRoom();
      checkEnemy();
      return currentRoom;
   }

   public Room moveUp(){
      currentRoomY -= 1;
      updateRoom();
      checkEnemy();
      return currentRoom;
   }

   public Room moveDown(){
      currentRoomY += 1;
      updateRoom();
      checkEnemy();
      return currentRoom;
   }


   private void updateRoom(){
      currentRoom = floor[currentRoomY][currentRoomX]; 
   }

   private void checkEnemy(){
      if(currentRoom.doesContainEnemy != null){
         currentRoom.callEnemy();
         System.out.println("Room has an enemy");
      }
   }


   public Room lookForStartingRoom(Room startingRoom){

      for(int y = 0; y < floor.length; y++){
         for(int x = 0; x < floor.length; x++){
            if(floor[y][x] == startingRoom){
               currentRoomX = x;
               currentRoomY = y;
               currentRoom = startingRoom;
               return currentRoom;
            }
         }
      }

      throw new IllegalStateException("could not find starting Room");
   }





}

//public interface Rodom{

//}
