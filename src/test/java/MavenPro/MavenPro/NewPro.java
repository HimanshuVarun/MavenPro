package MavenPro.MavenPro;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewPro 
{
	@BeforeTest
	public void before()
	{
		System.out.println("hello in beforeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
	}
   
	@Test
	public void test1()
	{
		System.out.println("Hello in tessssssssssssssssssssssssssssssssssssssssssssst");
	}
}
