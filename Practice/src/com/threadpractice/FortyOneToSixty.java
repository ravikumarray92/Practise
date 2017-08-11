package com.threadpractice;

public class FortyOneToSixty extends Thread {
	public void run()
	{
		System.out.println("Third Thread");
		for(int i =41; i<=60;i++)
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
