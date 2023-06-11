package week04;

public class JAVA_Week4_CAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Coding Steps — Arrays and Methods
		
		//Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		     
		     int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		// 1) Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
		
		       System.out.println(ages[ages.length-1] - ages[0]);
		// 2)Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		// 3)Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		    int total =0;
		    for (int age : ages) {
		    	total =+ age;
		    }
		    double median = total/ages.length;
		    System.out.println (median);
		
		
		//Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		
		     String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		     
		// 1)Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		      int theTotal =0;
		      {
		    	  for(String name: names ) {
		    		  theTotal += name.length();
		    		  System.out.println(median);
		    	  }
		      }
		 
	    // 2)Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		    
		          
		      
		      String result = "";
		      for (int i = 0; i < names.length; i++) {
		    	 result += names [i] + " ";
		      }
		      System.out.println(result);
	
		      
		    
		
		//How do you access the last element of any array?
		      
		      System.out.println(names[5]);
		      }
		      
		//How do you access the first element of any array?
	
	             System.out.println(names[0]);

				
		//Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		//Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		//Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		//Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
		//Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		//Write a method that takes an array of double and returns the average of all the elements in the array.
		//Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
		//Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		//Create a method of your own that solves a problem. In comments, write what the method does and why you created it.	String ages
	}


