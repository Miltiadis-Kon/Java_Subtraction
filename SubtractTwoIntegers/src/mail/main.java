package mail;

public class main {

	//Create Instance of subtract class 
	private static subtract sub= new subtract();
	
	//Implement main function
	public static void main(String[] args) {
		
		//Call subtract method from the sub Instance.
		//Here it will execute 12-5
		String res=sub.subtractTwoIntegers(12, -5);
		//Print result in terminal.
		System.out.printf(res);  
	}

}
