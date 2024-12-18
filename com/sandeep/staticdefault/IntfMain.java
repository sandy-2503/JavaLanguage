package com.sandeep.staticdefault;

public class IntfMain implements Intf1,Intf2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void d1() {
		// TODO Auto-generated method stub
		Intf1.super.d1();
	}

	@Override
	public void d2() {
		// TODO Auto-generated method stub
		Intf2.super.d2();
	}

}
