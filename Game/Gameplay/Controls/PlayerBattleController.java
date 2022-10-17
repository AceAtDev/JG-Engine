package Game.Gameplay.Controls;

import External.Tools;
import Game.Dialogue.Dialogue;

public class PlayerBattleController {
   
   private static final int playerHp = 100;
   protected static int currentPlayerHP = playerHp;
   private int damage = 15;


   public void playerchoses(int chose, int enemyHP) {
      switch(chose){
         case 1:
         // play damage audio
         enemyHP = doDamage(enemyHP);
         break;

         case 2:
         break;
         default:
         Dialogue.dialogprint("You have chose none of the options given... for that you're turn is gone for this round :)");
         Tools.delayer(1000);
         System.out.println("LOL");
      }
   }

   public static int getCurrentHP(){
      return currentPlayerHP;
   }


   public int doDamage(int enemyHP) {
      enemyHP -= damage;
      return enemyHP;
   }

   public boolean dodgerAttack(){
      return true;
   }

   
}
