/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.cphbusiness.ml.facade;

import dk.cphbusiness.ml.entity.Book;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Magnus
 */
public class BookFacade {

    static HashMap<String, Book> books = new HashMap() {
        {
            put("12345678", new Book("Gone with the Wind", "Segumbing Mangaze", "Gyldendal", "12345678"));
        }
    };

    public static Book getBook(String isbn) {
        return books.get(isbn);
    }

    public static void createBook(Book book) {
        books.putIfAbsent(book.getIsbn(), book);
    }

    public static void deleteBook(String isbn) {
        books.remove(isbn);
    }

    public static Book editBook(Book book) {
       return  books.put(book.getIsbn(), book);
    }

    public static Collection <Book> getAllBooks() {
        return books.values();
    }
}
