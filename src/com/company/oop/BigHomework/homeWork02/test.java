package com.company.oop.BigHomework.homeWork02;


public class test {
    public static void main(String[] args) {
        Techer associateProfessor = new AssociateProfessor("曹德旺", 60, 2006, "副教授");
        Techer Professor = new Professor("曹德", 50, 2005, "教授");
        Techer lecturer = new lecturer("曹旺", 25, 2000, "讲师");
        System.out.println(associateProfessor.introduce());
        System.out.println(Professor.introduce());
        System.out.println(lecturer.introduce());
    }
}
