package com.sandeep.streamex;

public class SwitchTest {
	enum Fruit  {APPLE,PEAR,ORANGE,AVOCATO};
	private static void withSwitchExpression(Fruit fruit) {
	    switch (fruit) {
	        case APPLE, PEAR -> System.out.println("Common fruit");
	        case ORANGE, AVOCATO -> System.out.println("Exotic fruit");
	        default -> System.out.println("Undefined fruit");
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		withSwitchExpression(Fruit.APPLE);
	}

}
