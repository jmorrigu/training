package pl.training.springboottwo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import pl.training.springboottwo.model.Book;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Primary
@Transactional
public class BookDAOImpl implements BookDAO {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Book> getBooks() {
        Query query = entityManager.createQuery("from Book b", Book.class);
        List<Book> resultList = query.getResultList();
        resultList.add(new Book("Test book", 1234.10));
        return resultList;
    }

}
