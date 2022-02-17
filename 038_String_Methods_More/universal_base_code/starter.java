import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
    Scanner sc = new Scanner(System.in);

		System.out.println("What is your first and last name? ");
    String word = sc.nextLine();
    int wordlocation;
    
   wordlocation = word.indexOf(" ");
   //System.out.println(wordlocation);

   System.out.println("Your Last name is: " + word.substring(wordlocation + 1));
   
   


    
	}
}
