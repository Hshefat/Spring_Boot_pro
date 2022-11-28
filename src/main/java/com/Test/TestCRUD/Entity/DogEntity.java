package com.Test.TestCRUD.Entity;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
@Table(name = "dog")
public class DogEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
}
