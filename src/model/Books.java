package model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Books {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "isbn")
    int id;

    @Column
    LocalDate dob;

    @Column
    int edition;

    @Column
    String title;

    @Column
    int author;
}
