package Game.Main;



import External.Tools;
import Game.Gameplay.Controls.PlayerController;
import Game.Levels.Level1;
import Game.Rooms.Floor;


class Main{
   
   public static void main(String[] args) throws InterruptedException{

      Tools.ClearConsole();
      //Tools.delayer(1500);

      

      //Title.draw();

      Level1 firstLevel = new Level1();
      firstLevel.start();

      //PlayerController PC = new PlayerController();
      //PC.start();

        

   }

}