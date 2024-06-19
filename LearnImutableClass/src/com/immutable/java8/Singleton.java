package com.immutable.java8;

import java.lang.reflect.Constructor;

public class Singleton {
	
	public static void main(String[] args) throws Exception {
//		Singleton instance1 = Singleton.getInstance();
//		System.out.println(instance1.hashCode());
//		Singleton instance2 = Singleton.getInstance();
//		System.out.println(instance2.hashCode());
		
		
		
//			There are some way to break singleton pattern;
//			1: By using reflection api
				Singleton instance1 = Singleton.getInstance();
				System.out.println(instance1.hashCode());
				Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
				constructor.setAccessible(true);
				Singleton instance2 = constructor.newInstance();
				System.out.println(instance2.hashCode());
					 
//					Solution: 1- if object is present then throw exception inside the constructor;
//					          2- use enum
			
//			2: 
//			3:
		
	}
	
	private Singleton(){
//		if(singleton != null) {
//			throw new RuntimeException(" you are trying to break singleton rules");
//		}
		
	}
	
	public static Singleton singleton;
	
	public static Singleton getInstance() {
		if(singleton == null) {
			singleton = new Singleton();
		}
			return singleton;
		 
	 }

}
