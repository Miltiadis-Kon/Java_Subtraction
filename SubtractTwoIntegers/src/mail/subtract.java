package mail;

public class subtract {

	public String subtractTwoIntegers(int firstInteger,int secondInteger)
	{
		//Set result to null!
		String res="";
		
		// if a-b<0, then return negative 
		if ((firstInteger-secondInteger)<0) res= "NEGATIVE";
		
		// if a-b> or equal to 0, then return negative.
		else res= "POSITIVE";
		return res;
	}
}
