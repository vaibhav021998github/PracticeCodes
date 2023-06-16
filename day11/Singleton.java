package com.test.day11;


public class Singleton {
	public static Singleton singleObject=null;
	private Singleton(){
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton first=getSingletonObject();
		Singleton second=getSingletonObject();
		System.out.println(first.hashCode());
		System.out.println(second.hashCode());
		
		}
		public static synchronized Singleton getSingletonObject() {
			if(singleObject==null) {
				singleObject=new Singleton();
				return singleObject;
			}else {
				return singleObject;
			}
		}
		
	}


