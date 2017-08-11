package com.matrix.practice;

public class DiagnoalMatrixSumAndDifference {
	
	public static void main(String [] args)
	{
		
		int n = 4;
		int  matrix[][]  = new int[n][n];
		int firstDiagonalsum = 0;
		int secondDiagonalSum = 0;
		int k = n;
		int difference = 0;
		int differ = 0;
		matrix[0][0] = 95;  matrix[1][0] = 14;  matrix[2][0] = 51;  matrix[3][0] = 25;
		matrix[0][1] = 35;  matrix[1][1] = 80;  matrix[2][1] = 54;  matrix[3][1] = 75;
		matrix[0][2] = 84;  matrix[1][2] = 74;  matrix[2][2] = 50;  matrix[3][2] = 65;
		matrix[0][3] = 78;  matrix[1][3] = 96;  matrix[2][3] = 45;  matrix[3][3] = 55;
		
		int ayush = 0;
		for(int i=0;i<n;i++)
		{
			ayush = ayush + matrix[i][i]-matrix[i][n-1-i];
			firstDiagonalsum = firstDiagonalsum + matrix[i][i];	
		}
  
	for(int i=n-1;i>=0;i--)
	{
		secondDiagonalSum = secondDiagonalSum + matrix[k-1][n-1-i];
        k--;
	}                                                  
	
	System.out.println(" First Diagonal Sum = "+firstDiagonalsum );
	System.out.println(" Second Diagonal Sum = "+secondDiagonalSum );
	System.out.println(" Difference is = "+ayush );
	int diff = firstDiagonalsum-secondDiagonalSum;
	System.out.println(" Difference is = "+ diff );
	
	
	}    
	
	
	                                                                  
	
	

}
