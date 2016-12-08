package com.project.client;

import com.project.entities.Person;
import com.project.manager.PersonManager;
import com.project.service.PersonActionService;

/**
 *
 * @author armen
 */
public class PersonServiceClient {

    private final PersonManager personManager;

    public PersonServiceClient() {
        personManager = PersonActionService.getInstance();

    }
    
    public void savePerson(){
        Person person = new Person();
        person.setFirstname("Firstname3");
        person.setLastname("Lastname3");
        personManager.create(person);
        System.out.println("Person counts at the moment " + personManager.getPersonCount());
        
    }
    
    public static void main(String args[]){
        PersonServiceClient client = new PersonServiceClient();
        client.savePerson();
        
    }

}
