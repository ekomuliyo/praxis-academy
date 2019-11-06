package ekomuliyo.micronaut;

import javax.inject.Singleton;

import io.micronaut.context.annotation.Requires;
import io.micronaut.context.env.Environment;
import io.reactivex.Flowable;

/**
 * MockBooksClient
 */
@Singleton
@Requires(env = Environment.TEST)
public class MockBooksClient implements BooksFetcher{

    @Override
    public Flowable<Book> fetchBooks(){
        return 
            Flowable.just(
                new Book("789797979", "Building Microservice"), 
                new Book("879879879", "Release it!"), 
                new Book("879879898", "Continuos Delivery:"));
    }
    
}