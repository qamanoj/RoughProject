package com.corejava;

import java.util.ArrayList;
import java.util.List;

class ttry
{
	public void mm(StringBuffer s2,StringBuffer s3)
	{
		System.out.println(s2.hashCode()+" **************   "+s3.hashCode());
		s2.append("b");
		s2=s3;
		System.out.println(s2.hashCode()+" ---------------   "+s3.hashCode());
	}
}
public class Smallchartoassci 
{
	public static void main(String[] args)
	{
		List<Integer> l=new ArrayList<>();
		ttry t=new ttry();
		StringBuffer s=new StringBuffer("a");
		StringBuffer s1=new StringBuffer("b");
		System.out.println(s.hashCode()+" ==========   "+s1.hashCode());
		t.mm(s,s1);
		System.out.println(s.hashCode()+" ========== +++++++++  "+s1.hashCode());
		System.out.println(s);

	}
}
