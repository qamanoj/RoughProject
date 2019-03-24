package com.corejava;

class Test 
{
	final void m()
	{
		System.out.println("hii");
	}
}
class  Test1 extends Test
{
	final void m(int i)
	{
		System.out.println("hello");
	}

	public static void main(String[] args) {

		Test t=new Test();
		t.m();
		Test1 t1=new Test1();
		t1.m(10);
		t1.m();
		Test t2=new Test1();
		t2.m();
	}
}
