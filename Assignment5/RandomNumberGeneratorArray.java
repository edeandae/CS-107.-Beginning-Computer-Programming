
public class RandomNumberGeneratorArray
{
//Eric De Anda
//817096326
//CS 107
public static void main(String[]args)   
     {
   //Declaration of variables, loops and my amount of numbers;
   final int NumbersGenerated = 100;
   int Histogram[ ]= new int[10];
   int Random[ ]= new int[NumbersGenerated];
   double sum = 0.0;

   System.out.println("Histogram of the 100 random numbers:");  
     for(int i=0; i<NumbersGenerated; i++)
         {
       //Generating Random Numbers
       int R = (int) ((Math.random()*10)+1);
       Random[i] = R;
       sum +=Random[i];
       //Aligning the lenght of the Array
       Histogram[R-1]++;
         }
     for(int i=0; i<10; i++)
     // Setting the lenght with the array
         {                
       
         int number= i +1;
         // Aligning the array properly
         System.out.print(number + ":\t ");
 
         for (int a=0;a<Histogram[i];a++)
         //incrementing apropiate number of the array with stars
              {
 
           System.out.print("*");           
 
              }
           System.out.println("");
 
         }
         //Calculating the mean
       double mean = sum/NumbersGenerated; 
       //informing the user;
       System.out.print("The mean of the 100 random numbers is: ");
       System.out.println(mean);
 
     }
    }