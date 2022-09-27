package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {
    private String description;

    public Skill () {}
}