import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Musician m1 = new Musician("Kenny");
    m1.getName();
    m1.practice();
    m1.getInstrument();

    Musician m2 = new Musician("Joe", 30, "saxophone");
    m2.getName();
    m2.practice();
    m2.getInstrument();
		
	}
}
