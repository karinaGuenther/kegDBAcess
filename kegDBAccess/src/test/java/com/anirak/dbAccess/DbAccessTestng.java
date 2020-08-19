package com.anirak.dbAccess;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.anirak.dbAccess.nosql.MongoDBExample;
import com.mongodb.client.MongoDatabase;

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
		// TODO fix Object returned
		MongoDBExample dbtest = new MongoDBExample();
		DBConnectInfo dbInfo = new DBConnectInfo();

		MongoDatabase mongodb = dbtest.ConnectToDB(dbInfo);
		assertTrue(mongodb != null, "mongodb is connected");

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
