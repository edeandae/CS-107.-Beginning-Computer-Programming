import java.util.Scanner;
public class PrimitiveTypes
{
    //Name: Eric De Anda
    //RedID: 817096326
    //Class title: CS107
    public static void main(String[] args)
    {
        //declaring variables
        Scanner in = new Scanner(System.in);
        final int Divisor = 2;
        double firstInput,secondInput,thirdInput; //input strings
        int firstInt,secondInt,thirdInt;  //casted inputs
        double DoubleInputSum; 
        int IntSum,IntInputSum;
    
        //prompting the user
        System.out.println("Please enter three decimal numbers");
        System.out.print("1:"); 
        firstInput = in.nextDouble();
        
        System.out.print("2:");
        secondInput = in.nextDouble();
        
        System.out.print("3:");
        thirdInput = in.nextDouble();
        
        //casting of inputs
        firstInt = (int) firstInput;
        secondInt = (int) secondInput;
        thirdInt = (int) thirdInput;
        
        //performig calculations
        DoubleInputSum = (firstInput + secondInput + thirdInput)/ Divisor;
        
        IntSum = (firstInt + secondInt + thirdInt)/ Divisor;
        
        IntInputSum = (int) (firstInput + secondInput + thirdInput)/ Divisor;
        
        //printing the results
        System.out.println("Here are the decimal numbers you entered and the resulting calculations");
        
        System.out.print("The three floating point numbers you provided: ");
        System.out.println(firstInput+", "+secondInput+", "+thirdInput);
        
        System.out.print("Your numbers converted to integers are: ");
        System.out.println(firstInt+", "+secondInt+", "+thirdInt);
        
        System.out.print("The floating point calculation result is: ");
        System.out.println(DoubleInputSum);
        
        System.out.print("The converted floating point, to integer, calculation result is: ");
        System.out.println(IntSum);
        
        System.out.print("The integer calculation result is: ");
        System.out.println(IntInputSum);
    }

    
}
