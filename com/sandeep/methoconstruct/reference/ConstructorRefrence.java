package com.sandeep.methoconstruct.reference;

class Sample {
	Sample() {
		System.out.println("Call sample constructor");
	}

	Sample(String s) {
		System.out.println("Call sample constructor with argument " + s);
	}
}

interface intf {
	public Sample get();
}
interface intf1 {
	public Sample get(String s);
}

public class ConstructorRefrence {

	public static void main(String[] args) {
		intf i = Sample::new;
		Sample s = i.get();
		
		intf1 i1= Sample::new;
		Sample s1 = i1.get("Sandeep");
	}

}
