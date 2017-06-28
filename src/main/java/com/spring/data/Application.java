package com.spring.data;

import com.spring.data.template.Author;
import com.spring.data.template.MockBook;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.BasicQuery;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

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
//        MongoOperations template = context.getBean(MongoTemplate.class);
//        MockBook book = new MockBook("id1","A useful book", new Date(),300,new BigDecimal(8.500));
//        template.insert(book);
//        //Then we get rid of the javax.persistence.@Annotations (@Id, GeneratedValue ...) and we substitute them with
//        // the org.springframework.data.@Annotations

        // Inserting documents
//        List<MockBook> books = new ArrayList<>();
//        books.add(new MockBook("id1", "A useful book", new Date(), 300, new BigDecimal(8.500), new Author(), new ArrayList<>()));
//        books.add(new MockBook("id2", "A useful book", new Date(), 300, new BigDecimal(8.500), new Author(), new ArrayList<>()));
//        books.add(new MockBook("id3", "A useful book", new Date(), 300, new BigDecimal(8.500), new Author(), new ArrayList<>()));
//        books.add(new MockBook("id4", "A useful book", new Date(), 300, new BigDecimal(8.500), new Author(), new ArrayList<>()));
//        books.add(new MockBook("id5", "A useful book", new Date(), 300, new BigDecimal(8.500), new Author(), new ArrayList<>()));
//        MongoOperations template = context.getBean(MongoTemplate.class);
//        template.insert(books, MockBook.class);

        // Saving documents - upsert behavior - inserting an entity not a collection
//        MockBook book = new MockBook("id1", "A useful book 2", new Date(), 300, new BigDecimal(8.500), new Author(), new ArrayList<>());
        MongoOperations template = context.getBean(MongoTemplate.class);
//        template.save(book);
        BasicQuery query = new BasicQuery("{title:'A useful book 2'}");
        MockBook book1 = template.find(query,MockBook.class).get(0);
        book1.setTitle("the new title");
        template.save(book1);
        System.out.println(book1.toString());
    }
}
