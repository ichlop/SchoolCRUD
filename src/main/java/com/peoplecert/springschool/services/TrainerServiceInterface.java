package com.peoplecert.springschool.services;

import com.peoplecert.springschool.model.Trainer;

import java.util.List;

public interface TrainerServiceInterface {

    Trainer insertTrainer(Trainer trainer);
    List<Trainer> getAllTrainers();
    void deleteTrainer(Integer id);

}
