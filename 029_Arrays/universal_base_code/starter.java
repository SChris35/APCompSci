import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
  public static String Potato(String a)
  {
    int counter = 0;
    while(counter < a.length())
    {
      System.out.println(a.substring(counter, counter+1));

      counter++;
    }


    return a;
  }
 
  public static boolean Tomato(String a)
  {
    

    return a;
  }

	public static void main(String args[]) {
		// Your code goes below here
    
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    System.out.println("Hello please enter a word ");
    String word = sc.nextLine();

    Potato(word);
    System.out.println("Is this your favorite word?");    
		
	}
}
