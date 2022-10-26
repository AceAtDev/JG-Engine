package Game.Gameplay.Controls;


import External.Tools;
import Game.Dialogue.Dialogue;
import Game.Gameplay.audio.SoundManager;

public class PlayerBattleController {
   
   private static final int playerHP = 100;
   
   private static int currentPlayerHP;
   private static int damage = 15;
   private static int damageMultiplier = 2;
   private static boolean isDeffending = false;
   private static int deffence = 1;


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
      int bounsDamageChance = Tools.randomNumRoller(4);
      SoundManager.playSE(7);
      if(bounsDamageChance == 1){
         SoundManager.playSE(9);
         Dialogue.dialogprint("YOU HIT A CRIT HIT!");
         //play crit hit sfx
         Tools.delayer(250);
         enemyHP -= damage * damageMultiplier;
         return enemyHP;
      }
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
