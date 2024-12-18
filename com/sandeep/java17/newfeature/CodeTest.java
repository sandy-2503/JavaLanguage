package com.sandeep.java17.newfeature;

import java.util.function.BiFunction;
import java.util.stream.IntStream;

public class CodeTest {

	public static void main(String[] args) {
		/*
		 * int a =5; int b=10; first :{ second : { if(a == b>>1) { break first; } }
		 * System.out.println(a); } System.out.println(b);
		 */
		
		BiFunction<String, String, Boolean> comp = (x,y)->x.equals(y);
		System.out.println(comp.apply("Java8", "Java8"));
		
		IntStream.of(1,1,3,3,7,6,7)
		.distinct()
		.parallel()
		.map(i->i*2)
		.sequential()
		.forEach(System.out::println);
		
		char a[] = new char[10];
		for (int j = 0; j < 10; ++j) {
			a[j]='1';
			System.out.println(a[j]+"");
			j++;
		}
		
		String str = ")(()()";

		char b[] = str.toCharArray();
		int open =0,close=0;
		for(int i=0;i<b.length;i++){
			if(b[0]==')'){
				System.out.println("Invalid");
				break;
			}
			if(b[i]=='('){
				open++;
			}else{
				close++;
			}	
		}
		if(open==close){
			System.out.println("valid");
		}else{
			System.out.println("invalid");
		}
	}

}
