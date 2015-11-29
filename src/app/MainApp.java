package app;

import app.model.CarValidator;
import app.model.ClientValidator;
import app.repository.CarRepository;
import app.repository.ClientRepository;
import app.services.AppManager;
import app.ui.AppUi;

/**
 * Created by Chirila on 11/28/2015.
 */
public class MainApp {
    public static void main(String args[]) {
        try {
            ClientValidator clientVal = new ClientValidator();
            CarValidator carVal = new CarValidator();
            CarRepository carRepo = new CarRepository(carVal);
            ClientRepository clientRepo = new ClientRepository(clientVal);
            AppManager appMan = new AppManager(carRepo, clientRepo);
            AppUi appUi = new AppUi(appMan);
            appUi.login();
            appUi.startApp();
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}
