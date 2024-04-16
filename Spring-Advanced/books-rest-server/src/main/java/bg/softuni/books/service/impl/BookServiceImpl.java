package bg.softuni.books.service.impl;

import bg.softuni.books.model.dto.AuthorDTO;
import bg.softuni.books.model.dto.BookDTO;
import bg.softuni.books.model.entity.AuthorEntity;
import bg.softuni.books.model.entity.BookEntity;
import bg.softuni.books.repository.AuthorRepository;
import bg.softuni.books.repository.BookRepository;
import bg.softuni.books.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class BookServiceImpl implements BookService {


    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    public BookServiceImpl(BookRepository bookRepository,
                           AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    @Override
    public List<BookDTO> getAllBooks() {

        return bookRepository
                .findAll()
                .stream()
                .map(this::mapBookToDTO)
                .toList();
    }

    @Override
    public Optional<BookDTO> findBookById(Long id) {
        return bookRepository
                .findById(id)
                .map(this::mapBookToDTO);
    }

    @Override
    public void deleteBookByID(Long id) {
        this.bookRepository.deleteById(id);


    }

    @Override
    public Long createBook(BookDTO bookDTO) {

        AuthorEntity author = authorRepository
                .findAuthorEntityByName(bookDTO.getAuthor().getName())
                .orElse(null);

        if (author == null) {
            author = new AuthorEntity().setName(bookDTO.getAuthor().getName());
            this.authorRepository.save(author);
        }

        BookEntity newBook = new BookEntity();
        newBook.setTitle(bookDTO.getTitle())
                .setIsbn(bookDTO.getIsbn())
                .setAuthor(author);

        this.bookRepository.save(newBook);

        return newBook.getId();
    }


    private BookDTO mapBookToDTO(BookEntity bookEntity) {

        AuthorDTO authorDTO = new AuthorDTO()
                .setName(bookEntity.getAuthor().getName());

        return new BookDTO()
                .setId(bookEntity.getId())
                .setAuthor(authorDTO)
                .setTitle(bookEntity.getTitle())
                .setIsbn(bookEntity.getIsbn());
    }
}
