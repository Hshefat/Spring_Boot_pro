package com.Test.TestCRUD.Controller;


import com.Test.TestCRUD.Common.Constant.ApiEndpoingConstant;
import com.Test.TestCRUD.Entity.DogEntity;
import com.Test.TestCRUD.Services.DogServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(ApiEndpoingConstant.API)
public class DogController {
    private final DogServices dogServices;

    public DogController(DogServices dogServices) {
        this.dogServices = dogServices;
    }

    @GetMapping(ApiEndpoingConstant.DOG)
    public List<DogEntity> findAllDogs(){
        return dogServices.findAllDogs();
    }

    @GetMapping(ApiEndpoingConstant.DOG_ID)
    public Optional<DogEntity> findDogById(@PathVariable("id") Long id){
        return dogServices.findById(id);
    }

    @PostMapping(ApiEndpoingConstant.DOG)
    public  DogEntity saveDog(@RequestBody DogEntity dogEntity){
        return dogServices.saveDog(dogEntity);
    }
    @PostMapping(ApiEndpoingConstant.DOG_DTO)
    public  DogEntity saveDogDto(@RequestBody DogEntity dogEntity){
        return dogServices.saveDog(dogEntity);
    }

    @PutMapping(ApiEndpoingConstant.DOG_ID)
    public DogEntity updateDog(@RequestBody DogEntity dogEntity){
        return dogServices.updateDog(dogEntity);
    }
    @DeleteMapping(ApiEndpoingConstant.DOG_ID)
    public void deleteDogById(@PathVariable("id") Long id){
        dogServices.deleteDog(id);
    }
}
