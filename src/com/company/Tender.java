package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tender {
    List<Person> taskPeople;
    Map<Speciality, Integer> taskSpeciality = new HashMap<>();
    Integer taskSalary;

    public Tender(Integer taskSalary, Map<Speciality, Integer> taskSpeciality, List<Person> taskPeople) {
        this.taskSalary = taskSalary;
        this.taskSpeciality = taskSpeciality;
        this.taskPeople = taskPeople;
    }
    public void TaskSpecialityNumber(){

    }
}



