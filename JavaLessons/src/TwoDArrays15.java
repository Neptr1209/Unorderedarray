
/*
2D array - an array where each element is an array
It is useful for storing a matrix of data
 */

import javax.swing.*;

public class TwoDArrays15 {
    public static void main(String[] args){
        // Regular array
        String[] fruits = {"apple", "orange", "banana"};
        String[] foods = {"pizza", "pasta", "rice", "fried rice"};

        // 2D array
        String[][] groceries = {fruits,foods};

        // Another way
//        String[][] groceries = {
//                {"apple", "orange", "banana"},
//                {"pizza", "pasta", "rice", "fried rice"}
//        };

        // Printing
        for(String[] foood:groceries){ // This part only prints the memory address.
            //System.out.println(foood);
            for(String food: foood){ // after printing the address, we need to iterate all of the address again
                System.out.print(food+ " ");
            }
            System.out.println();
        }
        System.out.println("======================");

        // To replace an element within 2D array
        groceries[0][1] = "pineapple"; // Row zero, column 1
        // Printing
        for(String[] foood:groceries){ // This part only prints the memory address.
            //System.out.println(foood);
            for(String food: foood){ // after printing the address, we need to iterate all of the address again
                System.out.print(food+ " ");
            }
            System.out.println();
        }
        // Practice
        practice();

        // Calculating the rows
        calculateRow();

        // Calculating the columns
        calculateColumn();

        // Calculating all elements in 2D Array
        calcualteAllElements();
    }

    static void practice(){
        System.out.println("=============");

        char[][] telephone = {
                {'1','2','3'},
                {'4','5','6'},
                {'7','8','9'},
                {'*','0','#'}
        };

        for(char[] row: telephone){
            //System.out.print(row+ " " );
            for(char number: row){
                System.out.print(number+" ");
            }
            System.out.println();
        }
    }

    static void calculateRow(){
        System.out.println("=============");
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };

        // Calculate and print the sum of each row in a 2D matrix
        for (int row = 0; row < matrix.length; row++) {
            int rowSum = 0;
            for (int column = 0; column < matrix[row].length; column++) {
                rowSum += matrix[row][column];
            }
            System.out.println("Sum of row " + row + ": " + rowSum);
        }
    }

    static void calculateColumn(){
        System.out.println("=============");
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };

        for(int column = 0 ; column<matrix.length;column++){
            int columnSum = 0;
            for(int row = 0; row<matrix[column].length;row++){
                columnSum += matrix[row][column];
            }
            System.out.println("Sum of column " + column + " Is: "+columnSum);
        }

    }

    static void calcualteAllElements(){
        System.out.println("=============");
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };

        int Two_D_ArraySum = 0;
        for(int row=0; row< matrix.length;row++){
            for(int column=0;column< matrix.length;column++){
                Two_D_ArraySum += matrix[row][column];
            }
        }
        System.out.println("The sum of all the elements within the 2D Array is: "+Two_D_ArraySum);
    }
}
