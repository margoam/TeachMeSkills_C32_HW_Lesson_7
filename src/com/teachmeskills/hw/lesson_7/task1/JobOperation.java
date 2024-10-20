package com.teachmeskills.hw.lesson_7.task1;

public interface JobOperation {

    default void showJobDescription(String jobTitle) {
        System.out.println("Job title - " + jobTitle);
    }
}
