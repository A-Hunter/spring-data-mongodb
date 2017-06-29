package com.spring.data.fulltext.search;

import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by Ghazi Naceur on 29/06/2017.
 */
public interface DummyBookRepository extends MongoRepository<DummyBook, String> {

    public List<DummyBook> findAllByOrderByScoreDesc(TextCriteria criteria);
}
