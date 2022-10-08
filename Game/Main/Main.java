package Game.Main;



import External.Tools;
import Game.Gameplay.Controls.PlayerController;
import Game.Rooms.Map;


class Main{
   
   public static void main(String[] args){

        Tools.ClearConsole();

      PlayerController PC = new PlayerController();
      PlayerController.start();
        

   }

}