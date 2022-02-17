package pkg;
import java.util.Scanner;
import java.util.Random;

public class Man implements Creature{
String name;
int health;
int attack;
int damage;
Random rand = new Random();
public Man()
{
  name = "Joe";
  health = rand.nextInt(6) + 5;
  attack = rand.nextInt(6) + 5;
}

  public boolean isDead()
  {
    if(health == 0)
    {
      System.out.println("You have Died!");
      return true;
    }
    return false;
  }
  

  public void attack()
  {
    System.out.println("You striked the enemy");
    damage = health - attack;
    System.out.println("You did " + attack + " to the enemy");
  }
}
