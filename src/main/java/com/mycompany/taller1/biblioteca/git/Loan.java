package com.mycompany.taller1.biblioteca.git;

public class Loan {
    String ID;
    Customer Lender;
    Material Object;
    String Loandate;
    String ReturnDate;

    public Loan(String ID, Customer Lender, Material Object, String Loandate, String ReturnDate) {
        this.ID = ID;
        this.Lender = Lender;
        this.Object = Object;
        this.Loandate = Loandate;
        this.ReturnDate = ReturnDate;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Customer getLender() {
        return Lender;
    }

    public void setLender(Customer Lender) {
        this.Lender = Lender;
    }

    public Material getObject() {
        return Object;
    }

    public void setObject(Material Object) {
        this.Object = Object;
    }

    public String getLoandate() {
        return Loandate;
    }

    public void setLoandate(String Loandate) {
        this.Loandate = Loandate;
    }

    public String getReturnDate() {
        return ReturnDate;
    }

    public void setReturnDate(String ReturnDate) {
        this.ReturnDate = ReturnDate;
    }
    
}
