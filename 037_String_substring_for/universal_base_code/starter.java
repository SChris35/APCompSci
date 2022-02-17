import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
    Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a word: ");
    String word = sc.nextLine();
    System.out.println("Letter by Letter: ");
    
    int wordlength = word.length();
   
    for(int cnt = 0; cnt < wordlength; cnt++)
    {
      System.out.print(cnt + " ");
      System.out.println(word.substring(cnt, cnt+1));
    }


		
	}
}
