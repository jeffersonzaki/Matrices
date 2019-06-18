package ProjectsOnly;

import javax.swing.*;

public class Project3 {
    //declare output
    public static String output = "";

    //define sum
    static int sum = 0;


    //Multiply the two matrix
    public static void multiplyTheMatrix(int[][] A, int[][] B, int[][] C)
    {
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                C[i][j] = 0;
                for (int k = 0; k < 2; k++)
                {
                    sum = sum  + ((A[i][k]) * (B[k][j]));
                }
                C[i][j] = sum;
                sum = 0;
                output += + C[i][j] + " ";
            }
        }
    }

    //Add the matrices
    public static void addingTheMatrix(int[][] A, int[][] B, int[][] C)
    {
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                C[i][j] = 0;
                for (int k = 0; k < 2; k++)
                {
                    sum = sum  + ((A[i][k]) + (B[k][j]));
                }
                C[i][j] = sum;
                sum = 0;
                output += + C[i][j] + " ";
            }
        }
    }




    // * Main Method * //
    public static void main(String[] args) {
        // 2D array for multiplication
        final int a[][] = { {2, 5, 6}, {4, 9, 2} };
        final int b[][] = { {2, 5, 6}, {4, 9, 2} };
        final int c[][] = new int[2][2];


        output += "\nThe multiplication of the two matrices are: \n";
        multiplyTheMatrix(a,b, c);
        output += "\nThe addition of the two matrices show a result of: ";
        addingTheMatrix(a, b, c);

        JOptionPane.showMessageDialog(null, output);
    }
}