package Game.Main;



import External.Tools;
import Game.Rooms.Map;


class Main{
   
   public static void main(String[] args){

        Tools.ClearConsole();

        Map Rmanager = new Map();

        Rmanager.manageRooms();
        

   }

}