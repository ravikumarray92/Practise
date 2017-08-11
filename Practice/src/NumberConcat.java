import java.io.DataInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.TreeSet;
 
 
public class NumberConcat  {
 
       @SuppressWarnings("deprecation")
	public static void main(String[] args) {
    	   int arraySize = 0;
    	   System.out.println("\n Enter the size of the Array : ");
             DataInputStream din = new DataInputStream(System.in);
             try {
				 arraySize = Integer.parseInt(din.readLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
             int[] arrayOfNumbers = new int[arraySize];
              String ans="";
              int count =0;
              TreeSet<String> tree =new TreeSet<>();
              for(int i=0;i<arrayOfNumbers.length;i++)
              {
            	  count++;
            	  System.out.println("Enter the " + count +" st\\nd "+" number :");
            	  
            	  try {
					arrayOfNumbers[i] = Integer.parseInt(din.readLine());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
              }
             for(int number : arrayOfNumbers){
            	 System.out.println(number);
            	 tree.add(Integer.toString(number));
             }
              Iterator<String> i = tree.descendingIterator();
              while(i.hasNext()){
                    
                     String and=i.next().toString();
                     ans=ans+and;
              }
              System.out.println("The Largest number formed is : "+ans);
      
       }
 
}