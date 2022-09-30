package src.PERSONAL_PROGRAMS;

import java.util.Scanner;

public class CALCULATOR_CONCISE
{
    public static void main(String [] args)
    {
    Scanner input = new Scanner(System.in);
    
    System.out.print("how many numbers you want to add = ");
    int num = input.nextInt();
    
    int result = 0;

    int c = 1;//just for showing
    
    for(int b = 1; b <= num; b++)
    {
        System.out.println("Please enter your number "+(c++)+"");
        int a = input.nextInt();
        
        result = result + a;
    }  
    System.out.println("The answer is = "+result);
    }
}