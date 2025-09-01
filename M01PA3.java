import java.util.Scanner;

public class M01PA3 {
    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in); //input

        //multidimensional arrays
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];

        //first prompt
        System.out.println("Enter m1 (a 3 by 3 matrix) row by row: ");
        for (int i = 0; i < 3; i++) //input for row
        {
            for (int j = 0; j < 3; j++) //input for column
            {
                m1[i][j] = input.nextInt(); //put into array for m1
            }
        }

        //Second prompt
        System.out.println("Enter m2 (a 3 by 3 matrix) row by row: ");
        for (int i = 0; i < 3; i++)  //input for row
        {
            for (int j = 0; j < 3; j++) //input for column
            {
                m2[i][j] = input.nextInt(); //put into array for m2
            }
        }


        if (equals(m1, m2)) {System.out.println("The two arrays are identical.");} //output if identical   
        else {System.out.println("The two arrays are not identical.");} //output if not identical

        input.close();
    }

    public static boolean equals(int[][] m1, int[][] m2) 
    {
      for (int i = 0; i < 3; i++)//check row
      {
        for (int j = 0; j < 3; j++) //check column  
        {
            if (m1[i][j] != m2[i][j]) //if row and column for each are not the same then return false. (they are not equal)
            {
                return false;
            }
        }
    }
    return true; //if they are equal then return true
    }
}