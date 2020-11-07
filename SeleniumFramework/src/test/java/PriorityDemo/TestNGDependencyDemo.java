package PriorityDemo;

import org.testng.annotations.Test;

public class TestNGDependencyDemo {
	
	@Test(dependsOnGroups = "sanity.*")
	public void test1()
	{
		System.out.println("I am in test1");
	}
	
	
	@Test(groups = "sanity1" )
	public void test2()
	{
		System.out.println("I am in test2");
	}
	@Test(groups = "sanity2")
	public void test3()
	{
		System.out.println("I am in test3");
	}
}
