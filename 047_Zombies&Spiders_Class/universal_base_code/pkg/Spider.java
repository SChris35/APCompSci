package pkg;
import java.util.Scanner;
import java.util.Random;

public class Spider implements Creature
{
  int health;
  int attack;
  String name;
  int damage;
  Random rand = new Random();
  public Spider()
  {
    name = "Charlotte";
     health = rand.nextInt(6) + 5;
    attack = rand.nextInt(6) + 5;
  }
  
public boolean isDead()
  {
    if(health == 0)
    {
      System.out.println("The Spider has died!");
      return true;
    }
    return false;
  }
  
  public boolean takeDamage(int damage)
  {
    if(health < 100)
    {
      System.out.println("The Spider has taken damage!");
      return true;
    }
    else
    {
      System.out.println("The Spider has not taken any damage!");
      return false;
    }
  }
  
  public String getName()
  {
    return name;
  }

  public void attack()
  {
    System.out.println("You striked the Spider");
    damage = health - attack;
    System.out.println("You did " + attack + " to the Spider");
    System.out.println("The Spider has " + damage + " health left");
  }
