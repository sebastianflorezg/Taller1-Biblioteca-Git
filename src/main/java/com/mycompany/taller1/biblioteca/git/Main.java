package com.mycompany.taller1.biblioteca.git;
import java.util.ArrayList; 
import java.util.Scanner;

public class Main {
    static ArrayList<Customer> customers = new ArrayList<>(); 
    static Scanner sc = new Scanner(System.in);
    
    public static void Create(Customer customer) {
        customers.add(customer);
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
