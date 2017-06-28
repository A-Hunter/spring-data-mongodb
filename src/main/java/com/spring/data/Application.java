package com.spring.data;

import com.spring.data.configuration.Config;
import com.spring.data.deserializer.LocationRepository;
import com.spring.data.deserializer.PlaceCoordination;
import com.spring.data.repository.BookRepository;
import com.spring.data.template.Author;
import com.spring.data.template.MockBook;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;
import static org.springframework.data.mongodb.core.query.Update.update;

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
//        MongoOperations template = context.getBean(MongoTemplate.class);
//        template.save(book);
//        BasicQuery query = new BasicQuery("{title:'A useful book 2'}");
//        MockBook book1 = template.find(query,MockBook.class).get(0);
//        book1.setTitle("the new title");
//        template.save(book1);
//        System.out.println(book1.toString());

        // Updating documents
//        MongoOperations template = context.getBean(MongoTemplate.class);
//        Query query = query(where("title").is("the new title"));
//        Update update = update("title","new value"); //new Update().set("title","new value");
//        template.updateFirst(query,update,MockBook.class);

//        //Query query1 = new Query(); // return all
//        template.save(new MockBook("id4", "the new title", new Date(), 300, new BigDecimal(8.500), new Author(), new ArrayList<>()));
//        template.save(new MockBook("id5", "the new title", new Date(), 300, new BigDecimal(8.500), new Author(), new ArrayList<>()));
//        template.save(new MockBook("id6", "the new title", new Date(), 300, new BigDecimal(8.500), new Author(), new ArrayList<>()));
//        template.updateMulti(query,update,MockBook.class);

        // Upserting documents
//        MongoOperations template = context.getBean(MongoTemplate.class);
//        Query query = new Query(where("title").is("a title !")
//                .and("author.firstName").is("Someone")
//                .and("author.lastName").is("human"));
//        Update update = update("pageCount",1000);
//        template.upsert(query,update,MockBook.class);

        // Removing documents
//        MongoOperations template = context.getBean(MongoTemplate.class);
//        Query query = new Query(where("title").is("a title !")
//                .and("author.firstName").is("Someone")
//                .and("author.lastName").is("human"));
//        template.remove(query, MockBook.class);

        // Retrieving documents
//        MongoOperations template = context.getBean(MongoTemplate.class);
//        MockBook book = new MockBook("id7", "A book", new Date(), 300,
//                new BigDecimal(8.500), new Author("per1","unknown","known",45,
//                "The 3rd street in the middle of nowhere city"), new ArrayList<>());
//        template.save(book);
//        MockBook b = template.findById(book.getBookId(), MockBook.class);
//        MockBook b = template.findOne(new Query(where("bookId").is(book.getBookId()).and("author.lastName").is("known")), MockBook.class);
//        System.out.println(b.toString());

        // Criteria and Query objects
//        MongoOperations template = context.getBean(MongoTemplate.class);
//        Criteria criteria = Criteria.where("title").is("A book 9");
//        Criteria criteria = Criteria.where("title").regex(Pattern.compile(".*book.*"));
//        Query query = new Query(criteria).addCriteria(where("pageCount").gt(800));
//        List<MockBook> books = template.find(query, MockBook.class);
//        books.forEach(book -> System.out.println(book.toString()));

        // Java Configuration
//        ApplicationContext contextWithJavaConfig = new AnnotationConfigApplicationContext(Config.class);
//        MongoOperations template = contextWithJavaConfig.getBean(MongoTemplate.class);
//        Criteria criteria = Criteria.where("title").is("A book 9");
//        Criteria criteria = Criteria.where("title").regex(Pattern.compile(".*book.*"));
//        Query query = new Query(criteria).addCriteria(where("pageCount").gt(800));
//        List<MockBook> books = template.find(query, MockBook.class);
//        books.forEach(book -> System.out.println(book.toString()));

        // Mongo Repositories
//        LocationRepository rep = context.getBean(LocationRepository.class);
//        PlaceCoordination coor = new PlaceCoordination("id1",new Point(20.5,30.7));
//        rep.save(coor);

        // Mongo Repository Basics
        BookRepository repo = context.getBean(BookRepository.class);
        MockBook book = repo.findByTitle("A book 12");
        System.out.println(book.toString());
    }
}
