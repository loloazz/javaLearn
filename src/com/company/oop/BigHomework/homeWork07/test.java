package com.company.oop.BigHomework.homeWork07;

public class test {

    public static void main(String[] args) {
        Doctor doctor = new Doctor("da", 20, "dazhen", "wuwuw", 2000.0);
        Doctor b = doctor;
        Doctor doctor1 = new Doctor("gan", 20, "laoba", "shab", 200);
        System.out.println( doctor.equals(b));
        System.out.println(doctor.equals(doctor1));

    }

}
