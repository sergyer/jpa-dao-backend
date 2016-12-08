package com.project.manager;

import com.project.entities.Job;
import com.project.entities.Person;

/**
 * Created by sergy on 09-Dec-16.
 */
public interface JobManager {

    void create(Job job);

    void edit(Job job);

    void destroy(Integer id);

    Job findJob(long id);
}
