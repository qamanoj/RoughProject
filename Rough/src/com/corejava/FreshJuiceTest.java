package com.corejava;

class FreshJuice
{  
	enum Test{ SMALL, MEDIUM, LARGE } 
	Test size; 
}  
public class FreshJuiceTest 
{  
	public static void main(String args[])
	{ 
		FreshJuice juice = new FreshJuice(); 
		juice.size = FreshJuice.Test.MEDIUM ; 
		System.out.println("Size: " + juice.size); 
	} 
} 
