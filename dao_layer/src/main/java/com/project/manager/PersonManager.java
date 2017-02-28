package com.project.manager;

import com.project.entities.Person;
import java.util.List;


public interface PersonManager {
  
    public void create(Person person);
    public void edit(Person person);
    public void destroy(Integer id);
    public List<Person> findPersonEntities();
    public List<Person> findPersonEntities(int maxResults, int firstResult);
    public Person findPerson(Integer id);
    public int getPersonCount();
     
    
}
