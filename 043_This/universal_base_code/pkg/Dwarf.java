package pkg;
import java.util.Scanner;
import java.util.Random;

public class Dwarf {
	String name;
  int age;
  boolean check = false;

	public Dwarf() {
		name = "";
    age = 0;
  }
  public Dwarf(String name, int age)
  {
    this.name = name;
    this.age = age;
  }
  public boolean isSameName(String name)
  {
    if(this.name.equals(name))
    {
      System.out.println("Their name is the same!");
      return true;
    }
    else
    {
      System.out.println("These names don't match!");
    }
    return check;
  }

  public void nameSet(String name)
  {
    this.name = name;
  }
  public String NameGet()
  {

    return name;
  }
  public void ageSet(int age)
  {
    this.age = age;
  }
  public int ageGet()
  {
    return age;
  }
  
  
	}
