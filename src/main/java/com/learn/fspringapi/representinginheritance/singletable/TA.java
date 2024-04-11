package com.learn.fspringapi.representinginheritance.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "3")
public class TA extends User{
    private int numberOfSessions;
    private double avgRating;
}
