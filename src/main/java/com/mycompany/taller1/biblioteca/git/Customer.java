package com.mycompany.taller1.biblioteca.git;

public class Customer extends Person{
    String ID;
    String Address;

    public Customer(String ID, String Address, String Name, String Identification, String PhoneNumber) {
        super (Name, Identification, PhoneNumber);
        this.ID = ID;
        this.Address = Address;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    
}