package Game.Main;



import External.Tools;
import Game.Gameplay.Controls.PlayerController;
import Game.Rooms.Floor;


class Main{
   
   public static void main(String[] args){

      Tools.ClearConsole();

      //Title.draw();

      PlayerController PC = new PlayerController();
      PlayerController.start();

        

   }

}