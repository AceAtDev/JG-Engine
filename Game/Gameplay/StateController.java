package Game.Gameplay;

import org.w3c.dom.events.Event;

public class StateController {


   public static StateController instance;

   //public State States;

   public static Event onGameStateChange;

   enum GameState {
      PLAYERTURN,
      ENEMYTURN,
      VECTORY,
      LOSE,
      WANDERING
   }
}

