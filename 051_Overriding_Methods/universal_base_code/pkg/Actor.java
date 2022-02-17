package pkg;
import java.util.Scanner;
import java.util.Random;


public class Actor extends Performer {
	String type;

	public Actor() {
		type = "theater";
		
	}

  public Actor(String name)
  {
    this.name = name;
  }
  

  public void practice()
  {
    System.out.println(name + " is practicing their lines.");
  }

  public void perform()
  {
    System.out.println(name + " just flipped to avoid a fast car!");
  }

  public void monologue()
  {
    System.out.println("The only rules that really matter are these: what a man can do and what a man can’t do. For instance, you can accept the fact that your father was a pirate and a good man or you can’t. But pirate is in your blood, boy, so you’ll have to square with that someday. And me, for example, I can let you drown, but I can’t bring this ship into Tortuga all by me onesies, savvy? So, can you sail under the command of a pirate, or can you not?");
  }

}

