package data.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chirila on 11/29/2015.
 */
public class Errors {
    List<String> errors = new ArrayList<>();

    public Errors(){

    }

    public int size(){
        return errors.size();
    }

    public void add(String s) {
        errors.add(s);
    }

    public List<String> getErrors() {
        return errors;
    }
}
