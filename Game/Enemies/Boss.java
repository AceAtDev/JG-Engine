package Game.Enemies;

public class Boss extends Enemy {
   
   private int rank;

   public Boss(String name, int hp, int deffence, int damage, int rank){
      super(name, hp, deffence, damage);
      this.rank = rank;
   }



}
