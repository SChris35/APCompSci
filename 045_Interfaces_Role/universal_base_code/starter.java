import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
    Role [] role = new Role [3];
    role[0] = new Wizard();
    role[1] = new Warrior();
    role[2] = new Kermit();
    
    System.out.println(role[0].getName());
    System.out.println(role[1].getName());
    System.out.println(role[2].getName());

    



		
	}
}
