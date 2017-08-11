package com.threadpractice;

public class OneToTwenty extends Thread{
	
	public void run()
	{
		System.out.println("First Thread");
		for(int i =1; i<=20;i++)
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
