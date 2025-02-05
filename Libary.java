package com.belajar;
import java.util.ArrayList;
import java.util.Scanner;

public class Libary {
    class Book {
        private String title;
        private String author;
        private String isbn;
    
        public Book(String title, String author, String isbn) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
        }
    
        public String getTitle() {
            return title;
        }
    
        public String getAuthor() {
            return author;
        }
    
        public String getIsbn() {
            return isbn;
        }
    
        @Override
        public String toString() {
            return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
        }
    }
    
    class Library {
        private ArrayList<Book> books;
    
        public Library() {
            books = new ArrayList<>();
        }
    
        public void addBook(Book book) {
            books.add(book);
        }
    
        public void listBooks() {
            if (books.isEmpty()) {
                System.out.println("No books in the library.");
            } else {
                for (Book book : books) {
                    System.out.println(book);
                }
            }
        }
    
        public void searchBookByTitle(String title) {
            boolean found = false;
            for (Book book : books) {
                if (book.getTitle().equalsIgnoreCase(title)) {
                    System.out.println(book);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Book not found.");
            }
        }
    }
    
    public class LibraryManagementSystem {
        public static void main(String[] args) {
            Libary libaryInstance = new Libary();
            Library library = libaryInstance.new Library();
            Scanner scanner = new Scanner(System.in);
            int choice;
    
            do {
                System.out.println("\nLibrary Management System");
                System.out.println("1. Add Book");
                System.out.println("2. List Books");
                System.out.println("3. Search Book by Title");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                scanner.nextLine();
    
                switch (choice) {
                    case 1:
                        System.out.print("Enter book title: ");
                        String title = scanner.nextLine();
                        System.out.print("Enter book author: ");
                        String author = scanner.nextLine();
                        System.out.print("Enter book ISBN: ");
                        String isbn = scanner.nextLine();
                        Book book = libaryInstance.new Book(title, author, isbn);
                        library.addBook(book);
                        System.out.println("Book added successfully.");
                        break;
                    case 2:
                        System.out.println("Listing all books:");
                        library.listBooks();
                        break;
                    case 3:
                        System.out.print("Enter book title to search: ");
                        String searchTitle = scanner.nextLine();
                        System.out.println("Search results:");
                        library.searchBookByTitle(searchTitle);
                        break;
                    case 4:
                        System.out.println("Exiting the system.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } while (choice != 4);
    
            scanner.close();
        }
    }
}
