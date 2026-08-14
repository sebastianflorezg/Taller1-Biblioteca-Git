package com.mycompany.taller1.biblioteca.git;

public class Book extends Material{
    String Editorial;
    int NumPages;

    public Book(String ID, String Title, String YearPublication, String Author, boolean Availability, String Editorial, int NumPages) {
        super(ID, Title, YearPublication, Author, Availability);
        this.Editorial = Editorial;
        this.NumPages = NumPages;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public int getNumPages() {
        return NumPages;
    }

    public void setNumPages(int NumPages) {
        this.NumPages = NumPages;
    }
    
}