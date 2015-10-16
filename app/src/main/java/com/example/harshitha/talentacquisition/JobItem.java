package com.example.harshitha.talentacquisition;

import android.widget.ImageView;

/**
 * Created by harshu on 9/18/2015.
 */
public class JobItem {

    public String getJobrole() {
        return jobrole;
    }

    public void setJobrole(String jobrole) {
        this.jobrole = jobrole;
    }

    String jobrole;

    public String joblocation;

    public String getJoblocation(){
        return joblocation;
    }

    public void setJoblocation(String joblocation) {
        this.joblocation = joblocation;
    }

    public String jobdescription;
    public String getJobdescription()
    {
        return jobdescription;
    }
    public void setJobdescription(String jobdescription)

    {
        this.jobdescription=jobdescription;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getFavourite() {
        return favourite;
    }

    public void setFavourite(int favourite) {
        this.favourite = favourite;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    String experience;
    String time;
    int favourite;



}
