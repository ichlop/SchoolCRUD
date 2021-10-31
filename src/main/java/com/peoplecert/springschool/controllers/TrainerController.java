package com.peoplecert.springschool.controllers;

import com.peoplecert.springschool.model.Trainer;
import com.peoplecert.springschool.services.TrainerServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class TrainerController {

    @Autowired
    private TrainerServiceInterface tsi;

//    @GetMapping("/")
//    public String showForm() {
//        return "form";
//    }

    @GetMapping("/insertTrainer")
    public String showTrainer(ModelMap mm) {
        mm.addAttribute("newtrainer", new Trainer());
        return "trainerform";
    }

    @ResponseBody
    @PostMapping("/insertTrainer")
    public Trainer insertTrainer(/*@Valid @ModelAttribute("newtrainer"), BindingResult bindingResult*/ Trainer trainer) {
        return tsi.insertTrainer(trainer);
//        if (bindingResult.hasErrors()) {
//            return "trainerform";
//        }

//        return "form";
    }

    @GetMapping("/allTrainers")
    public String getAllTrainers(ModelMap mm) {
        mm.addAttribute("allTrainers", tsi.getAllTrainers());

        return "allTrainers";
    }

    @DeleteMapping("/deleteTrainer")
    public void deleteTrainer(@RequestParam Integer id) {
        tsi.deleteTrainer(id);
    }
}
