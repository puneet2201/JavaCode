package com.immutable.java8;

public class SingletonThreadSafe {
	public static void main(String[] args) {
		SingletonThreadSafe instance1 = SingletonThreadSafe.getInstance();
		System.out.println(instance1.hashCode());
		SingletonThreadSafe instance2 = SingletonThreadSafe.getInstance();
		System.out.println(instance2.hashCode());
		
	}
	
	private SingletonThreadSafe() {
		
	}
	
	public static SingletonThreadSafe object;
	
	
    public static SingletonThreadSafe getInstance() {
		if(object == null) {
			synchronized (SingletonThreadSafe.class) {
				if(object == null)
				object = new SingletonThreadSafe();
			}
		}
		return object;
			
	}

}
