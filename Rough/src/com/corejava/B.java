package com.corejava;

  class B 
{
	 B() 
	{
	System.out.println(this.hashCode());
	}
}
	class A extends B
	{
		A()
		{
			System.out.println(this.hashCode());
		}
	}
	class C
	{
		public static void main(String[] args)
		{
			A a=new A();
			System.out.println(a.hashCode());
		}
	}


