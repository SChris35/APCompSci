import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
    Performer perform1 = new Performer();
    Performer perform2 = new Performer("George Michael");


    perform1.getName();
    perform2.getName();

    Musician music1 = new Musician();
    Musician music2 = new Musician("Kenny G", "Saxophone");

    music1.getName();
    music2.getName();

    music1.perform();
    music2.perform();
		
    music1.playInstrument();
    music2.playInstrument();
    music2.practice();
    
	}
}
