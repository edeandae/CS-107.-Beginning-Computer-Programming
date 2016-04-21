import java.util.Scanner;
import java.io.*;
public class UnitConversion
{
    //Eric De Anda
    //817096326
    //CS 107
    public static void main(String[] args)
    {
       //declaring constants
        final int divisor5 = 5;
        final int divisor9 = 9;
        final int number32 = 32;
        final double Pound_to_Kilogram_Constant_Value = 0.453592;
        final double Kilogram_to_Pound_Constant_Value = 2.20462;
        final double Kilometer_to_Mile_Constant_Value = 0.621371;
        final double Mile_to_Kilometer_Constant_Value = 1.60934 ;
       
        //prompting the user
        System.out.println("Welcome to this program which will allow you to convert from english ");
        System.out.println("to metric units and viceversafrom english to metric units and viceversa");
        System.out.println("If you want to convert from english to metric system enter 1 ");
        System.out.println("alternatively if you wish to convert from metric to english enter 2");
        System.out.print("Yor choice ");
        
        
       Scanner FirstOptionInput= new Scanner(System.in); //establishing input
       char FirstOption = FirstOptionInput.next().charAt(0);
       

      switch(FirstOption)//using switch for selecting type of conversion
      {
         case '1' :
         {
            System.out.println("Please enter 1 if you want to convert fromto convert from degrees  Fahrenheit to centigrade."); 
            System.out.println("Please enter 2 to convert from pounds to kilograms."); //informing user of its options
            System.out.println("Please enter 3 to convert from miles to kilometers."); 
            System.out.print("Yor choice ");
            
            Scanner SecondOptionInput1= new Scanner(System.in);
            char SecondOption1 = SecondOptionInput1.next().charAt(0);
            switch(SecondOption1) //using swithch for selecting unit type of conversion from English to Metric
            {
                case '1' :
                System.out.println("Please enter the amount in Fahrenheit."); 
                //declaring variables 
                 double Farenheit = SecondOptionInput1.nextDouble(); 
                 double Centigradevalue = ((Farenheit - number32) * divisor5/divisor9);
                System.out.print(" Fahrenheit are "); 
                System.out.print(Centigradevalue); //printing result
                System.out.println(" centigrades."); 
                break;
                
                case '2' :
                System.out.println("Please enter the amount in pounds."); 
                //declaring variables
                 double Pounds = SecondOptionInput1.nextDouble(); 
                 double Kilogramvalue = (Pound_to_Kilogram_Constant_Value * Pounds);
                 if (Pounds <= 0)
                 {
                     System.out.println("You cannot enter negative values for weights try again"); 
                 break;
                 }
                 System.out.print(" pounds are ");
                 System.out.print(Kilogramvalue); //printing result
                 System.out.println(" kilograms.");
                break;
                
                case '3' :
                System.out.println("Please enter the amount in miles."); 
                //declaring variables
                 double Miles = SecondOptionInput1.nextDouble();
                 double Kilometervalue = (Miles * Mile_to_Kilometer_Constant_Value);
                 if (Miles <= 0)
                 {
                     System.out.println("You cannot enter negative values for distances try again"); 
                 break;
                 }
                 System.out.print(" miles are "); 
                 System.out.print(Kilometervalue); //printing result
                 System.out.println(" kilometers."); 
                break;
            
            }
         break;
        }
            case '2' :
         {   
            System.out.println("Please enter 1 if you want to convert fromto convert from degrees centigrade to Fahrenheit."); 
            System.out.println("Please enter 2 to convert from kilograms to pounds."); 
            System.out.println("Please enter 3 to convert from kilometers to miles."); 
            System.out.print("Yor choice ");
            
            Scanner SecondOptionInput2= new Scanner(System.in);
            char SecondOption2 = SecondOptionInput2.next().charAt(0);
            switch(SecondOption2)//using swithch for selecting unit type of conversion from Metric to English
            {
                case '1' :
                {
                 System.out.println("Please enter the amount in centigrade."); 
                 //declaring variables 
                  double Centigrade = SecondOptionInput2.nextDouble();
                  double Farenheitvalue = (Centigrade * divisor9/divisor5 + number32); 
                  System.out.print(" centigers are ");
                  System.out.print(Farenheitvalue); //printing result
                  System.out.println(" Farenheit.");
                  break;
                }
                case '2' : 
                {
                System.out.println("Please enter the amount in kilograms."); 
                //declaring variables 
                 double Kilograms = SecondOptionInput2.nextDouble(); 
                 double Poundvalue = (Kilograms * Kilogram_to_Pound_Constant_Value);
                 if (Kilograms <= 0)
                 {
                     System.out.println("You cannot enter negative values for weights try again"); 
                 break;
                 }
                 System.out.print(" kilograms are ");
                 System.out.print(Poundvalue); //printing result
                 System.out.println(" pounds.");
                 break;
                }
                case '3' :
                {
                System.out.println("Please enter the amount in kilometers."); 
                //declaring variables 
                 double Kilometers = SecondOptionInput2.nextDouble();
                 double Milevalue = (Kilometers *  Kilometer_to_Mile_Constant_Value);
                 if (Kilometers <= 0)
                 {
                     System.out.println("You cannot enter negative values for distances try again"); 
                 break;
                 }
                 System.out.print(" kilometers are ");
                 System.out.print(Milevalue); //printing result
                 System.out.println(" miles.");
                 break;
                }
            }
            break;
        }
      }
    
    }
}
