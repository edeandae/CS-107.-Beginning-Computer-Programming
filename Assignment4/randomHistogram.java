public class randomHistogram
{
    //Eric De Anda
    //817096326
    //CS 107
    public static void main(String[]args)   
 {
    //Below are the declarations for int`s and double`s
    int countOfNumbersProduced =0;
    int OutputOne =0;
    int OutputTwo =0;
    int OutputThree =0;
    int OutputFour =0;
    int OutputFive =0;
    int OutputSix =0;
    int OutputSeven =0;
    int OutputEight =0;
    int OutputNine =0;
    int OutputTen =0;
    double hundredDivisionNumber =100;
    double sumOfTotal =0;
    double mean =0;
    while(countOfNumbersProduced <100)
    {
    int number =(int) ((Math.random()*10)+1);
    countOfNumbersProduced ++;
    //below are the switch statements
    switch(number)
     {
     case 1:  OutputOne++;break;
     case 2:  OutputTwo++;break;
     case 3:  OutputThree++;break;
     case 4:  OutputFour++;break;
     case 5:  OutputFive++;break;
     case 6:  OutputSix++;break;
     case 7:  OutputSeven++;break;
     case 8:  OutputEight++;break;
     case 9:  OutputNine++;break;
     case 10: OutputTen++;break;
    //switch statement closure
     }  
    sumOfTotal =(sumOfTotal+number); 
    }
     //sums and averages of numbers generated
    System.out.print("Here is the mean of the 100 randomly generated numbers: ");
    System.out.println (mean=sumOfTotal/hundredDivisionNumber);
    System.out.println("Here is a histogram of the 100 numbers which range from 1 to 10");
    System.out.println("--------------------------------------");
    System.out.print("1: ");
    //cascade method for distributing the proper star to each line
    for (int a=0; a<OutputOne;a++)
    {
        System.out.print("*");
    }
    System.out.println("");
    System.out.print("2: ");
    for (int a=0;a<OutputTwo;a++)
    {
    System.out.print("*");
 
    }
    System.out.println("");
    System.out.print("3: ");
    for (int a=0;a<OutputThree;a++)
    {
    System.out.print("*");
 
    }
    System.out.println("");
    System.out.print("4: ");
    for (int a=0;a<OutputFour;a++)
    {
    System.out.print("*");
 
    }
    System.out.println("");
    System.out.print("5: ");
    for (int a=0;a<OutputFive;a++)
    {
    System.out.print("*");
 
    }
    System.out.println("");
    System.out.print("6: ");
    for (int a=0;a<OutputSix;a++)
    {
    System.out.print("*");
 
    }
    System.out.println("");
    System.out.print("7: ");
    for (int a=0;a<OutputSeven;a++)
    {
    System.out.print("*");
 
    }
    System.out.println("");
    System.out.print("8: ");
    for (int a=0;a<OutputEight;a++)
    {
    System.out.print("*");
 
    }
    System.out.println("");
    System.out.print("9: ");
    for (int a=0;a<OutputNine;a++)
    {
    System.out.print("*");
 
    }
    System.out.println("");
    System.out.print("10:");
    for (int a=0;a<OutputTen;a++)
    {
    System.out.print("*");
 
    }
 }
 
 
}