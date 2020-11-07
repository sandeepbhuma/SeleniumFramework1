package PriorityDemo;

import org.testng.annotations.Test;

public class TestNGPriorityDemo {
	
	@Test
	public void TestA()
	{
		System.out.println("I am in test1");
	}
	@Test(priority = 1)
	public void TestD()
	{
		System.out.println("I am in test2");
	}
	@Test(priority = 1)
	public void TestC()
	{
		System.out.println("I am in test3");
	}

}
