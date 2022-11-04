package Game.Rooms;

import External.Tools;
import Game.Dialogue.Dialogue;
import Game.Enemies.Enemy;
import Game.Gameplay.Controls.PlayerController;

public class Room implements RoomTemplates {
   

   protected boolean right = true;
   protected boolean left = true;
   protected boolean up = true;
   protected boolean down = true;
   protected boolean hasStairs = false;

   protected String note = "";

   protected Enemy doesContainEnemy;

   

   public Room(){

   }

   public Room(boolean right, boolean left, boolean up, boolean down){
      this.up = up;
      this.right = right;
      this.down = down;
      this.left = left;

   }

   public Room(boolean right, boolean left, boolean up, boolean down, 
   Enemy enemy){ // A room with an enemy inside
      this.up = up;
      this.right = right;
      this.down = down;
      this.left = left;
      this.doesContainEnemy = enemy;
   }
   
   public Room(boolean right, boolean left, boolean up, boolean down, 
   String note){ // A room with an enemy inside
      this.up = up;
      this.right = right;
      this.down = down;
      this.left = left;
      this.note = note;
   }

   public void callEnemy(){
      doesContainEnemy.enemyChallenged(PlayerController.getCurrentHP());
   }

   
   public void printNote(String note){
      Dialogue.dialogprint(note);
      Tools.delayer(2500);
   }
   
   
   public String getNote(){
      return note;
   }

   public boolean getRoomExitLeft(){
      return left;
   }
   public boolean getRoomExitRight(){
      return right;
   }
   public boolean getRoomExitUp(){
      return up;
   }
   public boolean getRoomExitDown(){
      return down;
   }




   public void print(){

      if(right && !left && !up && !down){ // right
         RoomTemplates.oneGateRight();
         return;
      }
      if(!right && left && !up && !down){ // left
         RoomTemplates.oneGateLeft();
         return;
      }
      if(!right && !left && up && !down){ // up
         RoomTemplates.oneGateUp();
         return;
      }
      if(!right && !left  && !up && down){ // down
         RoomTemplates.oneGateDown();
         return;
      }



      if(right && left && !up && !down ){ // right - left 
         RoomTemplates.twoGatesRightLeft();
         return;
      }
      if(right && !left && up  && !down ){ // right - up
         RoomTemplates.twoGatesUpRight();
         return;
      }
      if(right && !left  && !up  && down ){ // right - down
         RoomTemplates.twoGatesRightDown();
         return;
      }

      if(!right  && left  && up && !down ){ // left - up
         RoomTemplates.twoGatesUpLeft();
         return;
      }
      if(!right && left  && !up  && down ){ // left - down
         RoomTemplates.twoGatesLeftDown();
         return;
      }
      if(!right && !left && up && down ){ // up - down
         RoomTemplates.twoGatesUpDown();
         return;
      }


      if(right  && left  && up && !down ){ // right - left - up
         RoomTemplates.threeGatesLeftRightUp();
         return;
      }
      if(right && left && !up && down ){ // right - left - down
         RoomTemplates.threeGatesDownRightLeft();
         return;
      }
      if(right && !left && up && down ){ // right - up - down
         RoomTemplates.threeGatesRightDownUp();
         return;
      }
      if(!right && left  && up && down ){ // left - up - down
         RoomTemplates.threeGatesLeftUpDown();
         return;
      }


      if(right && left && up && down ){ // open form every direction
         RoomTemplates.mainRoom();
         return;
      }



      throw new IllegalStateException("Could not find match to draw Room with\n" +
         "Right: " + right + "\n" +
         "Left: " + left + "\n" +
         "Up: " + up + "\n" +
         "Down: " + down + "\n" +
         "Are you missing a possible room with those values?");

   }
 


}

