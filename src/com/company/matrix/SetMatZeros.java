package com.company.matrix;

import java.util.Scanner;

public class SetMatZeros {
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
        int[] rMat=new int[row];
        int[] cMat=new int[col];
        for(int i=0;i<row;i++){
            rMat[i]=1;
        }
        for(int i=0;i<col;i++){
            cMat[i]=1;
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0) {
                    rMat[i] = 0;
                    cMat[j] = 0;
                }}}
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(rMat[i]==0||cMat[j]==0) {
                    matrix[i][j] = 0;
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