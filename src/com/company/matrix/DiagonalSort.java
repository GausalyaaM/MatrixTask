package com.company.matrix;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row = scan.nextInt();
        System.out.println("Enter the number of columns:");
        int col = scan.nextInt();
        int[][] matrix = new int[row][col];
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        int k=0;
        int[] arr=new int[row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==j)
                {
                    arr[k++]=matrix[i][j];
                }
            }
        }
        Arrays.sort(arr);
        k=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==j){
                    matrix[i][j]=arr[k++];
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
