package app.model;

import data.models.Errors;
import data.models.Validator;

/**
 * Created by Chirila on 11/29/2015.
 */
public class ClientValidator implements Validator<Client> {
    public Errors validate(Client c) {
        Errors errors = new Errors();

        if (c.getFullName().length() < 5 || c.getFullName().length()
                > 30 ) {
            errors.add("Full name must be between 5 and 30 chars");
        }

        if (c.getUserName().length() < 3 || c.getUserName().length()
                > 15) {
            errors.add("User name must be between 3 and 15 chars");
        }

        if (c.getPassword().length() < 5 || c.getPassword().length()
                >15) {
            errors.add("Passoword must be between 5 and 15 chars");
        }

        return errors;
    }
}
