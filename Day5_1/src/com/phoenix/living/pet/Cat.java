/* 
 * Author: mansi.jain@stltech.in
 * Creation Date: 18-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package com.phoenix.living.pet;

import com.phoenix.interfaces.Walkable;
import com.phoenix.living.Animal;

public class Cat extends Animal implements Walkable {

	
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("Cat jump");

	}


	public void move() {
		// TODO Auto-generated method stub
		System.out.println("cat moves");

	}


	public void run() {
		// TODO Auto-generated method stub
		System.out.println("cat runs");

	}

	
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("cat walks");

	}

}