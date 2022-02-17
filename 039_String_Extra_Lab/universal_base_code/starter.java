import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
    Scanner sc = new Scanner(System.in);
    


		System.out.println("Please enter a phrase: ");
    String userinput = sc.nextLine();
    
    int space1;
    String mystring = userinput;
    boolean running = true;
    String outputString = "";

    space1 = mystring.indexOf(" ");
    if(space1 == -1)
      {
        System.out.println("That is not a phrase, please include spaces this time! ");
       running = false;
      }

    while(running)
    {

      space1 = mystring.indexOf(" ");
      if(space1 == -1)
      {
        outputString = mystring + " " + outputString;

        break;
      }
      outputString = mystring.substring(0, space1) + " " + outputString;
       
      mystring = mystring.substring(space1 + 1);
      
      

      
    }
    System.out.println(outputString);


    String ex = ("father");
    int counter = ex.length();
    String finish = "";
    while(counter >= 0)
    {
     finish = ex.substring(counter -1, counter) + finish;
     
      counter--;
    }
    System.out.println(finish);







    // int spacelocation1;
    // spacelocation1 = input.indexOf(" ");
    
    // String Firstword;
    // Firstword = input.substring(0, spacelocation1);

    // int spacelocation2;
    // String Secondword;
    

    // Secondword = input.substring(spacelocation1 + 1);  
    // spacelocation2 = Secondword.indexOf(" ");

    // String Word2;
    // Word2 = Secondword.substring(0, spacelocation2);
    
    


    // String Thirdword;
    // Thirdword = Secondword.substring(spacelocation2 + 1);

    

    // System.out.println(Firstword);
    // System.out.println(Word2);
    // System.out.println(Thirdword);
    // System.out.println(Thirdword + " " + Word2 + " " + Firstword);


	}
}
