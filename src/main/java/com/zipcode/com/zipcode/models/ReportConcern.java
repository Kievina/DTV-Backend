package com.zipcode.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class ReportConcern {

    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private String message;
    @NotNull
    private String location;
    private Date date;
    //optional image upload


    public ReportConcern() {
    }

    public ReportConcern(String firstName, String lastName, String message, String location, Date date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.message = message;
        this.location = location;
        this.date = date;
    }

    public ReportConcern(Long id, String firstName, String lastName, String message, String location, Date date) {
        this.id=id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.message = message;
        this.location = location;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
