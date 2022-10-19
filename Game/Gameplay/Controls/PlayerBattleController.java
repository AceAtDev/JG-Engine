package Game.Gameplay.Controls;

import External.Tools;
import Game.Dialogue.Dialogue;

public class PlayerBattleController {
   
   private static final int playerHP = 100;
   
   private static int currentPlayerHP;
   private static int damage = 15;
   private static boolean isDeffending = false;
   private static int deffence = 2;


   public static int getCurrentHP(){
      if(currentPlayerHP <= 0){
         return playerHP;
      }
      return currentPlayerHP;
   }

   public static void setCurrentHp(int hp){
      currentPlayerHP = hp;
   }


   public static int doDamage(int enemyHP) {
      enemyHP -= damage;
      return enemyHP;
   }

   public static boolean setDodgeAttack(boolean state){
      isDeffending = state;
      return isDeffending;
   }

   public static boolean isDodgeAttack(){
      return isDeffending;
   }

   public static int getDeffence(){
      return deffence;
   }

   public static int setDeffence(int value) {
      deffence = value;
      return deffence;
   }

   
}
