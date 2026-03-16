package Lab9;

import java.time.LocalDate;

public class Invention {

    private String description;
    private Inventor inventor;
    private LocalDate date;

    public Invention(String description, Inventor inventor, LocalDate date) {
        this.description = description;
        this.inventor = inventor;
        this.date = date;
    }

    public String toString() {
        return "Invention: " + description +
                "\nInventor: " + inventor.name() +
                "\nCountry: " + inventor.country() +
                "\nDate: " + date;
    }
}