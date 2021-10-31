package com.peoplecert.springschool.validators;

import com.peoplecert.springschool.model.Trainer;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class TrainerValidator implements Validator {

    @Override
    public boolean supports(Class<?> type) {
        return Trainer.class.equals(type);
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
