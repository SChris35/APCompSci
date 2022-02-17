import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
    

    String [] bob = new String [7];
    bob[0] = "She told me don't worry about it..";
    bob[2] = "She told me don't worry, no more";
    bob[3] = "we both know we can't go without it...";
    bob[4] = "she told me you'll never be in love ov ov... ahhh";
    bob[5] = "I can't feel my face when I'm with you";
		bob[6] = "But I love it";
    int counter = 0;
    while(counter < bob.length)
    {
      System.out.println(bob[counter]);
      counter++;
    }
	}
}
