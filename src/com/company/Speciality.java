package com.company;

public enum Speciality {
    Plasterer(100), Mason(500), Electrical(150);
    private int salary;

    Speciality(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}