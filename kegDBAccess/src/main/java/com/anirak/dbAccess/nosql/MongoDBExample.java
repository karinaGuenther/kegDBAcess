/**
 * 
 */
package com.anirak.dbAccess.nosql;

import org.bson.Document;

import com.anirak.dbAccess.DBConnectInfo;
import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**
 * @author Owner
 *
 */
public class MongoDBExample
{

	public void insert()
	{

		// Creating a Mongo client
		MongoClient mongoClient = new MongoClient("localhost", 27017);

		// Accessing the database
		MongoDatabase database = mongoClient.getDatabase("myDb");
		DB myDB = mongoClient.getDB("TheDatabaseName");
		MongoCollection myCollection = database.getCollection("myCollection");
		// Creating a collection

		database.createCollection("sampleCollection");
		System.out.println("Collection created successfully");

		// Retrieving a collection
		MongoCollection<Document> collection = database.getCollection("sampleCollection");
		System.out.println("Collection sampleCollection selected successfully");
		Document document = new Document("title", "MongoDB").append("description", "database")
				.append("likes", 100)
				.append("url", "http://www.tutorialspoint.com/mongodb/")
				.append("by", "tutorials point");

		// Inserting document into the collection
		collection.insertOne(document);
		System.out.println("Document inserted successfully");
	}

	public void createDB()
	{
		// Connecting to databse
		MongoClient mongoClient = new MongoClient("localhost", 27017);

		// Accessing the database
		MongoDatabase database = mongoClient.getDatabase("myDb");
		DB myDB = mongoClient.getDB("TheDatabaseName");

		// Creating a collection
		database.createCollection("sampleCollection");
		System.out.println("Collection created successfully");
	}

	public MongoDatabase ConnectToDB(DBConnectInfo connectInfo)
	{
		// Creating a Mongo client
		MongoClient mongo = new MongoClient("localhost", 27017);

		// Creating Credentials
		MongoCredential credential;
		credential = MongoCredential.createCredential("sampleUser", "myDb",
				"password".toCharArray());
		System.out.println("Connected to the database successfully");

		// Accessing the database
		MongoDatabase database = mongo.getDatabase("myDb");
		System.out.println("Credentials ::" + credential);
		return database;
	}

}
