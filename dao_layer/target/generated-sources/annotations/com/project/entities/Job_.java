package com.project.entities;

import java.util.Calendar;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-12-09T00:43:09")
@StaticMetamodel(Job.class)
public class Job_ { 

    public static volatile SingularAttribute<Job, String> description;
    public static volatile SingularAttribute<Job, Date> postDate;
    public static volatile SingularAttribute<Job, Long> id;
    public static volatile SingularAttribute<Job, String> title;
    public static volatile SingularAttribute<Job, Calendar> deadline;

}