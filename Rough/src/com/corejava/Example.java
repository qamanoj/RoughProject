package com.corejava;

import java.util.ArrayList;

public class Example
{
	public static void m1(ArrayList<Integer> ii){
		int j=0;
		while(j<ii.size()){
			if(ii.get(j)<0){
				ii.remove(j);
			}
			else
				j++;
		}
	}
	
	public static void main(String[] args) 
	{
		ArrayList<Integer> l=new ArrayList<Integer>();
		for(int i=0;i<=10;i++){
			l.add(i);
			
			
			
		}
		
		m1(l);
		//m2(l);
		System.out.println(l);
	}
	
	
}
