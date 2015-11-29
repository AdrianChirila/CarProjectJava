package app.ui;

import app.model.Car;
import app.model.Client;
import app.services.AppManager;
import data.models.ValidationException;

import java.util.Date;
import java.util.Scanner;

/**
 * Created by Chirila on 11/28/2015.
 */
public class AppUi {
    private AppManager manager;
    private Client client;

    public AppUi(AppManager manager) {
        this.manager = manager;
    }

    public void printMenu() {
        System.out.println("________________________________");
        System.out.println("1 - to get all cars!");
        System.out.println("2 - to add a car");
        System.out.println("3 - to add a client");
    }

    public void printAllCars() {
        Iterable<Car> cars =manager.getAllCars();
        System.out.println("Series  Brand  Power  Id");
        for(Car car: cars) {
            System.out.println(car.getSeries() + "  " +  car.getBrand()
            + "  " + car.getPower() + "  " + car.getId());
        }
    }

    public void startApp() {
        Scanner input = new Scanner(System.in);
        System.out.println("Start application");
        printMenu();

        while(true) {

            int cmd = input.nextInt();

            if (cmd == 1) {
                System.out.println("Start application");
                printAllCars();
            } else if (cmd == 2) {
                addCar();
            } else if (cmd == 3) {
                addClient();
            }
            else {
                break;
            }
            printMenu();
        }
    }

    private void addClient() {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Fullname:");
            String fullName = input.nextLine();
            System.out.println("VIP:");
            boolean vip = input.nextBoolean();
            System.out.println("User name:");
            String userName = input.nextLine();
            System.out.println("Password:");
            String password = input.nextLine();

            manager.addClient(fullName, vip, userName, password);
        } catch(ValidationException vex) {
            System.out.println("Validation exception" + vex);
        }
    }

    private void addCar() {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Brand:");
            String brand = input.nextLine();
            System.out.println("Series:");
            String series = input.nextLine();
            System.out.println("Color:");
            String color = input.nextLine();
            System.out.println("Reg number:");
            String regNumber = input.nextLine();
            System.out.println("Power:");
            int power = input.nextInt();
            System.out.println("Price per hour:");
            int price = input.nextInt();
            Date d = new Date();
            manager.addCar(brand, series, color, regNumber, power, price, d);
        } catch (ValidationException vex) {
            System.out.println("Validation exception" + vex.getMessage());
        }
    }

    public void login() {
        System.out.println("User name:");
        Scanner input = new Scanner(System.in);
        String userName = input.nextLine();
        System.out.println("Password:");
        String password = input.nextLine();
        client = manager.authenticate(userName, password);
        if (client !=null) {
            System.out.println("Welcom " + client.getUserName());
        }
    }
}
