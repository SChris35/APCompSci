import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    System.out.println("Hello, I want to make an array. Please give me a number between 51 and 200! ");
    int input = sc.nextInt();

		int [] a = new int [input];
    
    int counter = 0;
    int min = 1000;
    while(counter < a.length)
    {
      a[counter] = rand.nextInt(100) + 1;
      System.out.println(a[counter]);
      counter++;
    }
    counter = 0;
    System.out.println();
    while(counter < a.length)
    {
      if(a[counter] < min)
      {
        min = a[counter];  
      }
      counter++;
    }
    System.out.println("The smallest value in the array is: " + min);
    System.out.println();

    counter = 0;
    int max = 0;
   while(counter < a.length)
   {
     if(a[counter] > max)
     {
       max = a[counter];
     }
     
     counter++;
   }
    System.out.println("The greatest value in the array is: " + max);
    System.out.println();
    counter = 0;
    int average = 0;
    while(counter < a.length)
    {
      average = average + a[counter];
      counter++;
    }
    int answer = average / a.length;
    System.out.println("The average of the numbers is: " + answer);

		
	}
}

