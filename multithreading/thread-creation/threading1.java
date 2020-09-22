package com.multithreading;

public class threading1 implements Runnable {
	static Thread oddThread;
	static Thread evenThread;
	public void run() {
		try {
			if (Thread.currentThread().getName().equals("OddThread")) 
				evenThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for (int i = 1; i <= 20; i++) {
			if (Thread.currentThread().getName().equals("EvenThread")) {
				if (i % 2 == 0) System.out.print(i);
			} 
			
			if (Thread.currentThread().getName().equals("OddThread")) {
				if (i % 2 == 1) System.out.print(i);
			}
		}
	}

	public static void main(String[] args) {
		threading1 t1 = new threading1();
		
		oddThread = new Thread(t1, "OddThread");
		evenThread = new Thread(t1, "EvenThread");
		
		oddThread.start();
		evenThread.start();
	}


	

}