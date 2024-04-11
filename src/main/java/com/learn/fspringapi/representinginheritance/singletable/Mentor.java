package com.learn.fspringapi.representinginheritance.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@DiscriminatorValue(value = "2")
@Entity
public class Mentor extends User{
    private double mentorRating;
}
