package com.company;


import java.util.List;

class Person {

    List<Speciality> specialities;
    Integer salary;

    Person( List<Speciality> specialities) {
        this.specialities = specialities;
        this.salary=0;
        salary();
    }

    void salary() {
        for (Speciality speciality : specialities) {
            salary += speciality.getSalary();
        }
    }


    public List<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(List<Speciality> specialities) {
        this.specialities = specialities;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
