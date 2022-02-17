package pkg;
import java.util.Scanner;
import java.util.Random;

public class Dwarf {
	String name;
  int age;

	public Dwarf() {
		name = "";
    age = 0;
  }
  public void nameSet(String a)
  {
    name = a;
  }
  public String NameGet()
  {

    return name;
  }
  public void ageSet(int a)
  {
    age = a;
  }
  public int ageGet()
  {
    return age;
  }

  
	}


