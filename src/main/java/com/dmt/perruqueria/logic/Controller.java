package com.dmt.perruqueria.logic;

import com.dmt.perruqueria.persistence.PersistenceController;
import java.util.List;

public class Controller {

    PersistenceController persistenceController = new PersistenceController();

    public void save(String petName, String petRace, String petColor, String petAllergi, String petParticularAttn, String ownerName, String ownerContact) {
        Owner owner = new Owner(ownerName, ownerContact);
        Pet pet = new Pet(petName, petRace, petColor, petAllergi, petParticularAttn, owner);

        persistenceController.save(owner, pet);
    }

    public List<Pet> findAllPets() {
        return persistenceController.getAllPets();
    }

    public void deletePet(int petClientNum) {
        persistenceController.deletePet(petClientNum);
    }

    public Pet findPet(int petClienteNum) {
        return persistenceController.getPet(petClienteNum);
    }

    public void updatePet(Pet pet, String petName, String petRace, String petColor, String petAllergi, String petParticularAttn, String ownerName, String ownerContact) {
        pet.setPetName(petName);
        pet.setPetRace(petRace);
        pet.setPetColor(petColor);
        pet.setPetAllergi(petAllergi);
        pet.setPetParticularAttn(petParticularAttn);

        persistenceController.updatePet(pet);

        Owner owner = this.findOwner(pet.getPetOwner().getId_owner());
        owner.setOwnerName(ownerName);
        owner.setOwnerContact(ownerContact);

        this.updateOwner(owner);
    }

    private Owner findOwner(int id_owner) {
        return persistenceController.findOwner(id_owner);
    }

    private void updateOwner(Owner owner) {
        persistenceController.updateOwner(owner);
    }
}
