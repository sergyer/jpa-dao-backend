package com.project.client;

import com.project.entities.Job;
import com.project.manager.JobManager;
import com.project.service.JobActionService;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by sergy on 09-Dec-16.
 */
public class JobServiceClient {
    private final JobManager jobManager;

    public JobServiceClient() {
        jobManager = JobActionService.getInstance();
    }

    public void saveJob() {
        Job job = new Job();
        job.setDeadline(new GregorianCalendar(2016,12,31));
        job.setPostDate(new Date());
        job.setTitle("Java Developer");
        job.setDescription("Self-motivated enthusiastic person");
        jobManager.create(job);
    }

    public static void main(String[] args) {
        JobServiceClient jobServiceClient = new JobServiceClient();
        jobServiceClient.saveJob();

    }
}
