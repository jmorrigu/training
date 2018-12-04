package pl.training.springboottwo.model;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Book")
public class Book {

    public Book(@NotNull @NotEmpty(message = "Title cannot be empty") @Size(min = 5, message = "Title should have at least 5 characters") String title, @NotNull @Digits(integer = 4, fraction = 2, message = "Wrong price format") double price) {
        this.title = title;
        this.price = price;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;

    @Column(name = "TITLE")
    @NotNull
    @NotEmpty(message = "Title cannot be empty")
    @Size(min = 5, message = "Title should have at least 5 characters")
    private String title;

    @Column(name = "PRICE")
    @NotNull
    @Digits(integer = 4, fraction = 2, message = "Wrong price format")
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
