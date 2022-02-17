package pkg;
import java.util.Scanner;
import java.util.Random;


public class Apprentice extends Musician{
String school;
int yearsOfExperience;

public Apprentice(){
school = "CVHS";
yearsOfExperience = 0;
}

public Apprentice(String school, int yearsOfExperience)
{
  this.school = school;
  this.yearsOfExperience = yearsOfExperience;
}

public Apprentice(String instrument, String school, int yearsOfExperience)
{
  this.instrument = instrument;
  this.school = school;
  this.yearsOfExperience = yearsOfExperience;
}



}
