package Game;

import Game.Dialogue.Dialogue;

public class Credits {
   public static void print(){
      System.out.println("Music/SFX CREDITS:");
      Dialogue.dialogprint("- Peyton");
      Dialogue.dialogprint("- Lena Raine");
      Dialogue.dialogprint("- Toby fox");
      Tools.delayer(1000);
      Dialogue.dialogprint("Check their special work!");
      Tools.delayer(4000);
      Tools.ClearConsole();

   }
}
