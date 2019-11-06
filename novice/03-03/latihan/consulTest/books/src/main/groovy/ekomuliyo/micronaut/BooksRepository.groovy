package ekomuliyo.micronaut

interface BooksRepository{
    List<Book> findAll()
}