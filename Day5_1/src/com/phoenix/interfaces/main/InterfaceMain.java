/* 
 * Author: mansi.jain@stltech.in
 * Creation Date: 18-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package com.phoenix.interfaces.main;

import com.phoenix.interfaces.Movable;
import com.phoenix.living.pet.Cat;
import com.phoenix.living.wild.Tiger;
import com.phoenix.machines.HumanRobot;
import com.phoenix.planets.Earth;
import com.phoenix.planets.Jupiter;
import com.phoenix.vehicles.cars.Car;

public class InterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Movable m=null;
		
		m = new Earth();
		((Earth)m).setNoOfMoons(1);
		((Earth)m).toSting();
		((Earth)m).supportsLife();
		((Earth)m).move();
		((Earth)m).revolve();
		((Earth)m).rotate();
		System.out.println("---------------------");
		
		m = new Jupiter();
		((Jupiter)m).setNoOfMoons(2);
		((Jupiter)m).toSting();
		((Jupiter)m).supportsLife();
		((Jupiter)m).move();
		((Jupiter)m).revolve();
		((Jupiter)m).rotate();
		System.out.println("---------------------");
		
		m = new Tiger();
		((Tiger)m).jump();
		((Tiger)m).run();
		((Tiger)m).move();
		((Tiger)m).walk();
		System.out.println("---------------------");
		
		m = new Cat();
		((Cat)m).jump();
		((Cat)m).run();
		((Cat)m).move();
		((Cat)m).walk();
		System.out.println("---------------------");
		
		m = new Car();
		((Car)m).run();
		((Car)m).move();
		((Car)m).start();
		((Car)m).stop();
		System.out.println("---------------------");
		
		m = new HumanRobot();
		((HumanRobot)m).jump();
		((HumanRobot)m).run();
		((HumanRobot)m).walk();
		((HumanRobot)m).processData();
		((HumanRobot)m).senseInfo();
		((HumanRobot)m).useArtificialIntelligence();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
