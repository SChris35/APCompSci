package pkg;

public class Musician extends Performer{
  public String instrument;
  public String name;
  public Musician()
  {
    name = "Yo Yo-Ma";
    instrument = "Cello";
  }

  public Musician(String name, String instrument)
  {
    this.instrument = instrument;
    this.name = name;
  }

  public String getInstrument()
  {
    return instrument;
  }

  public void playInstrument()
  {
    System.out.println(name + "is playing " + " ♩♩♩♩♩♩♩♩ ♫♫♫♫♫♫ ♬♬♬♬♬");
  }

  public void practice()
  {
    System.out.println(name + " is practicing");
  }


}
