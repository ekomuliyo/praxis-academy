package ekomuliyo.micronaut;

import io.micronaut.context.annotation.Requires;
import io.micronaut.context.env.Environment;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Flowable;

/**
 * BookClient
 */
@Client("books")
@Requires(notEnv = Environment.TEST)
public interface BookClient extends BooksFetcher{

    @Override @Get("/api/books") Flowable<Book> fetchBooks();

}