package Game.Enemies;

public class Boss extends Enemy {

   public Boss(String name, int hp, int deffence, int damage, boolean isBoss){
      super(name, hp, deffence, damage);
      this.isBoss = isBoss;
   }

}
