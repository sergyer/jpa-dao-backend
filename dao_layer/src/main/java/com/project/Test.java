package com.project;

import org.joda.time.DateTime;

import java.util.Calendar;

/**
 * Created by sergy on 09-Dec-16.
 */
public class Test {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016,12,20);
        System.out.println(calendar.getTime());
    }
}
