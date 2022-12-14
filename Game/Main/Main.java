package Game.Main;



import Game.Credits;
import Game.Tools;
import Game.Dialogue.Dialogue;
import Game.Gameplay.Cutscenes.Cutscene;
import Game.Levels.Level1;
import Game.Levels.Level2;
import Game.Levels.Level3;
import Game.Levels.Level4;

// Game By Mohamed Elshoubky
class Main{
   
   public static void main(String[] args){

      
      Tools.ClearConsole();
      
      
      Dialogue.dialogprint("Game uses music and sound.");
      Tools.delayer(1000);
      Dialogue.dialogprint("For better experience please rise the sound of your device");
      Tools.delayer(3500);
      Tools.ClearConsole();
      
      Credits.print();

      Title.draw();
      


      Cutscene.startingCutscene();
       
       
      Level1 firstLevel = new Level1();
      firstLevel.start();


      Level2 secondLevel = new Level2();
      secondLevel.start();


      Level3 thirdLevel = new Level3();
      thirdLevel.start();


      Level4 fourthLevel = new Level4();
      fourthLevel.start();
   

      WinScreen.printWin();

   }


}