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
    public String showHomePage() {
        return "form";
    }

    @GetMapping("/insert")
    public String insertTrainer(ModelMap mm) {
        mm.addAttribute("newtrainer", new Trainer());
        return "createtrainerform";
    }

    @PostMapping("/insertTrainer")
    public String insertTrainer(@Valid @ModelAttribute("newtrainer") Trainer trainer, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "createtrainerform";
        } else {
            tsi.insertTrainer(trainer);
            return "resultpage";
        }
    }

    @GetMapping("/getAllTrainers")
    public String getAllTrainers(ModelMap mm) {
        mm.addAttribute("allTrainers", tsi.getAllTrainers());

        return "readtrainers";
    }

    @GetMapping("/update/{id}")
    public String updateTrainer(@PathVariable(value = "id") int id, ModelMap mm) {

        Trainer trainer = tsi.getTrainerById(id);
        mm.addAttribute("updatetrainer", trainer);

        return "updatetrainer";
    }

    @PostMapping("/updateTrainer")
    public String updateTrainer(@Valid @ModelAttribute("updatetrainer") Trainer trainer, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "updatetrainer";
        } else {
            tsi.updateTrainer(trainer);
            return "resultpage";
        }
    }

    @GetMapping("/delete/{id}")
    public String deleteTrainer(@PathVariable(value = "id") int id) {

        this.tsi.deleteTrainer(id);

        return "resultpage";
    }
}
