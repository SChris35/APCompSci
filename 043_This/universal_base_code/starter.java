import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Dwarf [] x = new Dwarf[10];
    Random rand = new Random();
    int counter = 0;
    int names;
    while(counter < x.length)
    {
      x[counter] = new Dwarf();
      counter++;
    }
    counter = 0;
    names = rand.nextInt(7) + 1;
    while(true)
    {
      if(counter == x.length)
      {
        break;
      }
      if(names == 1)
      {
      x[counter].nameSet("Grumpy");
      x[counter].ageSet(rand.nextInt(100)+1);
      }
      if(names == 2)
      {
        x[counter].nameSet("Dopey");
        x[counter].ageSet(rand.nextInt(100)+1);
      }
      if(names == 3)
      {
        x[counter].nameSet("Doc");
        x[counter].ageSet(rand.nextInt(100)+1);
      }
      if(names == 4)
      {
        x[counter].nameSet("Happy");
        x[counter].ageSet(rand.nextInt(100)+1);
      }
      if(names == 5)
      {
        x[counter].nameSet("Bashful");
        x[counter].ageSet(rand.nextInt(100)+1);
      }
      if(names == 6)
      {
        x[counter].nameSet("Sneezy");
        x[counter].ageSet(rand.nextInt(100)+1);
      }
      if(names == 7)
      {
        x[counter].nameSet("Sleepy");
        x[counter].ageSet(rand.nextInt(100)+1);
      }
      counter++;
    }
    counter = 0;
    while(counter < x.length)
    {
      System.out.print(x[counter].NameGet());
      System.out.print(x[counter].ageGet());
      System.out.println(" ");
    }
    
	}
}
