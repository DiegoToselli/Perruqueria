package com.dmt.perruqueria.persistence;

import com.dmt.perruqueria.logic.Owner;
import com.dmt.perruqueria.logic.Pet;
import com.dmt.perruqueria.persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersistenceController {

    OwnerJpaController ownerJpaController = new OwnerJpaController();
    PetJpaController petJpaController = new PetJpaController();

    public void save(Owner owner, Pet pet) {
        ownerJpaController.create(owner);
        petJpaController.create(pet);
    }

    public List<Pet> getAllPets() {
        return petJpaController.findPetEntities();
    }

    public void deletePet(int petClientNum) {
        try {
            petJpaController.destroy(petClientNum);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Pet getPet(int petClienteNum) {
        return petJpaController.findPet(petClienteNum);
    }

    public void updatePet(Pet pet) {
        try {
            petJpaController.edit(pet);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Owner findOwner(int id_owner) {
        return ownerJpaController.findOwner(id_owner);
    }

    public void updateOwner(Owner owner) {
        try {
            ownerJpaController.edit(owner);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
