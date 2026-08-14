package com.mycompany.taller1.biblioteca.git;

public class Material {
    String ID;
    String Title;
    String YearPublication;
    String Author;
    boolean Availability;

    public Material(String ID, String Title, String YearPublication, String Author, boolean Availability) {
        this.ID = ID;
        this.Title = Title;
        this.YearPublication = YearPublication;
        this.Author = Author;
        this.Availability = Availability;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getYearPublication() {
        return YearPublication;
    }

    public void setYearPublication(String YearPublication) {
        this.YearPublication = YearPublication;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public boolean getAvailability() {
        return Availability;
    }

    public void setAvailability(boolean Availability) {
        this.Availability = Availability;
    }
    
}
