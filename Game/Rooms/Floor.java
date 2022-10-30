// Floor is a room manager that is responsible to put rooms in a level
// Date: 10/28/2022
package Game.Rooms;

public class Floor {


   private Room currentRoom = null;
   private int currentRoomX = 0; // put them private after testing
   private int currentRoomY = 0; // put them private after testing
   private Stairs floorStair = new Stairs(true);

   

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

      if(currentRoom.hasStairs == true){
         floorStair.moveNextFloor();
      }
   }

   private void checkEnemy(){
      if(currentRoom.doesContainEnemy != null){
         currentRoom.callEnemy();
      }
   }


   public Room lookForStartingRoom(Room startingRoom){

      for(int y = 0; y < floor.length; y++){
         for(int x = 0; x < floor[0].length - 1; x++){
            if(floor[y][x] == startingRoom){
               currentRoomX = x;
               currentRoomY = y;
               currentRoom = startingRoom;
               return currentRoom;
            }
         }
      }

      throw new IllegalStateException("could not find starting Room and/or Stairs Room");
   }



}

//public interface Rodom{

//}
