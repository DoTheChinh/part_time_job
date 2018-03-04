package com.thechinh.parttimejob.models;

import java.util.ArrayList;

public class Job {
    private int id;
    private User recruiter;
    private String name;
    private String salary;
    private String location;
    private String description;
    private String requirement;
    private String benefits;
    private ArrayList<Candidate> mCandidateList;

    public Job(){

    }

    public Job(int id, User recruitor, String name, String salary, String location,
               String description, String requirement, String benefits, ArrayList<Candidate> mCandidateList) {
        this.id = id;
        this.recruiter = recruitor;
        this.name = name;
        this.salary = salary;
        this.location = location;
        this.description = description;
        this.requirement = requirement;
        this.benefits = benefits;
        this.mCandidateList = mCandidateList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getRecruiter() {
        return recruiter;
    }

    public void setRecruiter(User recruiter) {
        this.recruiter = recruiter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public ArrayList<Candidate> getCandidateList() {
        return mCandidateList;
    }

    public void setCandidateList(ArrayList<Candidate> mCandidateList) {
        this.mCandidateList = mCandidateList;
    }
}
