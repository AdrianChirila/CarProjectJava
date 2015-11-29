package app.services;

import app.model.Car;
import app.model.Client;
import app.repository.CarRepository;
import app.repository.ClientRepository;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Date;

/**
 * Created by Chirila on 11/28/2015.
 */
public class AppManager {
    private CarRepository carRepo;
    private ClientRepository clientRepo;

    public AppManager(CarRepository carRepo, ClientRepository clientRepo) {
        this.carRepo = carRepo;
        this.clientRepo = clientRepo;
    }

    public Iterable<Car> getAllCars() {
        return carRepo.getAll();
    }

    public Client authenticate(String userName, String password) {
        Client client = clientRepo.findByUserName(userName);
        if (client != null && password.equals(client.getPassword())) {
            System.out.println("Welcom " + client.getUserName());

            return client;
        }

        System.out.println("Invalid Credintials!");

        return null;
    }

    public void addCar(String brand, String series,String color,
                       String regNumber, int power, int price
    ,Date manufactured) {
        Car car = new Car(brand, series, manufactured, power, color
        ,regNumber, price);
        carRepo.save(car);
    }

    public void addClient(String fullName, Boolean vip, String userName,
                          String password) {
        Client client = new Client(fullName, vip, userName, password);
        clientRepo.save(client);
    }
}
