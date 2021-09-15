package com.company.matrix;

import java.util.Scanner;
import java.util.Stack;

public class Rectangle {
    public static int largestRectArea(int[] height){
        Stack<Integer> stack=new Stack<>();
        stack.push(-1);
        int maxArea=0;
        for(int i=0;i<=height.length;i++)
        {
            int val=i==height.length?0:height[i];
            while(stack.peek()!=-1&&height[stack.peek()]>=val){
                int right=i;
                int high=height[stack.pop()];
                int left=stack.peek();
                maxArea=Math.max(maxArea,high*(right-left-1));
            }
            stack.push(i);
        }
        return maxArea;
    }
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
        int[] height=new int[col];
        for(int i=0;i<col;i++) {
            height[i] = matrix[0][i];
        }
        int area=largestRectArea(height);
        for(int i=1;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==1){
                    height[j]++;
                }else{
                    height[j]=0;
                }
            }
        }
        area=Math.max(area,largestRectArea(height));
        System.out.println(area);
        }
}
