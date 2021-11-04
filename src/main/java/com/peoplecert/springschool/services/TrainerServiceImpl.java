package com.peoplecert.springschool.services;

import com.peoplecert.springschool.model.Trainer;
import com.peoplecert.springschool.repositories.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public Trainer updateTrainer(Trainer trainer) {

        Integer trainerId = trainer.getId();
        Trainer tr = trainerRepository.findById(trainerId).get();

        tr.setFirstname(trainer.getFirstname());
        tr.setLastname(trainer.getLastname());

        return trainerRepository.save(tr);
    }

    @Override
    public void deleteTrainer(Integer id) {
        this.trainerRepository.deleteById(id);
    }

    @Override
    public Trainer getTrainerById(int id) {
        Optional<Trainer> optionalTrainer = trainerRepository.findById(id);
        Trainer trainer = null;
        if (optionalTrainer.isPresent()) {
            trainer = optionalTrainer.get();
        } else {
            throw new RuntimeException("Trainer with id: " + id + "didn;t found");
        }
        return trainer;
    }


}
