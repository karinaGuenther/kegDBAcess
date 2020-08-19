package com.anirak.dbAccess;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DbAccessTestng
{
	@Test(dataProvider = "dp")
	public void testConnection(Integer n, String s)
	{

	}

	@BeforeMethod
	public void beforeMethod()
	{
	}

	@Test
	public void testConnection()
	{
		MongoDBExample dbtest = new MongoDBExample();
		DBConnectInfo dbInfo = new DBConnectInfo();

		connected = dbtest.ConnectToDB();

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
