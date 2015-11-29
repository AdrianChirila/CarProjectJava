package app.repository;

import app.model.Client;
import app.model.ClientValidator;
import data.models.Errors;
import data.models.Validator;
import data.repositories.AbstractCrudRepository;

/**
 * Created by Chirila on 11/28/2015.
 */
public class ClientRepository extends
        AbstractCrudRepository<Client,Integer> {

    Validator<Client> validator;

    public ClientRepository(Validator<Client> val) {
        this.validator = val;
        Client c1 = new Client("Adrian", true,
                "Gore","gorebrate");

        Client c2 = new Client("Marian", true,
                "Marius","marius777");

        Client c3 = new Client("Florin", false,
                "Flore","1234florin");

        save(c1);
        save(c2);
        save(c3);
    }

    public Errors validate(Client c) {
        return validator.validate(c);
    }

    public void setEntityId(Client c) {
        c.setId(entities.size() + 1);
    }

    public Client findByUserName(String userName) {
        Iterable<Client> clients = getAll();
        for(Client client: clients) {
            if (client.getUserName().equals(userName)) {
                return client;
            }
        }

        return null;
    }

    public void test(){
        Iterable<Client> clients = getAll();
        for(Client client: clients) {
                System.out.println(client.getUserName());
            }
        }
}
