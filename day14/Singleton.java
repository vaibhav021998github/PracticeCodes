package com.test.day14;

public class Singleton {
public static Singleton singletonObject=null;
public static synchronized Singleton getSingletonObject(){
	if(singletonObject==null) {
		singletonObject=new Singleton();
		return singletonObject;
	}else {
		return singletonObject;
	}
}
	public static void main(String[] args) {
		Singleton first=Singleton.getSingletonObject();
		Singleton second=Singleton.getSingletonObject();
		if(first.equals(second))
		{
			System.out.println("Object Created");
		}else {
			System.out.println("Another Object Created");
		}
	}

}
