import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
    Scanner sc = new Scanner(System.in);
    int counter = 0;
    int stoppoint =1;
		System.out.println("Please enter a word: ");
    String word = sc.nextLine();
    System.out.println("Letter by letter: ");
		
    int wordlength = word.length();
    while(counter < wordlength)
    {
      System.out.print(counter + " ");
      System.out.println(word.substring(counter, stoppoint));
      counter++;
      stoppoint++;
    }


      
    
	}
}
