// an object that will start... well cutscenes
// the cutscenes are built the same idea as Room object
// it has been built to be read one by line to allow esay ideas implementation 
// Date: 10/28/2022
package Game.Gameplay.Cutscenes;

import External.Tools;
import Game.Dialogue.Dialogue;
import Game.Gameplay.audio.MusicManager;

public class Cutscene implements CutsenceTemplates {
   
   public static void startingCutscene(){

      MusicManager.transformFromCurrentMusicToOther(13);
      //To do: put starting music
      Tools.ClearConsole();
      Tools.delayer(1000);

      CutsenceTemplates.s1_c1();
      Tools.delayer(1000);
      Dialogue.dialogprint("The FBI are developing a new kind of AI computer Deffence");
      Tools.delayer(1350);
      Dialogue.dialogprint("This tool can access the any computer and any operating system");
      Tools.delayer(5500);

      Tools.ClearConsole();
      CutsenceTemplates.s1_c2();
      Tools.delayer(1000);
      Dialogue.dialogprint("The Tool job is simple");
      Tools.delayer(5500);

      Tools.ClearConsole();
      CutsenceTemplates.s1_c3();
      Tools.delayer(1000);
      Dialogue.dialogprint("Destory every data, algorithm, or point of deffence at that device has");
      Tools.delayer(5500);

      Tools.ClearConsole();
      CutsenceTemplates.s1_c4();
      Tools.delayer(1000);
      Dialogue.dialogprint("Once the tool finds the access key, it will return it with all the info on it");
      Tools.delayer(5500);

      Tools.ClearConsole();
      CutsenceTemplates.s1_c5();
      Tools.delayer(1000);
      Dialogue.dialogprint("Should be easy money");
      Tools.delayer(2000);
      Dialogue.dialogprint("Or is it?");
      Tools.delayer(5500);

      Tools.ClearConsole();
      Tools.delayer(5000);
      Dialogue.dialogprint("Game Developed by Mohamed Elshoubky");
      Tools.delayer(5000);

      MusicManager.stopMusic();

      Tools.delayer(2000);
      Dialogue.dialogprint("???: I have installed a new weapon to your tools, after all, you're a tool are you not? \n");
      Tools.delayer(750);
      Dialogue.dialogprint("???: but I will not teach you how to use it immediately, because... where is the fun in that?");
      Tools.delayer(1250);
      Dialogue.dialogprint("???: and because I'm cool. I will give a hint");
      Tools.delayer(750);
      Dialogue.dialogprint("???: \" When you are in a battle, you can use that special tool by looking for a char on your \n" + 
      "keyboard... \"");
      Tools.delayer(750);
      Dialogue.dialogprint("\" that char is part of word we say about someone who died by someone else. the first latter of that word is the key \"");
      Tools.delayer(1500);
      Dialogue.dialogprint("I might have not taught you that my tool...");
      Tools.delayer(500);
      Dialogue.dialogprint("but I'm sure you figure it out my tool");
      Tools.delayer(500);
      Dialogue.dialogprint("Or shell I call you with a better name?");
      Tools.delayer(1500);
      Tools.ClearConsole();
      Tools.delayer(1500);
      Dialogue.dialogprint("Player?");


      Tools.delayer(4000);
      Tools.AskString("Press Enter to continue...");
      

   }



   /**
    * for Loop:
         diplay scene (i)
         dialogprint(Text)
         Tools.delyer(time)
         loop again
    */
}
