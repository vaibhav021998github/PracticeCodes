package com.test.day10;

public class SingletonPattern {
	public static SingletonPattern singleObject=null;
	private SingletonPattern() {
		
	}
	public static synchronized SingletonPattern  getSingletonObject() {
		if(singleObject==null) {
			singleObject=new SingletonPattern();
			return singleObject;
		}else {
			return singleObject;
		}
		
	}

	public static void main(String[] args) {
		// Singleton pattern Coding...
		SingletonPattern first=SingletonPattern.getSingletonObject();		
		SingletonPattern second=SingletonPattern.getSingletonObject();	
		System.out.println(first.hashCode());
		System.out.println(second.hashCode());

	}

}
