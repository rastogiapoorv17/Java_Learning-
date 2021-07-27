package main.string_Programs_Apoorv;

import java.util.UUID;

//import main.string_Programs_Apoorv.RandomString.randomstring;

public class RandomStringss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		randomstring rs = new randomstringgenrator();
		rs.randomstringgenerate();
	}
}
 interface randomstring{
	

	void randomstringgenerate();
 }


class randomstringgenrator implements randomstring
{
	public void randomstringgenerate()
	{
		// create a string of all characters
	    String str= (UUID.randomUUID()).toString();
	    System.out.println(str);
	}
}
