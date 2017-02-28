package com.project.service;

import com.project.controllers.PersonController;


public class PersonActionService {

    private static final PersonController INSTANCE = new PersonController();

    public static PersonController getInstance() {
        return INSTANCE;
    }
}
