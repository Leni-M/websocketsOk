package com.dh.demo.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by jhonny on 6/17/17.
 */
@Entity
@Table(name = "groups")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne
    private User owner;
    private String logo;
    private String name;
    private Date creation_date;

    public void setId(long id) {
        this.id = id;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }

    public long getId() {
        return id;
    }

    public User getOwner() {
        return owner;
    }

    public String getLogo() {
        return logo;
    }

    public String getName() {
        return name;
    }

    public Date getCreation_date() {
        return creation_date;
    }
}
