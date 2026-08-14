package com.mycompany.taller1.biblioteca.git;
import java.util.ArrayList; 
import java.util.Scanner;

public class Main {
    static ArrayList<Customer> customers = new ArrayList<>();
    static ArrayList<Book> books = new ArrayList<>();
    static ArrayList<Loan> loans = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    
    public static void Create(Customer customer) {
        customers.add(customer);
    }
    
    public static ArrayList<Customer> List() {
        return customers;
    }
    
    public static Customer Read(String ID) {
        for(Customer customer : customers) {
            if(customer.getID().equals(ID)) {
                return customer;
            }
        }
        return null;
    }
    
    public static boolean Update(String ID, String Name, String Identification, String PhoneNumber, String Address) {
        Customer customer = Read(ID);
    
        if (customer != null) {
            customer.setAddress(Name);
            customer.setIdentification(Identification);
            customer.setPhoneNumber(PhoneNumber);
            customer.setName(Address);
            return true;
        }
        return false;
    }
    
    public static boolean Delete(String ID, String Name, String Identification, String PhoneNumber, String Address) {
        Customer customer = Read(ID);
    
        if (customer != null) {
            customers.remove(customer);
            return true;
        }
        return false;
    }
    
    public static void CreateBook(Book book) {
        books.add(book);
    }
    
    public static ArrayList<Book> ListBook() {
        return books;
    }
    
    public static Book ReadBook(String ID) {
        for(Book book: books) {
            if(book.getID().equals(ID)) {
                return book;
            }
        }
        return null;
    }
    
    public static boolean Update(String ID, String Title, String YearPublication, String Author, boolean Availability, String Editorial, int NumPages) {
        Book book = ReadBook(ID);
    
        if (book != null) {
            book.setTitle(Title);
            book.setYearPublication(YearPublication);
            book.setAuthor(Author);
            book.setAvailability(Availability);
            book.setEditorial(Editorial);
            book.setNumPages(NumPages);
            return true;
        }
        return false;
    }
    
    public static boolean Delete(String ID, String Title, String YearPublication, String Author, boolean Availability, String Editorial, int NumPages) {
        Book book = ReadBook(ID);
    
        if (book != null) {
            books.remove(book);
            return true;
        }
        return false;
    }
    
    public static void CreateLoan(Loan loan) {
        loans.add(loan);
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
