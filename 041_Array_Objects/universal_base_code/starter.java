import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
    //variables
    int counter1 = 0;  //counter for wizard loop
    int counter2 = 0; //counter for warrior loop
    boolean running = true;

    //constructors
    Wizard [] hero = new Wizard [100];
    Warrior [] villan = new Warrior[100];


    while(counter1 < hero.length)
    {
      hero[counter1] = new Wizard("Hagrid");

      counter1++;
    }

    while(counter2 < hero.length)
    {
      villan[counter2] = new Warrior("Barbarian");

      counter2++;
    }
		System.out.println("WOOOSH! " + "100 Wizards have appeared ");
    System.out.println("SHING! " + "100 Barbarians have arrived ");

    

    counter1 = 0;
    counter2 = 0;
    while(running)
    {
      System.out.println("..........................................");
      hero[counter1].attack(villan[counter2]);
      //System.out.println("Hagrid Strikes Joker with his wand");
      villan[counter2].attack(hero[counter1]);
      //System.out.println("Joker throws a crowbar at Hagrid.");
      if(hero[counter1].isDead())
      {
        counter1= counter1 +1;
      } 
      if(villan[counter2].isDead())
      {
        counter2 = counter2 + 1;
      }
      if(hero[99].isDead())
      {
        System.out.println("The Warriors have won!");
        break;
      }
      if(villan[99].isDead())
      {
        System.out.println("The Wizards have won the Battle!");
        break;
      }

      
    }



	}
}
