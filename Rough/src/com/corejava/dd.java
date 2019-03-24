package com.corejava;

import java.util.ArrayList;

public class dd {

	public void mybuf(StringBuffer s,StringBuffer s1){
		s.append("B");
		s=s1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l=new ArrayList<>();
		int f=10;
		l.add(10);
		int j=l.get(0);
		dd d=new dd();
		StringBuffer s=new StringBuffer("A");
		StringBuffer s1=new StringBuffer("B");
		d.mybuf(s,s1);
		System.out.println(s);
	}

}
