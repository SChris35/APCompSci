import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
  
  public static void toStringArray(int [] x){
    int counter = 0;
    
    while(counter < x.length)
    {
      System.out.println(x[counter]);

      counter++;
    }


    return;
  }
  public static double getArrayAverage(int [] d){
  int counter = 0;
  double sum = 0;
  while(counter < d.length){
   sum = sum + d[counter];

    counter++;
  }
 
  

  return sum / d.length;

  }
  public static int getArrayMax(int [] g){
    int counter = 0;
    int max = 0;
    while(counter < g.length){

      if(g[counter] > max)
      {
        max = g[counter];
        
      }
      counter++;
    }
    
    return max;
  }
  public static int getArrayMin(int [] x){
    int counter = 0;
    int min = 1000;
    while(counter < x.length)
    {
      if(x[counter] < min)
      {
        min = x[counter];
      }
    }


    return min;
  }


	public static void main(String args[]) {
		// Your code goes below here
    Random rand = new Random();
		int counter = 0;
    int [] array = new int [10];
    while(counter < array.length)
    {
      array[counter] = rand.nextInt(10);

      counter++;
    }


      toStringArray(array);
     double average = getArrayAverage(array);
     System.out.println("Your average of the numbers is: " + average);
     int maxnum = getArrayMax(array);
     System.out.println("The Maximum value is: " + maxnum);
     int minnum = getArrayMin(array);
     System.out.println("The Minimum value is: " + minnum);



    int [] array2 = new int [100];
    int counter2 = 0;
    while(counter2 < array2.length)
    {
      array2[counter] = rand.nextInt(100) +1;
      counter2++;
    }

    toStringArray(array2);
    double average2 = getArrayAverage(array2);
    System.out.println("Your average of the second array is: " + average2);
    int maxnum2 = getArrayMax(array2);
    System.out.println("The max number in the second array is: " + maxnum2);
    int minnum2 = getArrayMin(array2);
    System.out.println("The minimum of the second array is: " + minnum2);




	}
}
