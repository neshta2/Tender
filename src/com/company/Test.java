package com.company;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person( Arrays.asList(Speciality.Mason, Speciality.Electrical));
        Person p2 = new Person( Arrays.asList(Speciality.Plasterer, Speciality.Electrical));
        Brigade b1 = new Brigade(Arrays.asList(p1, p2));
        Person p3 = new Person( Arrays.asList(Speciality.Plasterer, Speciality.Mason));
        Person p4 = new Person( Arrays.asList(Speciality.Mason, Speciality.Mason));
        Brigade b2 = new Brigade(Arrays.asList(p3, p4));
        //Tender tender=new Tender(10000,Speciality.Mason);
        System.out.println(b1.getAllSalary());
        System.out.println(b1.getSpecialityAndSalary());
        System.out.println(b2.getAllSalary());
        System.out.println(b2.getSpecialityAndSalary());

        boolean isHashcodeEquals = b1.hashCode() == b2.hashCode();
        if (isHashcodeEquals) {
            System.out.println("Следует сравнить методом equals.");
        } else {
            System.out.println("Не следует сравнивать методом equals, т.к. " +
                    "идентификатор отличается, что означает, что объекты точно не равны.");
        }
    }
}

