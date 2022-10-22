package Game.Enemies;

public class Boss extends Enemy {
   
   private int rank = 0;

   public Boss(String name, int hp, int deffence, int damage, int rank){
      super(name, hp, deffence, damage);
      this.rank = rank;
   }



}
