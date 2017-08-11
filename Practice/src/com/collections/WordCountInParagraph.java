package com.collections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class WordCountInParagraph {
	
	public static void main (String args [])
	{
		
		HashMap<String, Integer> map = new HashMap<>();
		ArrayList<String> arrayList = new ArrayList<>();
		String filePath = "D:/Content.txt";
		File file = new File(filePath);
		FileReader filereader = null;
		try {
			filereader = new FileReader(file);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} 
		BufferedReader buf = new BufferedReader(filereader);
		
		try {
			String line = buf.readLine();
			
			int length = 0;
			int i = 0;
			while(line != null)
			{
				 
				 
				String wordsArray[] = line.split("\\s+");
				for(i=0;i<wordsArray.length;i++)
				{
					arrayList.add(wordsArray[i]);
				}
				
				line = buf.readLine();
			 	
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		for(int i =0;i<arrayList.size();i++)
		{
			//System.out.println(arrayList.get(i));
			if(map.containsKey(arrayList.get(i))){
				map.put(arrayList.get(i),map.get(arrayList.get(i))+1);
				
			}
			else{
				map.put(arrayList.get(i),1);
			}
		}
		
		Iterator iterator = map.keySet().iterator();
		 System.out.println("Printing the HashMap"); 
		while (iterator.hasNext()) {
		   String key = iterator.next().toString();
		   String value = map.get(key).toString();
		  
		   System.out.println(key + " - " + value);
		}

		
	}

}
