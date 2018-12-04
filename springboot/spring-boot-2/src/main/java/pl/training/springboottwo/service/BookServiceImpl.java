package pl.training.springboottwo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.training.springboottwo.dao.BookDAO;
import pl.training.springboottwo.model.Book;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookDAO bookDAO;

    @Override
    public List<Book> getBooks() {
        return bookDAO.getBooks();
    }

}
