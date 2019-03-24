package com.corejava;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

public class Demo 
{
	public static void main(String[] args) throws IOException 
	{
		HashMap h=new HashMap();
		h.put(12, 14);
		h.put("xyz", "1.0f");
		h.put('A', 56);
		h.put(12, "abc");
		h.put(true, 45);
		h.put("jgf", "jgdf");
		Set s=h.keySet();
		for(Object obj:s)
		{
			System.out.println(h.get(obj));
		}
	}
}
