package com.mycompany.taller1.biblioteca.git;

public class Person {
    String Name;
    String Identification;
    String PhoneNumber;

    public Person(String Name, String Identification, String PhoneNumber) {
        this.Name = Name;
        this.Identification = Identification;
        this.PhoneNumber = PhoneNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getIdentification() {
        return Identification;
    }

    public void setIdentification(String Identification) {
        this.Identification = Identification;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }
    
}
