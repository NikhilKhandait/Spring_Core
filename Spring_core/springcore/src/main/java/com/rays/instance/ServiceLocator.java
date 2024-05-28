package com.rays.instance;

public class ServiceLocator {

	private static ServiceLocator instance;
	private ServiceLocator() {
		
	}
	
	public static ServiceLocator getinstance() {
		if (instance == null) {
			
			instance = new ServiceLocator();
			
		}
		return instance;
		
	}
}
