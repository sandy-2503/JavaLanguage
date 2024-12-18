package com.sandeep.threadex;

public class ThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 tt = new Thread1();
		tt.start();
		try {
			tt.join(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("B Thread"+Thread.currentThread().getName());
		}
	}

}
