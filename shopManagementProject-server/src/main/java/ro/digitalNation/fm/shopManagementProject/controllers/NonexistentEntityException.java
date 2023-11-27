package ro.digitalNation.fm.shopManagementProject.controllers;

import jakarta.persistence.EntityNotFoundException;

class NonexistentEntityException {

    NonexistentEntityException(String string, EntityNotFoundException enfe) {
        
    }

    NonexistentEntityException(String string) {
        
    }
    
}
