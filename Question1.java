
// 1. Write the Java program in which create the multiple objects
// and display the count of number of objects created into class.






public class Question1 {

	
	   static int countObjects; // static variable for count object
	   
	     Question1()    // create or call the default constructor for object count.
	     {
	    	 countObjects++;
	     }
	
	     
	     public static void getObjects()   // here we create the method for object count.
    	 
	     {   
	    	 System.out.println("Number of Objects in class : " + countObjects);
	    	 
	     }
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
	
		
		Question1 countobj1 = new Question1();
		Question1 countobj2 = new Question1();
		Question1 countobj3 = new Question1();
		Question1 countobj4 = new Question1();
		Question1 countobj5 = new Question1();
		Question1 countobj6 = new Question1();
	      
		getObjects();
		
	
	}
}
