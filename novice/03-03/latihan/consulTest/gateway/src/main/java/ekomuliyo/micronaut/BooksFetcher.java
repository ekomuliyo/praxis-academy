package ekomuliyo.micronaut;

import io.reactivex.Flowable;
/**
 * BooksFetcher
 */
public interface BooksFetcher {

    Flowable<Book> fetchBooks();

}