package com.souptik.Bookstore_Application_Zynetic.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
public class Book {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String name;
    private String author;
    private String price;
    public Book(int id, String name, String author, String price) {
        super();
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public Book() {
        super();
    }


}

