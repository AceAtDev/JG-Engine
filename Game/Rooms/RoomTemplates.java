package Game.Rooms;
// will hold the graphics of the rooms

public interface RoomTemplates {


   //

   public static void mainRoom(){
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("╬╬╬╬╬╬╬╬╬▒▒▒▒▒▒▒▒▒▒▒▒╬╬╬╬╬╬╬╬╬");
      System.out.println("╬╬╬╬╬╬╬╬╬▒▒▒▒▒▒▒▒▒▒▒▒╬╬╬╬╬╬╬╬╬");
      System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
      System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
      System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
   }

   
   

   public static void closedRoom(){ // not used
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

      System.out.println("██████████████████████████████");
      System.out.println("██████████████████████████████");
      System.out.println("██████████████████████████████");
      System.out.println("██████████████████████████████");
      System.out.println("╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬█████████");
      System.out.println("╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬█████████");
      System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("██████████████████████████████");
      System.out.println("██████████████████████████████");
      System.out.println("██████████████████████████████");
      System.out.println("██████████████████████████████");
   }

   public static void oneGateRight(){

      System.out.println("██████████████████████████████");
      System.out.println("██████████████████████████████");
      System.out.println("██████████████████████████████");
      System.out.println("██████████████████████████████");
      System.out.println("█████████╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬");
      System.out.println("█████████╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
      System.out.println("██████████████████████████████");
      System.out.println("██████████████████████████████");
      System.out.println("██████████████████████████████");
      System.out.println("██████████████████████████████");

   }

   public static void oneGateUp(){
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("██████████████████████████████");
      System.out.println("██████████████████████████████");
      System.out.println("██████████████████████████████");
      System.out.println("██████████████████████████████");
   }

   public static void oneGateDown(){
      System.out.println("██████████████████████████████");
      System.out.println("██████████████████████████████");
      System.out.println("██████████████████████████████");
      System.out.println("██████████████████████████████");
      System.out.println("█████████╬╬╬╬╬╬╬╬╬╬╬╬█████████");
      System.out.println("█████████╬╬╬╬╬╬╬╬╬╬╬╬█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
   }



   

   public static void twoGatesUpDown(){

      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
   }

   public static void twoGatesRightLeft(){
      System.out.println("██████████████████████████████");
      System.out.println("██████████████████████████████");
      System.out.println("██████████████████████████████");
      System.out.println("██████████████████████████████");
      System.out.println("╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬");
      System.out.println("╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬");
      System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
      System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
      System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
      System.out.println("██████████████████████████████");
      System.out.println("██████████████████████████████");
      System.out.println("██████████████████████████████");
      System.out.println("██████████████████████████████");
   }

   public static void twoGatesUpLeft(){
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("╬╬╬╬╬╬╬╬╬▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("╬╬╬╬╬╬╬╬╬▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("██████████████████████████████");
      System.out.println("██████████████████████████████");
      System.out.println("██████████████████████████████");
      System.out.println("██████████████████████████████");
   }

   public static void twoGatesLeftDown(){
      System.out.println("██████████████████████████████");
      System.out.println("██████████████████████████████");
      System.out.println("██████████████████████████████");
      System.out.println("██████████████████████████████");
      System.out.println("╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬█████████");
      System.out.println("╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬█████████");
      System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
   }

   public static void twoGatesUpRight(){

      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒╬╬╬╬╬╬╬╬╬");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒╬╬╬╬╬╬╬╬╬");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
      System.out.println("██████████████████████████████");
      System.out.println("██████████████████████████████");
      System.out.println("██████████████████████████████");
      System.out.println("██████████████████████████████");
   }

   public static void twoGatesRightDown(){
      System.out.println("██████████████████████████████");
      System.out.println("██████████████████████████████");
      System.out.println("██████████████████████████████");
      System.out.println("██████████████████████████████");
      System.out.println("█████████╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬");
      System.out.println("█████████╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
   }
   




   public static void threeGatesDownRightLeft(){
      System.out.println("██████████████████████████████");
      System.out.println("██████████████████████████████");
      System.out.println("██████████████████████████████");
      System.out.println("██████████████████████████████");
      System.out.println("╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬");
      System.out.println("╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬");
      System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
      System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
      System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
   }
   
   public static void threeGatesRightDownUp(){
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒╬╬╬╬╬╬╬╬╬");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒╬╬╬╬╬╬╬╬╬");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒+");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
      System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████");
   }

   public static void threeGatesLeftUpDown(){
        System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████\n"+
                           "█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████\n"+
                           "█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████\n"+
                           "█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████\n"+
                           "╬╬╬╬╬╬╬╬╬▒▒▒▒▒▒▒▒▒▒▒▒█████████\n"+
                           "╬╬╬╬╬╬╬╬╬▒▒▒▒▒▒▒▒▒▒▒▒█████████\n"+
                           "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█████████\n"+
                           "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█████████\n"+
                           "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█████████\n"+
                           "█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████\n"+
                           "█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████\n"+
                           "█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████\n"+
                           "█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████"
                           );
   }

   public static void threeGatesLeftRightUp(){
        System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████\n"+
                           "█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████\n"+
                           "█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████\n"+
                           "█████████▒▒▒▒▒▒▒▒▒▒▒▒█████████\n"+
                           "╬╬╬╬╬╬╬╬╬▒▒▒▒▒▒▒▒▒▒▒▒╬╬╬╬╬╬╬╬╬\n"+
                           "╬╬╬╬╬╬╬╬╬▒▒▒▒▒▒▒▒▒▒▒▒╬╬╬╬╬╬╬╬╬\n"+
                           "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n"+
                           "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n"+
                           "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n"+
                           "██████████████████████████████\n"+
                           "██████████████████████████████\n"+
                           "██████████████████████████████\n"+
                           "██████████████████████████████"
                           );
   }


}
