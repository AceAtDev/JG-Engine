package Game.Main;



import External.Tools;
import Game.Gameplay.Controls.PlayerController;
import Game.Rooms.Floor;


class Main{
   
   public static void main(String[] args) throws InterruptedException{

      Tools.ClearConsole();
      Tools.delayer(1500);

      Title.draw();

      PlayerController PC = new PlayerController();
      PC.start();

        

   }

}