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



   }

   static void twoGatesRoom(boolean rightDoor,boolean leftDoor, boolean downDoor,boolean upDoor){

      if(rightDoor & leftDoor & upDoor & downDoor){
         throw new IllegalArgumentException("The \"thereGatesRoom\" can NOT have all boolean true");
      }

      
   }
}
