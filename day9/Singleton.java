package com.test.day9;

public class Singleton {
	private static Singleton singletonObject = null;

	private Singleton() {
	}

	public static synchronized Singleton getSingletonObject() {
		if (singletonObject == null) {
			singletonObject = new Singleton();
			return singletonObject;
		} else {
			return singletonObject;
		}
	}

	public static void main(String[] args) {
		Singleton first = Singleton.getSingletonObject();
		Singleton second = Singleton.getSingletonObject();
		System.out.println(first.hashCode());
		System.out.println(second.hashCode());

	}

}
