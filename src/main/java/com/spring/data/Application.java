package com.spring.data;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.MongoDbFactory;

/**
 * Created by Ghazi Naceur on 26/06/2017.
 */
public class Application {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        // Using Mongo Client
//        MongoClient client = (MongoClient) context.getBean("mongoClient");
//        DB db = client.getDB("sandbox");
//        DBCollection collection = db.getCollection("book");
//        collection.insert(new BasicDBObject().append("character","Isaac Netero"));

        // Using Mongo Facory
        MongoDbFactory factory = context.getBean(MongoDbFactory.class);
        DB db = factory.getDb();
        DBCollection collection = db.getCollection("person");
        collection.insert(new BasicDBObject().append("character","Isaac Netero"));

    }
}
