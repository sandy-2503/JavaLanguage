package com.sandeep.predicates;

import java.util.function.Consumer;

class Movie {
	String name;

	public Movie(String name) {
		super();
		this.name = name;
	}

}

public class ConsumerEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Movie> c  = s -> System.out.println("Movie Name "+s.name);
		Consumer<Movie> c1 = s -> System.out.println("Movie Name1 "+s.name);
		Consumer<Movie> c2 = s -> System.out.println("Movie Name2 "+s.name);
		
		// Consumer joining
		Consumer<Movie> c3 = c.andThen(c1).andThen(c2);
		Movie m = new Movie("Sandeep");
		c3.accept(m);
	}

}
