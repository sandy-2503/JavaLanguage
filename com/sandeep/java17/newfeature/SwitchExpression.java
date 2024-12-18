package com.sandeep.java17.newfeature;

public class SwitchExpression {
	public static void main(String[] args) {
		oldStyleWithoutBreak(Fruit.ORANGE);
		//withReturnValue(Fruit.ORANGE);
		withYield(Fruit.APPLE);
		//oldStyleWithYield(Fruit.APPLE);
	}
	private static void oldStyleWithoutBreak(Fruit fruit) {
	    switch (fruit) {
	        case APPLE, PEAR:
	            System.out.println("Common fruit");
	        case ORANGE, AVOCADO:
	            System.out.println("Exotic fruit");
	        default:
	            System.out.println("Undefined fruit");
	    }
	}
	private static void withReturnValue(Fruit fruit) {
	    String text = switch (fruit) {
	        case APPLE, PEAR -> "Common fruit";
	        case ORANGE, AVOCADO -> "Exotic fruit";
	        default -> "Undefined fruit";
	    };
	    System.out.println(text);
	}
	
	private static void withYield(Fruit fruit) {
	    String text = switch (fruit) {
	        case APPLE, PEAR -> {
	            System.out.println("the given fruit was: " + fruit);
	            yield "Common fruit";
	        }
	        case ORANGE, AVOCADO -> "Exotic fruit";
	        default -> "Undefined fruit";
	    };
	    System.out.println(text);
	}
	
	private static void oldStyleWithYield(Fruit fruit) {
	    System.out.println(switch (fruit) {
	        case APPLE, PEAR:
	            yield "Common fruit";
	        case ORANGE, AVOCADO:
	            yield "Exotic fruit";
		default:
	            yield "Undefined fruit";
	    });
	}
	
	private static void getSwitchValue(Fruit fruit) {
		
	}
}


