package com.Test.TestCRUD.Services.Implements;

import com.Test.TestCRUD.Dto.DogDto;
import com.Test.TestCRUD.Entity.DogEntity;
import com.Test.TestCRUD.Repository.DogRepository;
import com.Test.TestCRUD.Services.DogServices;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DogServicesImp implements DogServices {

    private final DogRepository dogRepository;

    public DogServicesImp(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    @Override
    public List<DogEntity> findAllDogs() {
        return dogRepository.findAll();
    }

    @Override
    public Optional<DogEntity> findById(Long id) {
        return dogRepository.findById(id);
    }

    @Override
    public DogEntity saveDog(DogEntity dogEntity) {
        return dogRepository.save(dogEntity);
    }

    public DogDto saveDogDto  (DogDto dogDto){
        DogEntity dogEntity = new DogEntity();
        BeanUtils.copyProperties(dogDto, dogEntity);
        dogRepository.save(dogEntity);
        return dogDto;

    }

    @Override
    public DogEntity updateDog(DogEntity dogEntity) {
        return dogRepository.save(dogEntity);
    }

    @Override
    public void deleteDog(Long id) {
        dogRepository.deleteById(id);

    }
}
