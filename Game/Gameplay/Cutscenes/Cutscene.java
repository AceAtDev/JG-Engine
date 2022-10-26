package Game.Gameplay.Cutscenes;

import External.Tools;
import Game.Dialogue.Dialogue;

public class Cutscene implements CutsenceTemplates {
   
   public static void startingCutscene(){

      //To do: put starting music
      CutsenceTemplates.s1_c1();
      Tools.delayer(1000);
      Dialogue.dialogprint("Test example test");
      Tools.delayer(3500);

      CutsenceTemplates.s1_c1();
      Tools.delayer(1000);
      Dialogue.dialogprint("Test example test 2");
      Tools.delayer(3500);

   }



   /**
    * for Loop:
         diplay scene (i)
         dialogprint(Text)
         Tools.delyer(time)
         loop again
    */
}
