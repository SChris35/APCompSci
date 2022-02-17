import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
    Random rand = new Random();

		int [] array = new int [10];

    int counter = 0;

    while(counter < array.length)
    {
      array[counter] = rand.nextInt(1000);
      counter++;
    }
    counter = 0;
    while(counter < array.length)
    {
      System.out.println(array[counter]);
      counter++;
    }

}
}
