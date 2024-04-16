package bg.softuni.books.web;

import bg.softuni.books.model.dto.BookDTO;
import bg.softuni.books.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/books")
public class BooksRestController {


    private final BookService bookService;

    public BooksRestController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public ResponseEntity<List<BookDTO>> getAllBooks() {
        return ResponseEntity.ok(bookService.getAllBooks());
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookDTO> findBookById(@PathVariable("id") Long id) {
        Optional<BookDTO> bookDTOOptional = bookService.findBookById(id);

        // Second method
//        if (bookDTOOptional.isEmpty()) {
//            return ResponseEntity.notFound().build();
//        }else {
//            return ResponseEntity.ok(bookDTOOptional.get());
//        }

        return bookDTOOptional
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<BookDTO> deleteBookById(@PathVariable("id") Long id) {

        bookService.deleteBookByID(id);

        return ResponseEntity
                .noContent()
                .build();
    }

    @PostMapping()
    public ResponseEntity<BookDTO> crateBook(
            @RequestBody BookDTO bookDTO,
            UriComponentsBuilder uriComponentsBuilder) {

        long newBookID = bookService.createBook(bookDTO);

        return ResponseEntity.created(
                uriComponentsBuilder.path("/api/books/{id}").build(newBookID)
        ).build();
    }


}
