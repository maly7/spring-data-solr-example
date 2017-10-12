package com.github.maly7;

import com.github.maly7.data.AuthorRepository;
import com.github.maly7.data.BookRepository;
import com.github.maly7.document.Author;
import com.github.maly7.document.Book;
import com.google.common.collect.Lists;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.solr.core.convert.SolrJConverter;

import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public SolrJConverter solrConverter() {
        return new SolrJConverter();
    }

    @Bean
    public CommandLineRunner runner(BookRepository bookRepository, AuthorRepository authorRepository) {
        return args -> {
            bookRepository.deleteAll();

            Author firstAuthor = new Author();
            firstAuthor.setId(UUID.randomUUID().toString());
            firstAuthor.setName("John Doe");

            Author secondAuthor = new Author();
            secondAuthor.setId(UUID.randomUUID().toString());
            secondAuthor.setName("Jane Smith");

            Book book = new Book();
            book.setId(UUID.randomUUID().toString());
            book.setTitle("A tale of repositories");

            List<Author> authors = Lists.newArrayList(Lists.newArrayList(firstAuthor, secondAuthor));
            book.setAuthors(authors);

            bookRepository.save(book);
        };
    }
}
