package ekomuliyo.micronaut


import io.micronaut.context.ApplicationContext
import io.micronaut.core.type.Argument
import io.micronaut.http.HttpRequest
import io.micronaut.http.client.RxHttpClient
import io.micronaut.runtime.server.EmbeddedServer
// import spock.lang.AutoCleanup
// import spock.lang.Shared
import spock.lang.Specification

class BooksControllerSpec {

    // @Shared
    // @AutoCleanup
    // EmbeddedServer embeddedServer = ApplicationContext.run(EmbeddedServer)

    // @Shared @AutoCleanup RxHttpClient client = embeddedServer
    //     .ApplicationContext.createBean(RxHttpClient, embeddedServer.getURL())

    // void "test books retrieve"(){
    //     when:
    //     HttpRequest request = HttpRequest.GET("/api/books")
    //     List<Book> books = client.toBlocking().retrieve(request, Argument.of(List, Book))

    //     then:
    //     books books.size() == 2
    // }
}