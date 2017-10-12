package com.github.maly7.data;

import com.github.maly7.document.Book;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends SolrCrudRepository<Book, String> {
    
}
