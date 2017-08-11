package com.threadpractice;

public class TablePrinting {
	
	public static void main(String [] args)
	{
		OneToTwenty ott = new OneToTwenty();
		TwentyOneToForty totf = new TwentyOneToForty();
		FortyOneToSixty  fots = new FortyOneToSixty();
		ott.start();
		
		
		
		try {
			ott.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		totf.start();
		try {
			totf.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		fots.start();
		System.out.println(fots.getName());
	}

}
