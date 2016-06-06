package Model;

import Test.FlyWithWingsTest;
import Test.QuackTest;

public class RedHeadDuck extends Duck {
 
	public RedHeadDuck() {
		flyBehavior = new FlyWithWingsTest();
		quackBehavior = new QuackTest();
	}
 
	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
}