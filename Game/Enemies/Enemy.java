package Game.Enemies;

import java.util.Random;


import External.Tools;
import Game.Dialogue.Dialogue;
import Game.Gameplay.Controls.PlayerBattleController;
import Game.Gameplay.audio.MusicManager;
import Game.Gameplay.audio.SoundManager;
import Game.Main.LoseScreen;
import Game.Rooms.Room;

public class Enemy implements EnemyTemplates {


   protected String name = "Not Cube";
   protected int damage = 5;
   protected int hp = 20;
   protected int deffence = 1;
   protected int rank = 0;

   private int damageMultiplier = 4;
   boolean warnedPlayer = false;


   public Enemy(){

   }


   public Enemy(int hp, int deffence, int damage){
      this.hp = hp;
      this.deffence = deffence;
      this.damage = damage;
   }

   public Enemy(String name, int hp, int deffence, int damage){
      this.name = name;
      this.hp = hp;
      this.deffence = deffence;
      this.damage = damage;
   }

   public void enemyChallenged(int playerHP) {

      MusicManager.stopMusic();
      Tools.delayer(500);
      Dialogue.dialogprint("An enemy had blooked you way");
      SoundManager.playSE(5);
      Tools.delayer(1750);


      // play audio
      int currentPlayerHP = playerHP;
      int currentEnemyHP = hp;
      // stop WANDERING music
      MusicManager.transformFromCurrentMusicToOther(0);
      while(currentPlayerHP > 0){
         
         
         print();
         System.out.println(name + " is blooking your way!");
         System.out.println(name + " HP's: " + currentEnemyHP);
         System.out.println("Your HP: " + currentPlayerHP);
         int playerChose = Tools.AskInt(
         "1: Attack\n" +
         "2: Deffend");
         
         switch(playerChose){
            case 1:
            // play damage audio
            currentEnemyHP = PlayerBattleController.doDamage(currentEnemyHP) + deffence;
            break;
   
            case 2:
            PlayerBattleController.setDodgeAttack(true);

            break;
            default:
            Dialogue.dialogprint("You have chose none of the options given... for that you're turn is gone for this round :)");
            Tools.delayer(1000);
            System.out.println("LOL");
         }



         if(currentEnemyHP <= 0){
            MusicManager.transformFromCurrentMusicToOther(8);
            // play enemy death anaimation
            // play victory sound
            currentPlayerHP += 10;
            PlayerBattleController.setCurrentHp(currentPlayerHP); // Update player's hp
            Tools.ClearConsole();
            // play audio victory
            System.out.println("YOU WON! YOU HAVE RESTORED 10 HEALH POINTS!");
            Tools.AskString("Press Enter to continue");
            return;
         }
         

         currentPlayerHP = enemyTurn(currentPlayerHP); // damage player

      }

      LoseScreen.playLoseScreen();

   }

   
   Random rand = new Random();
   private int enemyTurn(int playerHP){
      int chances = rand.nextInt(6);
      boolean canSA = false;

      if(chances == 1){
         canSA = true;
      }
      if(chances  == 3 || chances == 4){
         abilty(chances);
      }
      else{
         canSA = false;
      }

      Tools.delayer(1000);

      if(warnedPlayer == true){
         warnedPlayer = false;
         canSA = false;

         Dialogue.dialogprint(name + " has used their special attack");
         // play audio special attack
         

         Tools.delayer(1250);
         if(PlayerBattleController.isDodgeAttack() == true){// player dodged special attack
            
            // play audio special attack deffend

            Dialogue.dialogprint("However, You dodged the attack!");
            Tools.delayer(1000);
            

            PlayerBattleController.setDodgeAttack(false);
            return playerHP;
         }

         SoundManager.playSE(6);
         return specialAttack(playerHP);
      }

      if(canSA){
         Dialogue.dialogprint(name + " is preparing to use their special attack the next round, you should deffend yourself");
         Tools.delayer(750);
         warnedPlayer = true;
         canSA = false;
         return playerHP;
      }

      System.out.println(name + " decided to attack!");
      PlayerBattleController.setDodgeAttack(false);
      Tools.delayer(750);
      // play damage audio
      SoundManager.playSE(6);
      return attack(playerHP);
      

   }


   private void abilty(int chance){

      if(chance == 4){
         damage = damage * 2;
         Dialogue.dialogprint(name + " drunk a red lucid... " + name + "'s damage increased by x2");
         Tools.delayer(1000);
         return;
      }

      Dialogue.dialogprint(name + " wore an iron armor! " + name + "'s deffence increased by x2");
      Tools.delayer(250);
      Dialogue.dialogprint("However, " + name + " is looking kinda mincrafty ");
      Tools.delayer(500);

   }



   private int attack(int playerHP){
      playerHP -= damage - PlayerBattleController.getDeffence(); 
      return playerHP;
   }

   private int specialAttack(int playerHP){
      playerHP -= damage * damageMultiplier;
      return playerHP;
   }



   private void print(){

      if(rank == 1){
         EnemyTemplates.estran();
         return;
      }

      EnemyTemplates.notCube();
   }


}
