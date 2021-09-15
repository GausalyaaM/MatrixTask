package com.company.matrix;
import java.util.Scanner;
public class MatrixSum {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row=scan.nextInt();
        System.out.println("Enter the number of columns:");
        int col=scan.nextInt();
        int[][] mat=new int[row][col];
        System.out.println("Enter the matrix elements:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j]= scan.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                sum+=mat[i][j];
            }
        }
        System.out.println(sum);
    }
 }

