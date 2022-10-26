package Game.Gameplay.Cutscenes;

import External.Tools;
import Game.Dialogue.Dialogue;
import Game.Gameplay.audio.MusicManager;

public class Cutscene implements CutsenceTemplates {
   
   public static void startingCutscene(){

      MusicManager.transformFromCurrentMusicToOther(13);
      //To do: put starting music
      Tools.ClearConsole();
      CutsenceTemplates.s1_c1();
      Tools.delayer(1000);
      Dialogue.dialogprint("The FBI are developing a new kind of AI computer Deffence");
      Tools.delayer(1350);
      Dialogue.dialogprint("This tool can access the any computer and any operating system");
      Tools.delayer(3500);

      Tools.ClearConsole();
      CutsenceTemplates.s1_c2();
      Tools.delayer(1000);
      Dialogue.dialogprint("The Tool job is simple");
      Tools.delayer(3500);

      Tools.ClearConsole();
      CutsenceTemplates.s1_c3();
      Tools.delayer(1000);
      Dialogue.dialogprint("Destory every data, algorithm, or point of deffence at that device has");
      Tools.delayer(3500);

      Tools.ClearConsole();
      CutsenceTemplates.s1_c4();
      Tools.delayer(1000);
      Dialogue.dialogprint("Once the tool finds the access key, it will return it with all the info on it");
      Tools.delayer(3500);

      Tools.ClearConsole();
      CutsenceTemplates.s1_c5();
      Tools.delayer(1000);
      Dialogue.dialogprint("Easy money");
      Tools.delayer(3500);

      Tools.ClearConsole();
      Tools.delayer(5000);
      Dialogue.dialogprint("Game Developed by Mohamed Elshoubky");
      Tools.delayer(3000);
      Tools.AskString("Press Enter to continue...");
      MusicManager.stopMusic();
      

   }



   /**
    * for Loop:
         diplay scene (i)
         dialogprint(Text)
         Tools.delyer(time)
         loop again
    */
}
