package pkg;

public class Musician extends Performer{
  public String instrument;
  
  public Musician()
  {
    
    instrument = "Cello";
  }

  public Musician(String n, String i)
  {
      super(n);
      instrument = i;
      
  }

  public Musician(String n, int a, String i)
  {
    super(n,a);
    intstrument = i;
  }

  public String getInstrument()
  {
    return instrument;
  }

  public void playInstrument()
  {
    System.out.println(super.getName() + "is playing " + " ♩♩♩♩♩♩♩♩ ♫♫♫♫♫♫ ♬♬♬♬♬");
  }

  public void practice()
  {
    System.out.println(super.getName() + " is practicing");
  }


}
