package com.project.service;

import com.project.controllers.JobController;

/**
 * Created by sergy on 09-Dec-16.
 */
public class JobActionService {
    private static JobController INSTANCE = new JobController();

    public static JobController getInstance() {
        return INSTANCE;
    }
}
