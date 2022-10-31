// From the name
// Date: 10/28/2022

package Game.Enemies;


import External.Tools;
import Game.Dialogue.Dialogue;
import Game.Gameplay.Controls.PlayerStates;
import Game.Gameplay.audio.MusicManager;
import Game.Gameplay.audio.SoundManager;
import Game.Main.LoseScreen;

public class Enemy implements EnemyTemplates {


   protected String name = "Not Cube";
   protected int damage = 5;
   protected int hp = 20;
   protected int deffence = 1;
   protected boolean isBoss = false;

   protected int damageMultiplier = 4;


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
         char playerChose = Tools.AskChar(
         "Q: Attack\n" +
         "E: Deffend");
         
         playerChose = Character.toLowerCase(playerChose);

         switch(playerChose){
            case 'q':
            // play damage audio
            currentEnemyHP = PlayerStates.doDamage(currentEnemyHP) + deffence;
            break;
   
            case 'e':
            PlayerStates.setDodgeAttack(true);
            break;

            case 'k': // you're not alowed to use this unless you the developer
            currentEnemyHP = PlayerStates.doDamage(currentEnemyHP - 9999999) + deffence;
            Dialogue.dialogprint("How dare you :(");
            Tools.delayer(500);

            break;
            default:
            Dialogue.dialogprint("You have chose none of the options given... for that you're turn is gone for this round :)");
            Tools.delayer(1000);
            System.out.println("LOL");
         }



         if(currentEnemyHP <= 0){

            MusicManager.stopMusic();
            SoundManager.playSE(11);
            Tools.delayer(100);
            currentPlayerHP += 10;
            PlayerStates.setCurrentHp(currentPlayerHP); // Update player's hp
            Tools.ClearConsole();
            // play audio victory
            System.out.println("YOU WON! YOU HAVE RESTORED 10 HEALH POINTS!");
            Tools.AskString("Press Enter to continue");
            MusicManager.transformFromCurrentMusicToOther(8);
            return;
         }
         

         currentPlayerHP = AttackBehaviour.enemyTurn(currentPlayerHP, name, hp, damage, damageMultiplier); // damage player

      }

      LoseScreen.playLoseScreen();

   }

   
   protected static int attack(int playerHP, int damage){
      playerHP -= damage - PlayerStates.getDeffence(); 
      return playerHP;
   }


   private void print(){

      if(isBoss){
         EnemyTemplates.estran();
         return;
      }

      EnemyTemplates.notCube();
   }


}
