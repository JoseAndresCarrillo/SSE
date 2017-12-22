package com.example.josand.sse_fisi.Model;

/**
 * Created by josan on 22/12/2017.
 */

public class UndergraduateShowModel {

    private String univName;
    private String majorName;
    private String date;

    public UndergraduateShowModel(String univName, String majorName, String date) {
        this.univName = univName;
        this.majorName = majorName;
        this.date = date;
    }

    public String getUnivName() {
        return univName;
    }

    public String getMajorName() {
        return majorName;
    }

    public String getDate() {
        return date;
    }
}
