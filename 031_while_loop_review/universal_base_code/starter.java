import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);

    
    System.out.println("Hello lets make a list of random numbers, all I need from you is a number between 1-100: ");
    int num = sc.nextInt();



    for(int counter = 1; counter < num; counter++)
    {
      int randnum = rand.nextInt(100);
      System.out.println(randnum);
      
    }

		
	}
}
