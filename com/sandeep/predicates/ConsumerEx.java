package com.sandeep.predicates;

import java.util.function.Consumer;

public class ConsumerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> c = s->System.out.println(s); 
		c.accept("Hello");
	}

}
