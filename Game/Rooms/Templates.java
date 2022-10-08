package Game.Rooms;


public interface Templates {


   static void mainRoom(){


      System.out.println
      ("+-------    -------+\n"+
      "+                  +\n"+
      "+                  +\n"+
      "                   \n"+
      "                   \n"+      
      "+                  +\n"+
      "+                  +\n"+
       "+-------    -------+");
   }

   static void oneGateRoom(int direction){

      if(direction == 1){ // need bottom door
         System.out.println
         ("+------------------+\n"+
         "+                  +\n"+
         "+                  +\n"+
         "+                  +\n"+
         "+                  +\n"+      
         "+                  +\n"+
         "+                  +\n"+
          "+-------    -------+");
      }
      else if(direction == 2){ // need top door
         System.out.println
         ("+-------    -------+\n"+
         "+                  +\n"+
         "+                  +\n"+
         "+                  +\n"+
         "+                  +\n"+      
         "+                  +\n"+
         "+                  +\n"+
          "+------------------+");
      }
      else if(direction == 3){ // need left door
         System.out.println
         ("+------------------+\n"+
         "+                  +\n"+
         "+                  +\n"+
         "                   +\n"+
         "                   +\n"+      
         "+                  +\n"+
         "+                  +\n"+
          "+------------------+");
      }
      else if(direction == 4){ // need right door
         System.out.println
         ("+------------------+\n"+
         "+                  +\n"+
         "+                  +\n"+
         "+                  \n"+
         "+                  \n"+      
         "+                  +\n"+
         "+                  +\n"+
          "+------------------+");
      }
      else{
         throw new IllegalArgumentException("Invalid direction");
      }

   }

   static void twoGatesRoom(boolean rightDoor,boolean leftDoor, boolean downDoor,boolean upDoor){

      if(rightDoor & leftDoor & upDoor & downDoor){
         throw new IllegalArgumentException("The \"thereGatesRoom\" can NOT have all boolean true");
      }

      
   }
}
