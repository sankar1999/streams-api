package com.streams.api;

import java.util.List;

public class Company {

    private String companyName;
    private String companyLocation;
    private String companySalary;
    private List<String> companyProjects;

    public Company() {
    }

    public Company(String companyName, String companyLocation, String companySalary, List<String> companyProjects) {
        this.companyName = companyName;
        this.companyLocation = companyLocation;
        this.companySalary = companySalary;
        this.companyProjects = companyProjects;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyLocation() {
        return companyLocation;
    }

    public void setCompanyLocation(String companyLocation) {
        this.companyLocation = companyLocation;
    }

    public String getCompanySalary() {
        return companySalary;
    }

    public void setCompanySalary(String companySalary) {
        this.companySalary = companySalary;
    }

    public List<String> getCompanyProjects() {
        return companyProjects;
    }

    public void setCompanyProjects(List<String> companyProjects) {
        this.companyProjects = companyProjects;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", companyLocation='" + companyLocation + '\'' +
                ", companySalary='" + companySalary + '\'' +
                ", companyProjects=" + companyProjects +
                '}';
    }
}
