package model;

import jakarta.persistence.*;

import java.time.LocalDate;

enum Gender {
    male, female
}

@Entity
@Table
public class Authors {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "aid")
    int id;

    @Column
    String name;

    @Column
    LocalDate dob;

    @Column
    Gender gender;




}
