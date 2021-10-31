package com.peoplecert.springschool.services;

import com.peoplecert.springschool.model.Trainer;
import com.peoplecert.springschool.repositories.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainerServiceImpl implements  TrainerServiceInterface{

    @Autowired
    private TrainerRepository trainerRepository;

    public Trainer insertTrainer(Trainer trainer) {
        return trainerRepository.save(trainer);
    }

    @Override
    public List<Trainer> getAllTrainers() {
        return trainerRepository.findAll();
    }

    @Override
    public void deleteTrainer(Integer id) {
        trainerRepository.deleteById(id);
    }

}
