package com.test.day13;

public class Singleton {
	public static Singleton singletonObject=null;
	private Singleton() {
		
	}
	public static synchronized Singleton getSingletonObject() {
		if(singletonObject==null) {
			singletonObject=new Singleton();
			return singletonObject;
		}else
		{
			return singletonObject;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton first=Singleton.getSingletonObject();
		Singleton second=Singleton.getSingletonObject();
		System.out.println(first.hashCode());
		System.out.println(second.hashCode());

	}

}
