package pkg;
import java.util.Scanner;
import java.util.Random;


public class Kermit implements Role {
  Random rand = new Random();
	String name;
  int health;
  int attack;
  int attackdamage;

	public Kermit() {
		name = "Kermit";
    health = 100;
    attack = 5;
    attackdamage = rand.nextInt(15) +1;
	}
  public Kermit(String name)
  {
    this.name = name;
    health = 100;
    attack = 5;
  }
  public void setHealth(int health)
  {
    this.health = health;
  }
  public int getHealth()
  {
    return health;
  }
  public void setName(String name)
  {
    this.name = name;
  }
  public String getName()
  {
    return name;
  }

  public void attackWarrior(Warrior w)
  {
    System.out.println(this.name + " attacked " + w.getName());
    w.setHealth(w.getHealth() - this.attackdamage);
  }
  public void attackWizard(Wizard x)
  {
    System.out.println(this.name + " attacked " + x.getName());
    x.setHealth(x.getHealth() - this.attackdamage);
  }
  public void printArt()
  {
    System.out.println("");
  }
  
  public void attack()
  {
    
  }

}
