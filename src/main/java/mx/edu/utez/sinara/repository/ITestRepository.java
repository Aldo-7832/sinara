package mx.edu.utez.sinara.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.edu.utez.sinara.entity.Test;

public interface ITestRepository extends JpaRepository<Test, Long>{
    
}
