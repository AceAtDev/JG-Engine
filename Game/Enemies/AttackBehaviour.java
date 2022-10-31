// Templates of enemy attack and turns
// Date: 10/28/2022
package Game.Enemies;

import External.Tools;
import Game.Dialogue.Dialogue;
import Game.Gameplay.Controls.PlayerStates;
import Game.Gameplay.audio.SoundManager;

public class AttackBehaviour extends Enemy {

   private static boolean warnedPlayer;

   private static int addedDamage = 0;

   
   public static int enemyTurn(int playerHP, String name, int hp, int damage, int damageMultiplier) {
      int chances = Tools.randomNumRoller(9);
      boolean canSA = false;

      if(chances == 1 || chances == 2){
         canSA = true;

      }
      if(chances == 4){
         addedDamage += 3;
         damage += addedDamage;
         Dialogue.dialogprint(name + " drunk a red lucid... " + name + "'s damage increased by +3 for this attack");
         Tools.delayer(1000);
      }




      Tools.delayer(1000);

      if(warnedPlayer == true){
         warnedPlayer = false;
         canSA = false;
         return specialAttack(damage, playerHP, name, damageMultiplier);
        
      }

      if(canSA){
         Dialogue.dialogprint(name + " is preparing to use their special attack the next round, you should deffend yourself");
         Tools.delayer(750);
         warnedPlayer = true;
         canSA = false;
         return playerHP;
      }

      System.out.println(name + " decided to attack!");
      PlayerStates.setDodgeAttack(false);
      Tools.delayer(750);
      // play damage audio
      SoundManager.playSE(6);
      return attack(playerHP, damage);
      

   }

   private static int specialAttack(int damage, int playerHP, String name, int damageMultiplier){
      
      Dialogue.dialogprint(name + " has used their special attack");
      SoundManager.playSE(9);
      

      Tools.delayer(1250);
      if(PlayerStates.isDodgeAttack() == true){// player dodged special attack
         
         // play audio special attack deffend
         SoundManager.playSE(10);

         Dialogue.dialogprint("However, You have deffend the attack!");
         Tools.delayer(1000);
         
         PlayerStates.setDodgeAttack(false);
         return playerHP;
      }

      SoundManager.playSE(6);
      return attack(playerHP, damage * damageMultiplier);
   }


}
