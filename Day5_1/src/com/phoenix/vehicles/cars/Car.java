/* 
 * Author: mansi.jain@stltech.in
 * Creation Date: 18-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package com.phoenix.vehicles.cars;

import com.phoenix.interfaces.Movable;
import com.phoenix.interfaces.Runnable;
import com.phoenix.vehicles.Vehicle;

public class Car extends Vehicle implements Movable, Runnable {

	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Car runs");

	}

	
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Car moves");

	}
    public void start() {
    	System.out.println("Car starts");
		
	}
	public void stop() {
		System.out.println("car stops");
		
	}

}