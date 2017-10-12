package com.github.maly7.data;

import com.github.maly7.document.Author;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends SolrCrudRepository<Author, String> {
}
