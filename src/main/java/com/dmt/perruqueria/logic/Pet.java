package com.dmt.perruqueria.logic;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Pet implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "pet_client_num")
    private int petClientNum;
    @Column(name = "pet_name")
    private String petName;
    @Column(name = "pet_race")
    private String petRace;
    @Column(name = "pet_color")
    private String petColor;
    @Column(name = "pet_allergi")
    private String petAllergi;
    @Column(name = "pet_particular_attn")
    private String petParticularAttn;

    @OneToOne
    @JoinColumn(name = "pet_owner_id")
    private Owner petOwner;

    public Pet() {
    }

    public Pet(String petName, String petRace, String petColor, String petAllergi, String petParticularAttn, Owner petOwner) {
        this.petName = petName;
        this.petRace = petRace;
        this.petColor = petColor;
        this.petAllergi = petAllergi;
        this.petParticularAttn = petParticularAttn;
        this.petOwner = petOwner;
    }

    public int getPetClientNum() {
        return petClientNum;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetRace() {
        return petRace;
    }

    public void setPetRace(String petRace) {
        this.petRace = petRace;
    }

    public String getPetColor() {
        return petColor;
    }

    public void setPetColor(String petColor) {
        this.petColor = petColor;
    }

    public String getPetAllergi() {
        return petAllergi;
    }

    public void setPetAllergi(String petAllergi) {
        this.petAllergi = petAllergi;
    }

    public String getPetParticularAttn() {
        return petParticularAttn;
    }

    public void setPetParticularAttn(String petParticularAttn) {
        this.petParticularAttn = petParticularAttn;
    }

    public Owner getPetOwner() {
        return petOwner;
    }

    public void setPetOwner(Owner petOwner) {
        this.petOwner = petOwner;
    }

}
