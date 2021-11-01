package com.peoplecert.springschool.controllers;

import com.peoplecert.springschool.model.Trainer;
import com.peoplecert.springschool.services.TrainerServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class TrainerController {

    @Autowired
    private TrainerServiceInterface tsi;

    @GetMapping("/")
    public String showHomePage(ModelMap mm) {
        mm.addAttribute("newtrainer", new Trainer());
        return "createtrainerform";
    }

    @PostMapping("/insertTrainer")
    public String insertTrainer(@Valid @ModelAttribute("newtrainer") Trainer trainer, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "createtrainerform";
        }

        tsi.insertTrainer(trainer);
        return "resultpage";
    }

    @GetMapping("/allTrainers")
    public String getAllTrainers(ModelMap mm) {
        mm.addAttribute("allTrainers", tsi.getAllTrainers());

        return "readtrainers";
    }


    @DeleteMapping("/deleteTrainer")
    public void deleteTrainer(@RequestParam Integer id) {
        tsi.deleteTrainer(id);
    }
}
