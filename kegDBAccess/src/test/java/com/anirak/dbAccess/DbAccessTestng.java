package com.anirak.dbAccess;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DbAccessTestng
{

	@BeforeMethod
	public void beforeMethod()
	{
		// TODO write before method
	}

	@Test
	public void testConnection()
	{

	}

	@AfterMethod
	public void afterMethod()
	{
	}

	@DataProvider
	public Object[][] dp()
	{
		return new Object[][]
			{ new Object[]
						{ 1, "a" }, new Object[]
						{ 2, "b" }, };
	}
}
