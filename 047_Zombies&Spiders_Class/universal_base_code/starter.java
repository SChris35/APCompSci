iimport pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Creature [] role = new Creature[3];
    role[0] = new Zombie();
    role[1] = new Spider();
    role[2] = new Man();
    int counter = 0;
    
    while(true)
    {
      if(role[1].isDead())
      {
        break;
      }
      if(role[2].isDead())
      {
        break;
      }
      role[2].attack(role[0]);
      role[2].attack(role[1]);

    }


		
	}
}
