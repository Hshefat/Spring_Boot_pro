package com.Test.TestCRUD.Services;

import com.Test.TestCRUD.Entity.DogEntity;

import java.util.List;
import java.util.Optional;

public interface DogServices {
    List<DogEntity> findAllDogs();
    Optional<DogEntity> findById(Long id);
    DogEntity saveDog(DogEntity dogEntity);
    DogEntity updateDog(DogEntity dogEntity);
    void deleteDog(Long id);
}
