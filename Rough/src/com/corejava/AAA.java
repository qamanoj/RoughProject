package com.corejava;

public class AAA {

	public static void main(String[] args) {
		
		int c=1;
		for (int i = 1; i <=5; i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=c;k++)
			{
				System.out.print("*");
			}
			c=c+2;
			System.out.println();
		}
		int c1=7;
		for (int i = 1; i <=4; i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=c1;k++)
			{
				System.out.print("*");
			}
			c1=c1-2;
			System.out.println();
		}
	}
}
