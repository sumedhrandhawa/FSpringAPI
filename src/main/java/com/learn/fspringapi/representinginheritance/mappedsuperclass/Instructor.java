package com.learn.fspringapi.representinginheritance.mappedsuperclass;

import jakarta.persistence.Entity;

@Entity(name = "msc_instructor")
public class Instructor extends User {
    private String specialization;
}
