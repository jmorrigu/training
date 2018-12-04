package pl.training.springboottwo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.training.springboottwo.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping()
    public ModelAndView listBooks(){
        ModelAndView mav = new ModelAndView("book_list");
        mav.addObject("list", bookService.getBooks());
        return mav;
    }
}
