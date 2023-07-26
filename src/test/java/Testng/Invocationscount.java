package Testng;

import org.testng.annotations.Test;

public class Invocationscount {
	
	
	@Test(invocationCount=20)
	void Login()
	{
		System.out.println("Hello");
	}

}
