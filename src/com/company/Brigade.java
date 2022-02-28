package com.company;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Brigade {
    List<Person> people;
    Map<Speciality, Integer> SpecialityAndSalary = new HashMap<>();
    private Integer allSalary;

    public Brigade(List<Person> people) {
        this.people = people;
        this.allSalary=0;
        specialityNumber();
        allSalary();
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    public Map<Speciality, Integer> getSpecialityAndSalary() {
        return SpecialityAndSalary;
    }

    public void setSpecialityAndSalary(Map<Speciality, Integer> specialityAndSalary) {
        SpecialityAndSalary = specialityAndSalary;
    }

    public Integer getAllSalary() {
        return allSalary;
    }

    public void setAllSalary(Integer allSalary) {
        this.allSalary = allSalary;
    }

    private void specialityNumber() {
        for (Person person : people) {
            List<Speciality> specialities = person.getSpecialities();
            for (Speciality speciality : specialities) {
                if (SpecialityAndSalary.containsKey(speciality)) {
                    Integer value = SpecialityAndSalary.get(speciality) + 1;
                    SpecialityAndSalary.put(speciality, value);
                } else {
                    SpecialityAndSalary.put(speciality, 1);
                }
            }
        }
    }

    private void allSalary() {
        for (Person person : people) {
            allSalary += person.getSalary();
        }
    }


}