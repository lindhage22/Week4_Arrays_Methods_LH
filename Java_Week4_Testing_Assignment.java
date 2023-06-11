package week04;



public class Java_Week4_Testing_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Coding Steps — Arrays and Methods
		
		//Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		     
		     int[] ages = new int []{3, 9, 23, 64, 2, 8, 28, 93};
		
		// 1) Programmatically subtract the value of the first element in the array 
		     //from the value in the last element of 
		     //the array (i.e. do not use ages[7] in your code). 
		     //Print the result to the console.  
		
		       System.out.println(ages[0]- ages[ages.length-1]);
		       
		       
		// 2)Add a new age to your array and repeat the step above to 
		       //ensure it is dynamic (works for arrays of different lengths).
		
		       ages = new int []{3, 9, 23, 64, 2, 8, 28, 93, 22};
		       
		       System.out.println(ages[0]- ages[ages.length-1]);
		  
		       
		       // 3)Use a loop to iterate through the array and calculate 
		       //the average age. Print the result to the console.
		    
		        int sum = 0;
		        double avg = 0.0;		
		
		        for (int i = 0; i < ages.length; i++) {
		        	sum = sum + ages [i];
		        	
		        }
		        avg = (double)sum/ages.length;
		        System.out.println("The average is :" + avg);
		
		//Create an array of String called names that contains 
		   //the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		
		     String [] names = new String[]{"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		     
		// 1)Use a loop to iterate through the array and calculate the 
		     //average number of letters per name. Print the result to the console.
		      int totalNumLettersName = 0;
		      double avgNumLettersName = 0.0;
		      
		    	 for(int i = 0; i < names.length; i++) {
		    		 totalNumLettersName += names[i].length();
		    	 }
		    	 avgNumLettersName = (double)totalNumLettersName /names.length;
		    	 System.out.println(avgNumLettersName);
	
		 
	    // 2)Use a loop to iterate through the array again and 
		    	 //concatenate all the names together, 
		    	 //separated by spaces, and print the result to the console.
		    
		         
		     
		    // String result = "";
		      ///for (int i = 0; i < names.length; i++) {
		    	// result += names [i] + " ";
		     // }
		    //  System.out.println(result);
		    	 for (int i = 0; i < names.length; i++) {
		    		 System.out.print(names [i] + " ");
			      }
			      System.out.println();
	

		//How do you access the last element of any array?
		      
		    	  System.out.println(names[5]);
		      
		    	 

		      
		//How do you access the first element of any array?
	
	            
	          System.out.println(names[0]);


	
		//Create a new array of int called nameLengths. 
	       //Write a loop to iterate over the previously 
	       //created names array and add the length of 
	       //each name to the nameLengths array.
		// first I messed up and out printed :[I@1175e2db I did the out print 
	          //incorrectly by putting it out side the loop
					
	        
	          int []nameLengths = new int [names.length -1];
				for (int i = 0; i < nameLengths.length; i++) {
				nameLengths[i] = names[i].length();
				//System.out.println(nameLengths[i]);
			}
						
			

	             
	    //Write a loop to iterate over the nameLengths array and 
			//calculate the sum of all the elements in the array. 
			//Print the result to the console.
		
				int sumOfAllElements = 0;
				for (int i1 = 0; i1 <nameLengths.length; i1++) {
				sumOfAllElements += nameLengths[i1];
				

}
		
	System.out.println("The sum of all the elements is the array is: " + sumOfAllElements);
	
	
	//must call method to run because it lives out side of the runner method so it can be reused again.
	
	//System.out.println(concatenateWord("hello", 3)); (Hello to print)
	
	//System.out.println(fullName("Lindy","Hagedorn")); (first and last name)
	
	//int []arr = new int []{15,22,16, 45};
    //System.out.println(sumOfInt(arr)); (sum great than 100)
	
	 //double []array = new double[]{45.8,78.5,11.2};
	   // System.out.println(averageofTheElement(array)); (returns the average of elements)
	
	//double []myArr1 = new double[]{6.4,2.1};
    //double []myArr2 = new double[]{7.2,2.6,6.7};
    //System.out.println(avgOfElemInBothArrays(myArr1,myArr2)); (avg of elements 1st array is greater 2nd array)
	
	//System.out.println(willBuyDrink(true,12.50)); 
	
	System.out.println(newString("Lindy Hagedorn", "Washburn")); 
	//(my creation with method with hyphen)
	
	}
				
	//Write a method that takes a String, word, and an int, n, 
	//as arguments and returns the word concatenated to itself n number of times. 
	//(i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).

	
	
    public static String concatenateWord (String word, int n) {
        String cWord = "";
    	for (int i = 0; i < n; i++) {
       cWord += word;
    }
       return cWord;
    }

  
	//Write a method that takes two Strings, firstName and lastName, 
      //and returns a full name (the full name should be the 
      //first and the last name as a String separated by a space).
		
    public static String fullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }		
      	            
	//Write a method that takes an array of int and returns 
    //true if the sum of all the ints in the array is greater than 100.
       
   
    public static boolean sumOfInt (int [] arr){
        int sum = 0;
        for (int i =0; i< arr.length;i++){
            sum += arr[i];
        }
        if (sum>100){
            return true;
        }
        return false;
    }
   	             
	//Write a method that takes an array of double 
    //and returns the average of all the elements in the array.
		
   
  public static double averageofTheElement(double [] array){
        double sum = 0.0;
        double avg =0.0;
        for (int i = 0; i< array.length; i++){
            sum += array[i];
        }
        avg =  sum/ array.length;
        return avg;
	  
       
  }
        
 //Write a method that takes two arrays of double and returns 
    //true if the average of the elements in the first 
    //array is greater than the average of the elements in the second array.

    
   
    public static boolean avgOfElemInBothArrays(double [] arr1, double []arr2){
        double sum1 = 0.0;
        double sum2 = 0.0;
        double avg1, avg2;

        for (int i =0 ; i<arr1.length;i++){
            sum1 += arr1[i];
        }
        for(int i = 0; i<arr2.length; i++){
            sum2+=arr2[i];
        }
        avg1 = sum1/ arr1.length;
        avg2 = sum2/ arr2.length;

        if (avg1>avg2){
            return true;
        }
        return false;
    }

    
 //Write a method called willBuyDrink that takes 
    //a boolean isHotOutside, and a double moneyInPocket, 
    //and returns true if it is hot outside and if 
    //moneyInPocket is greater than 10.50.
    
    

    

    public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket){
        if ((isHotOutside==true && moneyInPocket>10.50)){
            return true;
        }
        return false;
    
    }
    
   
   
    

 //Create a method of your own that solves a problem. 
    //In comments, write what the method does and why you created it.	
    //String ages

    
    //This method will add a hyphen to the if a person has a secondary last name.
    // I choose this because in my early days in IT working with applications 
    // developers missed this a lot when building applications.  Something it is still a problem.

  public static String newString(String firstLastName, String hyphenLastName) {
    return firstLastName + "-" + hyphenLastName; 
  }
}
  
  
