package com.spring.data;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.spring.data.template.MockBook;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.math.BigDecimal;
import java.util.Date;

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
//        MongoDbFactory factory = context.getBean(MongoDbFactory.class);
//        DB db = factory.getDb();
//        DBCollection collection = db.getCollection("person");
//        collection.insert(new BasicDBObject().append("character","Isaac Netero"));

        // Using Mongo Template
        MongoOperations template = context.getBean(MongoTemplate.class);
        MockBook book = new MockBook("id1","A useful book", new Date(),300,new BigDecimal(8.500));
        template.insert(book);
        //Then we get rid of the javax.persistence.@Annotations (@Id, GeneratedValue ...) and we substitute them with
        // the org.springframework.data.@Annotations
    }
}
