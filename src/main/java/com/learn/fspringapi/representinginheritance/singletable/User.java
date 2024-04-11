package com.learn.fspringapi.representinginheritance.singletable;

import jakarta.persistence.*;

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "user_type", discriminatorType = DiscriminatorType.INTEGER)
@DiscriminatorValue(value = "0")
@Entity(name = "st_user")
public class User {
    @Id
    private Long id;
    private String name;
    private String email;
    private String password;
}
