package com.zipcode.DTVApp.models;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.UUID;

@Entity
public class RequestAmbassador {
    //RequestAmbassador Fields
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", updatable = false, nullable = false)
    private UUID id;
    @NotBlank(message = "Please enter a valid first name")
    private String name;

    //The city, state, and zip will all be in Wilmington.  We need a way to double check people are in the designated zone.

    @NotNull
    private String pickUpLocation;
    @NotBlank(message = "PLease enter a valid destination address")
    @NotNull
    private String dropOffLocation;
    @NotNull
    @NotBlank(message = "Please enter a valid phone number")
    private String phoneNumber;
    @Email
    @NotNull
    @NotBlank(message = "Please enter a valid email")
    private String email;
    private Long ambassadorId;

    public RequestAmbassador() {
    }

    public RequestAmbassador(@NotBlank(message = "Please enter a valid first name") String name, @NotNull String pickUpLocation, @NotBlank(message = "PLease enter a valid destination address") @NotNull String dropOffLocation, @NotNull @NotBlank(message = "Please enter a valid phone number") String phoneNumber, @Email @NotNull @NotBlank(message = "Please enter a valid email") String email) {
        this.name = name;
        this.pickUpLocation = pickUpLocation;
        this.dropOffLocation = dropOffLocation;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public RequestAmbassador(@NotBlank(message = "Please enter a valid first name") String name, @NotNull String pickUpLocation, @NotBlank(message = "PLease enter a valid destination address") @NotNull String dropOffLocation, @NotNull @NotBlank(message = "Please enter a valid phone number") String phoneNumber, @Email @NotNull @NotBlank(message = "Please enter a valid email") String email, Long ambassadorId) {
        this.name = name;
        this.pickUpLocation = pickUpLocation;
        this.dropOffLocation = dropOffLocation;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.ambassadorId = ambassadorId;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPickUpLocation() {
        return pickUpLocation;
    }

    public void setPickUpLocation(String pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
    }

    public String getDropOffLocation() {
        return dropOffLocation;
    }

    public void setDropOffLocation(String dropOffLocation) {
        this.dropOffLocation = dropOffLocation;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getAmbassadorId() {
        return ambassadorId;
    }

    public void setAmbassadorId(Long ambassadorId) {
        this.ambassadorId = ambassadorId;
    }
}