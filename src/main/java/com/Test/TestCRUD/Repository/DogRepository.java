package com.Test.TestCRUD.Repository;

import com.Test.TestCRUD.Entity.DogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogRepository extends JpaRepository<DogEntity,Long> {
}
