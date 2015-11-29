package app.model;

import data.models.Errors;
import data.models.Validator;

/**
 * Created by Chirila on 11/29/2015.
 */
public class CarValidator implements Validator<Car> {
    public Errors validate(Car c) {
        Errors errors = new Errors();

        if (c.getBrand().length() <3 || c.getBrand().length() > 15) {
            errors.add("Brand must be between 3 and 15 chars");
        }

        if (c.getSeries().length() <2 || c.getSeries().length() > 10) {
            errors.add("Series must be between 2 and 10 chars");
        }

        if (c.getColor().length() <3 || c.getColor().length() > 10) {
            errors.add("Color must be between 3 and 10 chars");
        }

        if (c.getRegNumber().length() <5 || c.getRegNumber().length() > 15) {
            errors.add("RegNumber must be between 3 and 15 chars");
        }

        if (c.getPower() < 50) {
            errors.add("Power must be at least 50");
        }

        if (c.getPrice() < 10) {
            errors.add("Price per day must be at least 10");
        }
        return  errors;
    }
}
