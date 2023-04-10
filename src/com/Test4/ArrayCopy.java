package com.Test4;

//reverse of rows in 2D array
public class ArrayCopy
{
	public static void copyArray(int a[][])
	{
		int m=2;
		int n=4;
		for(int i=0;i<m;i++)
		{
			int start=0;
			int end=n-1;
			while(start<end)
			{
				int temp=a[i][start];
				a[i][start]=a[i][end];
				a[i][end]=temp;
				start++;
				end--;
			}
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
	}
	}

	public static void main(String[] args) 
	{
        int a[][]= {{1,2,3,4},{5,6,7,8}};
		

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------");
		ArrayCopy.copyArray(a);
	
		

	}

}
