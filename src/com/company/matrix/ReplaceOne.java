package com.company.matrix;

import java.util.Scanner;

public class ReplaceOne {
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
        int arr[]=new int[row];
        int k=0,sum=0;
        for (int i = 0; i < row; i++) {
            int count=0;
            for (int j = 0; j < col; j++) {
                if(matrix[i][j]==1){
                    count++;

                }
            }
            arr[i]=count;
            if(arr[i]>sum) {
                sum = arr[i];
                k=i;
            }
            }
             for(int j=0;j<col;j++) {
                 matrix[k][j] = 0;
             }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

            }
    }

