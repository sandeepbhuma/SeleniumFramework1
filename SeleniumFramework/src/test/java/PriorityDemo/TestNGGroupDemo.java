package PriorityDemo;

import org.testng.annotations.Test;

@Test(groups = {"AllClassTest"})
public class TestNGGroupDemo {
	
	@Test(groups = {"sanity"})
	
	public void test1()
	{
		System.out.println("I am in test1");
	}
	
	@Test(groups = {"windows.regression"})
	
	public void test2()
	{
		System.out.println("I am in test2");
	}
	
	@Test (groups = {"linux.regression"})
	public void test3()
	{
		System.out.println("I am in test3");
	}
	
	@Test
	public void test4()
	{
		System.out.println("I am in test4");
	}

}
