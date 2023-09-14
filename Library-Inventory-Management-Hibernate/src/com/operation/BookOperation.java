package com.operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.connection.MyConnection;
import com.entity.Book;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

public class BookOperation {

    private final SessionFactory sessionFactory = MyConnection.getMySessionFactory();

    public void insertBook(Book book) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(book);
            transaction.commit();
            System.out.println("Book details are saved successfully.");
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }



    public List<Book> searchBooksByPublicationYearRange(int startYear, int endYear) {
        try (Session session = sessionFactory.openSession()) {
            CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
            CriteriaQuery<Book> criteriaQuery = criteriaBuilder.createQuery(Book.class);
            Root<Book> root = criteriaQuery.from(Book.class);
            Predicate yearPredicate = criteriaBuilder.between(root.get("publicationYear"), startYear, endYear);
            criteriaQuery.select(root).where(yearPredicate);
            return session.createQuery(criteriaQuery).getResultList();
        } catch (Exception e) {
            System.out.println("Error searching for books by year range.");
            e.printStackTrace();
            return null;
        }
    }
    
    public List<Book> searchBooksByAuthor(String authorName) {
        try (Session session = sessionFactory.openSession()) {
            CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
            CriteriaQuery<Book> criteriaQuery = criteriaBuilder.createQuery(Book.class);
            Root<Book> root = criteriaQuery.from(Book.class);
            Predicate authorPredicate = criteriaBuilder.equal(root.get("author"), authorName);
            criteriaQuery.select(root).where(authorPredicate);
            return session.createQuery(criteriaQuery).getResultList();
        } catch (Exception e) {
            System.out.println("Error searching for books by author.");
            e.printStackTrace();
            return null;
        }
    }
    public List<Book> searchBooksByTitleOrKeywords(String searchQuery) {
        try (Session session = sessionFactory.openSession()) {
            CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
            CriteriaQuery<Book> criteriaQuery = criteriaBuilder.createQuery(Book.class);
            Root<Book> root = criteriaQuery.from(Book.class);
            Predicate titlePredicate = criteriaBuilder.like(root.get("title"), "%"+ searchQuery + "%");
            criteriaQuery.select(root).where(titlePredicate);
            return session.createQuery(criteriaQuery).getResultList();
        } catch (Exception e) {
            System.out.println("Error searching for books by title or keywords.");
            e.printStackTrace();
            return null;
        }
    }
    public Book searchBookByISBN(String isbn) {
        try (Session session = sessionFactory.openSession()) {
            CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
            CriteriaQuery<Book> criteriaQuery = criteriaBuilder.createQuery(Book.class);
            Root<Book> root = criteriaQuery.from(Book.class);
            criteriaQuery.select(root).where(criteriaBuilder.equal(root.get("isbn"), isbn));
            return session.createQuery(criteriaQuery).uniqueResult();
        } catch (Exception e) {
            System.out.println("Error searching for book by ISBN.");
            e.printStackTrace();
            return null;
        }
    }

    public List<Book> getAllBooksInInventory() {
        try (Session session = sessionFactory.openSession()) {
            CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
            CriteriaQuery<Book> criteriaQuery = criteriaBuilder.createQuery(Book.class);
            Root<Book> root = criteriaQuery.from(Book.class);
            criteriaQuery.select(root);
            return session.createQuery(criteriaQuery).getResultList();
        } catch (Exception e) {
            System.out.println("Error retrieving all books from the inventory.");
            e.printStackTrace();
            return null;
        }
    }
    
    public void updateBookDetails(Book updatedBook ,String oldIsbn) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            Book bookToUpdate =searchBookByISBN(oldIsbn);
            if (bookToUpdate != null) {
            	bookToUpdate.setAuthor(updatedBook.getAuthor());
            	bookToUpdate.setTitle(updatedBook.getTitle());
            	bookToUpdate.setPublicationYear(updatedBook.getPublicationYear());
            	bookToUpdate.setIsbn(updatedBook.getIsbn());
            	
                session.update(bookToUpdate);
                transaction.commit();
                System.out.println("Book updated successfully.");
            } else {
                System.out.println("Book not found.");
            }
        
        } catch (Exception e) {
            System.out.println("Error .");
            e.printStackTrace();
        }
    }

    public void deleteBook(String isbn) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            Book bookToDelete =searchBookByISBN(isbn);
            if (bookToDelete != null) {
                session.delete(bookToDelete);
                transaction.commit();
                System.out.println("Book deleted successfully.");
            } else {
                System.out.println("Book not found.");
            }
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }

	
}
