import pkg.*;
import java.util.Scanner;
import java.util.Random;



class starter {
	public static void main(String args[]) {
		// Your code goes below here
    Dwarf elf = new Dwarf();
		Dwarf [] x = new Dwarf[100];
    Random rand = new Random();
    // Grumpy, Dopey, Doc, Happy, Bashful, Sneezy, Sleepy
    int names;

    int counter = 0;
    while(counter < x.length)
    {
      System.out.println("Dwarf " + counter + ":");
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
        x[counter].nameSet("Grmpy");
      }
      if(names == 2)
      {
        x[counter].nameSet("Dopey");
      }
      if(names == 3)
      {
        x[counter].nameSet("Doc");
      }
      if(names == 4)
      {
        x[counter].nameSet("Happy");
      }
      if(names == 5)
      {
        x[counter].nameSet("Bashful");
      }
      if(names == 6)
      {
        x[counter].nameSet("Sneezy");
      }
      if(names == 7)
      {
        x[counter].nameSet("Sleepy");
      }
      counter++;
    }
      counter = 0;
      while(true)
      {
        if(counter == x.length)
        {
          break;
        }
        x[counter].ageSet(rand.nextInt(100)+1);
        counter++;
      }
    counter = 0;
      while(true)
      {
        if(counter == x.length)
        {
          break;
        }
        System.out.print(x[counter].NameGet());
        System.out.print(x[counter].ageGet());
        System.out.println("");
        counter++;
      }
		
	}
}
