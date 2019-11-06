package ekomuliyo.micronaut;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import io.micronaut.context.ApplicationContext;
import io.micronaut.core.type.Argument;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.runtime.server.EmbeddedServer;

/**
 * BooksControllerTest
 */
public class BooksControllerTest {

    private static EmbeddedServer server;
    private static HttpClient client;

    @BeforeAll
    public static void setupServer(){
        server = ApplicationContext.run(EmbeddedServer.class);
        client = server.getApplicationContext().createBean(HttpClient.class, server.getURL());
    }

    @AfterAll
    public static void stopServer(){
        if (server != null) {
            server.stop();
        }
        if(client != null){
            client.stop();
        }
    }

    @Test void retrieveBooks(){
        HttpRequest request = HttpRequest.GET("api/books");
        List<Book> books = client.toBlocking().retrieve(request, Argument.of(List.class, Book.class));
        assertNotNull(books);
        assertEquals(1, books.size());
    }
}