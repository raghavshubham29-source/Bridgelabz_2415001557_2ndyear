
package com.university.department.cse;

public class Course {
    private String courseName;
    private int duration;

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void showCourse() {
        System.out.println("Course: " + courseName + " | Duration: " + duration + " months");
    }
}