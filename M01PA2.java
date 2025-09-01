import java.util.Scanner;

public class M01PA2 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in); //input scanner

    
        System.out.print("Enter a credit card number as a long integer: "); //input 
        long number = input.nextLong();


        if (isValid(number)) //output
        {System.out.println(number + " is valid.");} 
        else 
        {System.out.println(number + " is invalid.");}

        input.close(); //close scanner
    }

    //check valid input
    public static boolean isValid(long number) 
    {
        boolean validLength = getSize(number) >= 13 && getSize(number) <= 16; //check if it has length

        boolean validPrefix = //check if it has valid prefix number
        prefixMatched(number, 4) || //visa check
        prefixMatched(number, 5) || //mastercard check
        prefixMatched(number, 37) || //amex check
        prefixMatched(number, 6); //discover check

        int total = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number); //add together

        //if the conditions are met then returns true.
        if (validLength && validPrefix && (total % 10 == 0)) {return true;} 
        else {return false;} //if they are invalid, returns false.
    }

    //add evens place together
    public static int sumOfDoubleEvenPlace(long number) 
    {
        String num = Long.toString(number);
        int sum = 0;

        for (int i = num.length() - 2; i >= 0; i -= 2) //loop to grab every value in evens place
        {
            int digit = Character.getNumericValue(num.charAt(i)); //get the value at the current space
            sum += getDigit(digit * 2); //add the product of the digit to the sum
        }
        return sum; //return total
    }

    //get digit if it is greater or less than 10
    public static int getDigit(int number) 
    {
        if (number < 10) return number;
        return number / 10 + number % 10;
    }

    //sum of odd place
    public static int sumOfOddPlace(long number) 
    {
        String num = Long.toString(number);
        int sum = 0;

        for (int i = num.length() - 1; i >= 0; i -= 2) //get character at odds place
        {
            sum += Character.getNumericValue(num.charAt(i)); //grab character at current instancec and add it to sum
        }
        return sum; //return the total
    }

    //checks to see if prefixes match 
    public static boolean prefixMatched(long number, int d) 
    {
        return getPrefix(number, getSize(d)) == d;
    }

    //return total digits
    public static int getSize(long d) 
    {
        return Long.toString(d).length();
    }

    //return prefix
    public static long getPrefix(long number, int m) 
    {
        int size = getSize(number); //get the size of the number inputted
        if (size < m) return number;

        //divide until first number(s) remains
        for (int i = 0; i < size - m; i++) 
        {
            number /= 10;
        }
        return number;
    }
}
