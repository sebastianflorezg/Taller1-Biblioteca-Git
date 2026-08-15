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
    
    public static boolean Delete(String ID) {
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
    
    public static boolean UpdateBook(String ID, String Title, String YearPublication, String Author, boolean Availability, String Editorial, int NumPages) {
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
    
    public static boolean DeleteBook(String ID) {
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
    
    public static void Return(String ID) {
        for(Loan loan : loans) {
            if(loan.getID().equals(ID)) {
                loan.getObject().setAvailability(true);
                loans.remove(loan);
                System.out.println("Prestamo devulto correctamente.");
                return;
            }
        }
        System.out.println("No se encontro el prestamo...");
    }
    
    public static ArrayList<Loan> ListLoan() {
        return loans;
    }

    public static void main(String[] args) {
        
        int option;
        
        do{
            
            System.out.println("\n_______ SISTEMA DE BIBLIOTECA _______");
            System.out.println("\n------------- CLIENTES --------------");
            System.out.println("1.  Crear cliente");
            System.out.println("2.  Listar clientes");
            System.out.println("3.  Buscar cliente");
            System.out.println("4.  Actualizar cliente");
            System.out.println("5.  Eliminar cliente");

            System.out.println("\n-------------- LIBROS ---------------");
            System.out.println("6.  Crear libro");
            System.out.println("7.  Listar libros");
            System.out.println("8.  Buscar libro");
            System.out.println("9.  Actualizar libro");
            System.out.println("10. Eliminar libro");

            System.out.println("\n------------- PRESTAMOS -------------");
            System.out.println("11. Registrar prestamo");
            System.out.println("12. Devolver prestamo");
            System.out.println("13. Listar prestamos");

            System.out.println("0. Salir");

            System.out.print("\n Seleccione una opcion:: ");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {

                case 1:
                    System.out.println("\n--- Crear cliente ---");

                    System.out.print("ID:: ");
                    String id = sc.nextLine();

                    System.out.print("Nombre:: ");
                    String name = sc.nextLine();

                    System.out.print("Identificacion:: ");
                    String identification = sc.nextLine();

                    System.out.print("Telefono:: ");
                    String phoneNumber = sc.nextLine();

                    System.out.print("Direccion:: ");
                    String address = sc.nextLine();

                    Customer customer = new Customer(id, name, identification, phoneNumber, address);

                    Create(customer);
                    System.out.println("Cliente creado correctamente.");
                    break;

                case 2:
                    System.out.println("\n--- Lista de clientes ---");
    
                    if (List().isEmpty()) {
                        System.out.println("No hay clientes registrados...");
                    } else {
                        for (Customer c : List()) {
                            System.out.println("ID:: " + c.getID() + " | Nombre:: " + c.getName() + " | Identificacion:: " + c.getIdentification() + " | Telefono:: " + c.getPhoneNumber() + " | Direccion:: " + c.getAddress());
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n--- Buscar cliente ---");

                    System.out.print("Ingrese el ID del cliente:: ");
                    String searchId = sc.nextLine();

                    Customer foundCustomer = Read(searchId);

                    if (foundCustomer != null) {
                        System.out.println("Cliente encontrado:: ");
                        System.out.println("ID:: " + foundCustomer.getID());
                        System.out.println("Nombre:: " + foundCustomer.getName());
                        System.out.println("Telefono:: " + foundCustomer.getPhoneNumber());
                        System.out.println("Identificacion:: " + foundCustomer.getIdentification());
                        System.out.println("Direccion:: " + foundCustomer.getAddress());
                    } else {
                        System.out.println("Cliente no encontrado...");
                    }
                    break;

                case 4:
                    System.out.println("\n--- ACTUALIZAR CLIENTE ---");

                    System.out.print("Ingrese el ID del cliente:: ");
                    String updateId = sc.nextLine();

                    Customer customerToUpdate = Read(updateId);

                    if (customerToUpdate != null) {

                        System.out.print("Nuevo nombre:: ");
                        String newName = sc.nextLine();

                        System.out.print("Nueva identificacion:: ");
                        String newIdentification = sc.nextLine();
    
                        System.out.print("Nuevo telefono:: ");
                        String newPhone = sc.nextLine();

                        System.out.print("Nueva direccion:: ");
                        String newAddress = sc.nextLine();

                        Update(updateId, newName, newIdentification, newPhone, newAddress);

                        System.out.println("Cliente actualizado correctamente.");

                    } else {
                        System.out.println("Cliente no encontrado...");
                    }
                    break;

                case 5:
                    System.out.println("\n--- Eliminar cliente ---");

                    System.out.print("Ingrese el ID del cliente:: ");
                    String deleteId = sc.nextLine();

                    if (Delete(deleteId)) {
                        System.out.println("Cliente eliminado correctamente.");
                    } else {
                        System.out.println("Cliente no encontrado...");
                    }
                    break;


                case 6:
                    System.out.println("\n--- Crear libro ---");

                    System.out.print("ID:: ");
                    String bookId = sc.nextLine();

                    System.out.print("Titulo:: ");
                    String title = sc.nextLine();

                    System.out.print("Año de publicacion:: ");
                    String yearPublication = sc.nextLine();

                    System.out.print("Autor:: ");
                    String author = sc.nextLine();

                    System.out.print("Disponible (true/false):: ");
                    boolean availability = sc.nextBoolean();
                    sc.nextLine();

                    System.out.print("Editorial:: ");
                    String editorial = sc.nextLine();

                    System.out.print("Numero de paginas:: ");
                    int numPages = sc.nextInt();
                    sc.nextLine();

                    Book book = new Book(bookId, title, yearPublication, author, availability, editorial, numPages);

                    CreateBook(book);
                    System.out.println("Libro creado correctamente.");
                    break;

                case 7:
                    System.out.println("\n--- Lista de libros---");

                    if (ListBook().isEmpty()) {
                        System.out.println("No hay libros registrados...");
                    } else {
                        for (Book b : ListBook()) {
                            System.out.println("ID:: " + b.getID() + " | Titulo:: " + b.getTitle() + " | Autor:: " + b.getAuthor() + " | Disponible:: " + b.getAvailability());
                        }
                    }
                    break;

                case 8:
                    System.out.println("\n--- Buscar libros ---");

                    System.out.print("Ingrese el ID del libro:: ");
                    String searchBookId = sc.nextLine();

                    Book foundBook = ReadBook(searchBookId);

                    if (foundBook != null) {
                        System.out.println("Libro encontrado:: ");
                        System.out.println("ID:: " + foundBook.getID());
                        System.out.println("Titulo:: " + foundBook.getTitle());
                        System.out.println("Año:: " + foundBook.getYearPublication());
                        System.out.println("Autor:: " + foundBook.getAuthor());
                        System.out.println("Disponible:: " + foundBook.getAvailability());
                        System.out.println("Editorial:: " + foundBook.getEditorial());
                        System.out.println("Paginas:: " + foundBook.getNumPages());
                    } else {
                        System.out.println("Libro no encontrado...");
                    }
                    break;

                case 9:
                    System.out.println("\n--- Actualizar libro ---");

                    System.out.print("Ingrese el ID del libro:: ");
                    String updateBookId = sc.nextLine();

                    Book bookToUpdate = ReadBook(updateBookId);

                    if (bookToUpdate != null) {

                        System.out.print("Nuevo titulo:: ");
                        String newTitle = sc.nextLine();

                        System.out.print("Nuevo año de publicacion:: ");
                        String newYear = sc.nextLine();

                        System.out.print("Nuevo autor:: ");
                        String newAuthor = sc.nextLine();

                        System.out.print("Disponible (true/false):: ");
                        boolean newAvailability = sc.nextBoolean();
                        sc.nextLine();

                        System.out.print("Nueva editorial:: ");
                        String newEditorial = sc.nextLine();

                        System.out.print("Nuevo numero de paginas:: ");
                        int newNumPages = sc.nextInt();
                        sc.nextLine();

                        UpdateBook(updateBookId, newTitle, newYear, newAuthor, newAvailability, newEditorial, newNumPages);

                        System.out.println("Libro actualizado correctamente.");

                    } else {
                        System.out.println("Libro no encontrado...");
                    }
                    break;

                case 10:
                    System.out.println("\n--- Elininar libro ---");

                    System.out.print("Ingrese el ID del libro:: ");
                    String deleteBookId = sc.nextLine();

                    if (DeleteBook(deleteBookId)) {
                        System.out.println("Libro eliminado correctamente.");
                    } else {
                        System.out.println("Libro no encontrado...");
                    }
                    break;

                case 11:
                    System.out.println("\n--- Registrar prestamo ---");

                    System.out.print("ID del prestamo:: ");
                    String loanId = sc.nextLine();

                    System.out.print("ID del cliente:: ");
                    String customerId = sc.nextLine();

                    Customer lender = Read(customerId);

                    if (lender == null) {
                        System.out.println("Cliente no encontrado...");
                        break;
                    }

                    System.out.print("ID del libro:: ");
                    String loanBookId = sc.nextLine();

                    Book loanBook = ReadBook(loanBookId);

                    if (loanBook == null) {
                        System.out.println("Libro no encontrado.");
                        break;
                    }

                    if (!loanBook.getAvailability()) {
                        System.out.println("El libro no esta disponible...");
                        break;
                    }

                    System.out.print("Fecha del prestamo:: ");
                    String loanDate = sc.nextLine();

                    System.out.print("Fecha de devolucion:: ");
                    String returnDate = sc.nextLine();

                    Loan loan = new Loan(loanId, lender, loanBook, loanDate, returnDate);

                    CreateLoan(loan);
    
                    loanBook.setAvailability(false);

                    System.out.println("Prestamo registrado correctamente. ");
                    break;

                case 12:
                    System.out.println("\n--- Devolver prestamo ---");
    
                    System.out.print("Ingrese el ID del prestamo:: ");
                    String returnLoanId = sc.nextLine();

                    Return(returnLoanId);
                    break;

                case 13:
                    System.out.println("\n--- Lista de prestamos ---");

                    if (ListLoan().isEmpty()) {
                        System.out.println("No hay prestamos registrados...");
                    } else {
                        for (Loan l : ListLoan()) {
                            System.out.println("ID:: " + l.getID());
                            System.out.println("Cliente:: " + l.getLender().getName());
                            System.out.println("Fecha prestamo:: " + l.getLoandate());
                            System.out.println("Fecha devolucion:: " + l.getReturnDate());
                        }
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("ERROR... Opcion no valida.");
            }

        } while (option != 0);

        sc.close();        
    }
}
