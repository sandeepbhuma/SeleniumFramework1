package PriorityDemo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//@Ignore This is class level
public class TestNGIgnoreDemo {
	
//@Ignore this is method level
	@Ignore
@Test

	public void test1()
	{
		System.out.println("I am in test1");
	}

@Test

	public void test2()
	{
		System.out.println("I am in test2");
	}
}
