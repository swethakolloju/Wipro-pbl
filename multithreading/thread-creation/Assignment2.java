package com.multithreading;

import java.util.Random;

public class Assignment2 implements Runnable {

	public static void main(String[] args) {
		Assignment2 assignment2 = new Assignment2();
		Thread t1 = new Thread(assignment2);
		t1.start();
	}

	@Override
	public void run() {
		Random random = new Random();
		String colours[] = {"white", "blue", "black", "green", "red", "yellow"};
		int index;
		
		while ((index = random.nextInt(6)) != 4) {
			System.out.println(colours[index]);
		}		
	}

}