package com.dmt.perruqueria.logic;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Owner implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_owner")
    private int id_owner;
    @Column(name = "owner_name")
    private String ownerName;
    @Column(name = "owner_contact")
    private String ownerContact;

    public Owner() {
    }

    public Owner(String ownerName, String ownerContact) {
        this.ownerName = ownerName;
        this.ownerContact = ownerContact;
    }

    public int getId_owner() {
        return id_owner;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerContact() {
        return ownerContact;
    }

    public void setOwnerContact(String ownerContact) {
        this.ownerContact = ownerContact;
    }
}
