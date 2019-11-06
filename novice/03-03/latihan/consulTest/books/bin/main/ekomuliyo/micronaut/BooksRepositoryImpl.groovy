package ekomuliyo.micronaut

import groovy.transform.CompileStatic
import javax.inject.Singleton

@CompileStatic
@Singleton
class BooksRepositoryImpl implements BooksRepository{

    @Override

    List<Book> findAll(){
        [
            new Book("9789798798", "Building Microservice"),
            new Book("8739857987", "Realease it!"),
        ]
    }
}