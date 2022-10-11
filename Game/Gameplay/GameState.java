package Game.Gameplay;

import org.w3c.dom.events.Event;

public class GameState {
   public static GameState instance;

   public State States;

   public static Event onGameStateChange;

   public void UpdateGameState(State newState){
      States = newState;

      switch(newState){
         case playerTurn:

         break;
         case enemyTurn:

         break;
         case vectory:

         break;
         case lose:

         break;
         case wanderingTurn:

         break;

         default:
         throw new IllegalStateException("Unknown state has been selected");
      }

   }

}

