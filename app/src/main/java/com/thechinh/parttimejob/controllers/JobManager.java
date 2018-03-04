package com.thechinh.parttimejob.controllers;

import com.thechinh.parttimejob.models.Candidate;
import com.thechinh.parttimejob.models.Job;
import com.thechinh.parttimejob.models.User;

import java.util.ArrayList;
import java.util.Date;

public class JobManager {
    private static JobManager sInstance = null;
    private ArrayList<Job> mJobList;

    private JobManager(){
        this.mJobList = new ArrayList<>();
    }

    public void load(){
        for (int i = 0; i<10; i++){
            Job job = new Job();
            job.setId(i);
            job.setName("");
            job.setBenefits("");
            job.setDescription("");
            job.setSalary("");
            job.setLocation("");
            job.setRequirement("");

            User u = new User();
            u.setFullName("");
            u.setAddress("");
            u.setEducation("");
            u.setDayOfBirth(new Date());
            u.setForeignLanguages("");
            u.setPhoneNumber("");
            u.setSkills("");
            u.setEmail("");
            u.setPassword("");

            job.setRecruiter(u);

            job.setSalary("");
            job.setName("");

            ArrayList<Candidate> mCandidateList = new ArrayList<>();

            for(int j = 0; j<5; j++){
                User user = new User();
                user.setFullName("");
                user.setAddress("");
                user.setEducation("");
                user.setDayOfBirth(new Date());
                user.setForeignLanguages("");
                user.setPhoneNumber("");
                user.setSkills("");
                user.setEmail("");


                mCandidateList.add(new Candidate(user, "", new Date(),""));
            }

            job.setCandidateList(mCandidateList);

            mJobList.add(job);
        }
    }

    public ArrayList<Job> getJobs(){
        return this.mJobList;
    }

    public Job getJobByRecruiterId(int id){
        for(Job j : mJobList){
            if(j.getId() == id){
                return j;
            }
        }

        return null;
    }


    public ArrayList<Candidate> getCandidatesById(int id){
        for(Job j : mJobList){
            if(j.getId() == id){
                return j.getCandidateList();
            }
        }

        return null;
    }

    public static JobManager getInstance(){
        if(sInstance == null){
            sInstance = new JobManager();
        }

        return sInstance;
    }
}
