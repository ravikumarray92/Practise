package com.threadpractice;

public class TwentyOneToForty extends Thread{
	
	public void run()
	{
		System.out.println("Second Thread");
		for(int i =21; i<=40;i++)
		{
			System.out.println("Table of "+ i);
			int j = 1;
			while(j<=10)
			{
				System.out.println(i+"*"+j+"=" + i*j);
				j++;
				
			}
			System.out.println();
		}
	}

}
