package com.company.matrix;

import java.util.Scanner;

public class MatGame {
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
        System.out.println("Enter the value of x:");
        int x= scan.nextInt();
        int result=isSuperSimilar(row,col,matrix,x);
        System.out.println(result);
    }
    public static int isSuperSimilar(int n,int m,int mat[][],int x){
        int[][] dup=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dup[i][j]=mat[i][j];
            }
        }
        for(int i=0;i<n;i++){
            int k=0;
            if(i%2==0){
                while(k != x)
                {
                    int temp = dup[i][0];
                    for(int j = 0; j<m-1; j++)
                    {
                        dup[i][j] = dup[i][j+1];
                    }
                    dup[i][m-1] = temp;
                    k++;
                }
            }
            else
            {
                while(k != x)
                {
                    int temp = dup[i][m-1];
                    for(int j = m-1; j>0 ;j--)
                    {
                        dup[i][j] = dup[i][j-1];
                    }
                    dup[i][0] = temp;
                    k++;
                }
                for(i = 0; i<n; i++)
                    for(int j = 0; j<m; j++)
                        if(dup[i][j] != mat[i][j])
                            return 0;
                //return 1;
            }
        }
        return 1;
    }
}