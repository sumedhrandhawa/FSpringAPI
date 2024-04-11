package com.learn.fspringapi.representinginheritance.tableperclass;

import jakarta.persistence.Id;

public class User {
    @Id
    private Long id;
    private String name;
    private String email;
    private String password;
}
