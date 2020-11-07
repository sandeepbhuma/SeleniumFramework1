package PriorityDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGRetryFailuresDemo {

	@Test
	public void test1()
	{
		System.out.println("I am in test1");
	}
	
	@Test
	public void test2()
	{
		//int i =1/0;
		System.out.println("I am in test2");
		
	}
	
	@Test(retryAnalyzer = listners.RetryAnalyze.class)
	public void test3()
	{
		System.out.println("I am in test3");
		Assert.assertTrue(0>1);
	}
}
