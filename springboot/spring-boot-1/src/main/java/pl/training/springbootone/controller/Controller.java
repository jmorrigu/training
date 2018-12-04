package pl.training.springbootone.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.training.springbootone.model.Book;

@RestController
public class Controller {

    @RequestMapping("/")
    public String index(){
        return "Spring Boot Training";
    }


    /*
    /add  example requests:
           http://localhost:8080/add?title=Long%20Earth&author=Terry%20Pratchet
           http://localhost:8080/add?title=Long%20Earth&author=Terry%20Pratchet&year=2010
     */
    @RequestMapping("/add")
    public String addBook(@RequestParam("title") String bookTitle,
                          @RequestParam("author") String bookAuthor,
                          @RequestParam(value = "year", required = false) Integer bookYear){
        Book addedBook =  new Book(bookTitle, bookAuthor, bookYear);
        return "Book successfully added. (" + addedBook.toString() + ")";
    }

    @RequestMapping("/remove")
    public String removeBook(){
        return "Book successfully removed.";
    }
}
