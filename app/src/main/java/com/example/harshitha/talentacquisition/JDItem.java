package com.example.harshitha.talentacquisition;

/**
 * Created by harshu on 9/30/2015.
 */
public class JDItem {

    String jobrole;

    public JDItem(String jr, String description, String descvalue, String location, String locationvalue, String salary, String salaryvalue)
    {
        this.jobrole=jr;
        this.description=description;
        this.descriptionvalue=descvalue;
        this.location=location;
        this.locationvalue=locationvalue;
        this.salary=salary;
        this.salaryvalue=salaryvalue;

    }

    public String getJobrole() {
        return jobrole;
    }

    public void setJobrole(String jobrole) {
        this.jobrole = jobrole;
    }

    String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    String descriptionvalue;

    public void setDescriptionvalue(String descriptionvalue) {
        this.descriptionvalue = descriptionvalue;
    }

    public String getDescriptionvalue() {
        return descriptionvalue;
    }

    String location;

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    String locationvalue;

    public void setLocationvalue(String locationvalue) {
        this.locationvalue = locationvalue;
    }

    public String getLocationvalue() {
        return locationvalue;
    }

    String salary;

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getSalary() {
        return salary;
    }

    String salaryvalue;

    public String getSalaryvalue() {
        return salaryvalue;
    }

    public void setSalaryvalue(String salaryvalue) {
        this.salaryvalue = salaryvalue;
    }


}
