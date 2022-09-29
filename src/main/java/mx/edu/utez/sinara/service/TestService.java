package mx.edu.utez.sinara.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import antlr.collections.List;
import mx.edu.utez.sinara.entity.Test;
import mx.edu.utez.sinara.repository.ITestRepository;
import java.util.List;


@Service
public class TestService {
    @Autowired
    private ITestRepository testRepository;

    public List<Test> findByStateId(int id) {
        return testRepository.findAll();
    }

    public Test save(Test test){
        return testRepository.save(test);
    }
}
