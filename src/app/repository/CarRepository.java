package app.repository;

import app.model.Car;
import app.model.CarValidator;
import data.models.Errors;
import data.repositories.AbstractCrudRepository;

import java.util.Date;

/**
 * Created by Chirila on 11/28/2015.
 */
public class CarRepository extends AbstractCrudRepository<Car,Integer> {
    private CarValidator validator;

    public CarRepository(CarValidator val) {
        this.validator = val;

        Date d1 = new Date();
        Car c1 = new Car("audi","a5",d1,250,"black","sj 07 ady", 20);
        Date d2 = new Date();
        Car c2 = new Car("ferari","f50",d2,550,"red","sj 17 chi", 100);
        Date d3 = new Date();
        Car c3 = new Car("nissan","350z",d3,350,"white","sj 27 adr", 70);
        save(c1);
        save(c2);
        save(c3);
    }

    public Errors validate(Car car) {
        return validator.validate(car);
    }

    public void setEntityId(Car c) {
        c.setId(entities.size()+1);
    }
}
