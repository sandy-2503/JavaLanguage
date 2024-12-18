package com.sandeep.predicates;

import java.util.Date;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

public class SuppliersEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Date> s =()->new Date();
		System.out.println(s.get());
		
		Supplier<String> s1 =()->{
			int otp;
			otp = (int)(Math.random()*10000);
			return ""+otp;
		};
		
		System.out.println(s1.get());
		BooleanSupplier bs = ()->false;
	}

}
