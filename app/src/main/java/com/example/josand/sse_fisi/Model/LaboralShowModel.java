package com.example.josand.sse_fisi.Model;

/**
 * Created by josan on 27/12/2017.
 */

public class LaboralShowModel {
    private String enterpriseName;
    private String jobTitle;
    private String hireDate;

    public LaboralShowModel(String enterpriseName, String jobTitle, String hireDate) {
        this.enterpriseName = enterpriseName;
        this.jobTitle = jobTitle;
        this.hireDate = hireDate;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getHireDate() {
        return hireDate;
    }
}
