package com.learn.fspringapi.representinginheritance.joinedtable;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@PrimaryKeyJoinColumn(name = "user_id")
@Entity(name="jt_ta")
public class TA extends User {
    private int numberOfSessions;
    private double avgRating;
}
