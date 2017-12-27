package com.example.josand.sse_fisi.Model;

/**
 * Created by josan on 27/12/2017.
 */

public class PostgraduateShowModel {
    private String univName;
    private String courseName;
    private String dateCourse;

    public PostgraduateShowModel(String univName, String courseName, String dateCourse) {
        this.univName = univName;
        this.courseName = courseName;
        this.dateCourse = dateCourse;
    }

    public String getUnivName() {
        return univName;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getDateCourse() {
        return dateCourse;
    }
}
