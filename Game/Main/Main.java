package Game.Main;



import External.Tools;
import Game.Dialogue.Dialogue;
import Game.Levels.Level1;


class Main{
   
   public static void main(String[] args){

      Tools.ClearConsole();

      Dialogue.dialogprint("Game uses music and sound.");
      Tools.delayer(1250);
      Dialogue.dialogprint("For better experience please rise the sound of you device");
      Tools.delayer(2750);
      Tools.ClearConsole();

      Level1 firstLevel = new Level1();
      firstLevel.start();
   

   }

}