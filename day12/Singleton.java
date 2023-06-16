package com.test.day12;

public class Singleton {
	private Singleton() {
		
	}
	public static Singleton singletonObject=null;
	public static synchronized Singleton getSingletonObject()
	{	if(singletonObject==null) {
		singletonObject=new Singleton();
		return singletonObject;
	}else {
		return singletonObject;
	}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton first=getSingletonObject();
		Singleton second=getSingletonObject();
		System.out.println(first.hashCode());
		System.out.println(second.hashCode());
	}

}
