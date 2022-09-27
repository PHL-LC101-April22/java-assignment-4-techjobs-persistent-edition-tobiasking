package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotNull(message = "location must be provided!")
    @Size(min = 1, max = 75, message = "Location must be between 1 and 75 characters" )
    private String location;

    public Employer(String location){
        this.location = location;
    }
    public Employer() {}
    public String getLocation() {
        return location;
    }
}
