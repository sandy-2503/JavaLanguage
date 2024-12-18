package com.sandeep.threadex;

public class Thread1 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("A Thread"+Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
		
	}
}
