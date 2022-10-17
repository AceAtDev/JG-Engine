package Game.Enemies;

import java.util.Random;


import External.Tools;
import Game.Dialogue.Dialogue;
import Game.Gameplay.Controls.PlayerBattleController;
import Game.Main.LoseScreen;
import Game.Rooms.Room;

public class Enemy implements EnemyTemplates {

   protected String name = "Not Cube";
   protected int damage = 5;
   protected int hp = 20;
   protected int deffence = 1;


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

      Tools.delayer(750);
      Dialogue.dialogprint("An enemy had blooked you way");
      Tools.delayer(1000);


      // play audio
      PlayerBattleController pbc = new PlayerBattleController();
      int currentPlayerHP = playerHP;
      int currentEnemyHP = hp;
      while(currentPlayerHP > 0){
         
         
         print();
         System.out.println(name + " is blooking your way!");
         System.out.println(name + " HP's: " + currentEnemyHP);
         System.out.println("Your HP: " + currentPlayerHP);
         int playerChose = Tools.AskInt("1: Attack\n" +
         "2: Deffend");
         
         switch(playerChose){
            case 1:
            // play damage audio
            currentEnemyHP = pbc.doDamage(currentEnemyHP);
            break;
   
            case 2:
            break;
            default:
            Dialogue.dialogprint("You have chose none of the options given... for that you're turn is gone for this round :)");
            Tools.delayer(1000);
            System.out.println("LOL");
         }


         if(currentEnemyHP <= 0){
            Tools.ClearConsole();
            // player audio victory
            currentPlayerHP += 10;
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
      int specialAttack = rand.nextInt(3);
      boolean canSA = specialAttack == 1;
      boolean warnPlayer = false;

      Tools.delayer(1250);

      if(canSA){
         System.out.println("sp!");
         canSA = false;
      }

      System.out.println(name + " decided to attack!");
      Tools.delayer(750);
      // play damage audio
      return attack(playerHP);
      

   }



   private int attack(int playerHP){
      playerHP -= damage; 
      return playerHP;
   }


   private void print(){

      EnemyTemplates.notCube();
   }


}
