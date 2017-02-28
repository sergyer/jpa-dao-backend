package com.project.controllers;

import com.project.entities.Job;
import com.project.manager.JobManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;

/**
 * Created by sergy on 09-Dec-16.
 */
public class JobController implements JobManager {

    private EntityManagerFactory emf;

    public JobController() {
        emf = Persistence.createEntityManagerFactory("projectPU");
    }

    public EntityManager entityManager() {
        return emf.createEntityManager();
    }


    @Override
    public void create(Job job) {
        EntityManager entityManager = entityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(job);
            entityManager.getTransaction().commit();
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }


    }

    @Override
    public void edit(Job job) {

        EntityManager entityManager = null;
        try {
            entityManager = entityManager();
            entityManager.getTransaction().begin();
            job = entityManager.merge(job);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                long id = job.getId();
                if (findJob(id) == null) {
                    return;
                }
            }
            throw ex;
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
    }


    @Override
    public Job findJob(long id) {
        EntityManager em = entityManager();
        try {
            return em.find(Job.class, id);
        } finally {
            em.close();
        }
    }

    @Override
    public void destroy(Integer id) {

        EntityManager entityManager = null;
        try {
            entityManager = entityManager();
            entityManager.getTransaction().begin();
            Job job = null;
            try {
                job = entityManager.getReference(Job.class, id);
                job.getId();
            } catch (EntityNotFoundException enfe) {

            }
            entityManager.remove(job);
            entityManager.getTransaction().commit();
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }

    }
}
