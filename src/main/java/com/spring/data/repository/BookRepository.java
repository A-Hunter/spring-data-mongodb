package com.spring.data.repository;

import com.spring.data.template.MockBook;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Ghazi Naceur on 28/06/2017.
 */
public interface BookRepository extends MongoRepository<MockBook, String> {

}
