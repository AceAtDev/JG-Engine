package Game.Gameplay.Controls;


import External.Tools;
import Game.Dialogue.Dialogue;
import Game.Gameplay.audio.SoundManager;

public class PlayerBattleController {
   
   private static final int playerHP = 100;
   
   private static int currentPlayerHP;
   private static int damage = 15;
   private static int damageMultiplier = 1;
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
      int bounsDamageChance = Tools.randomNumRoller(3);
      if(bounsDamageChance == 1){
         Dialogue.dialogprint("YOU HIT A CRIT HIT!");
         //play crit hit sfx
         Tools.delayer(500);
         return bounsDamage(enemyHP);
      }
      SoundManager.playSE(7);
      enemyHP -= damage;
      return enemyHP;
   }

   private static int bounsDamage(int enemyHP) {
      enemyHP -= damage * damageMultiplier;
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
