package Game.Rooms;


public interface Templates {


   public static void mainRoom(){
      System.out.println("+---------+          +--------+");
      System.out.println("|         |          |        |");
      System.out.println("|         |          |        |");
      System.out.println("|         |          |        |");
      System.out.println("+---------+          +--------+");
      System.out.println("                               ");
      System.out.println("                               ");
      System.out.println("                               ");
      System.out.println("+---------+          +--------+");
      System.out.println("|         |          |        |");
      System.out.println("|         |          |        |");
      System.out.println("|         |          |        |");
      System.out.println("+---------+          +--------+");
   }



   public static void closedRoom(){
      System.out.println("+-----------------------------+");
      System.out.println("|                             |");
      System.out.println("|                             |");
      System.out.println("|                             |");
      System.out.println("|                             |");
      System.out.println("|                             |");
      System.out.println("|                             |");
      System.out.println("|                             |");
      System.out.println("|                             |");
      System.out.println("|                             |");
      System.out.println("|                             |");
      System.out.println("|                             |");
      System.out.println("+-----------------------------+");
   }





   public static void oneGateLeft(){

      System.out.println("+-----------------------------+");
      System.out.println("|                             |");
      System.out.println("|                             |");
      System.out.println("|                             |");
      System.out.println("+------------------------+    |");
      System.out.println("                         |    |");
      System.out.println("                         |    |");
      System.out.println("                         |    |");
      System.out.println("+------------------------+    |");
      System.out.println("|                             |");
      System.out.println("|                             |");
      System.out.println("|                             |");
      System.out.println("+-----------------------------+");

   }

   public static void oneGateRight(){

      System.out.println("+-----------------------------+");
      System.out.println("|                             |");
      System.out.println("|                             |");
      System.out.println("|                             |");
      System.out.println("|    +------------------------+");
      System.out.println("|    |                         ");
      System.out.println("|    |                         ");
      System.out.println("|    |                         ");
      System.out.println("|    +------------------------+");
      System.out.println("|                             |");
      System.out.println("|                             |");
      System.out.println("|                             |");
      System.out.println("+-----------------------------+");

   }

   public static void oneGateUp(){
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

   public static void oneGateDown(){
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





   static void twoGatesUpDown(){

      System.out.println("+-------    -------+");
      System.out.println("+                  +");
      System.out.println("+                  +");
      System.out.println("+                  +");
      System.out.println("+                  +");
      System.out.println("+                  +");
      System.out.println("+-------    -------+");

   }
}
