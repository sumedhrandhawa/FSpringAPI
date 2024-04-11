package com.learn.fspringapi.representinginheritance.mappedsuperclass;

import jakarta.persistence.Entity;

@Entity(name="msc_ta")
public class TA extends User {
    private int numberOfSessions;
    private double avgRating;
}
