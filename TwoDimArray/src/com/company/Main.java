package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        //Declare two dimensional array
        int[][] my2DimArray = { {1,2,3,4},//1st row
                                {5,6,7,8},//2nd row
                                {9,10,11,12} //3rd row
                                        };
        for (int i = 0; i < 3; i++) { // my2DimArray.length
            for (int j = 0; j < 4; j++) { // 
                System.out.print(my2DimArray[i][j] + "\t");

            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(my2DimArray));

//        //Declare another 2 dim array
//        double[][] myNewArray = new double[2][2];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (my2DimArray[i][j] <9)
                    my2DimArray[i][j] += 2;

            }

        }
        System.out.println(Arrays.deepToString(my2DimArray));





    }
}
