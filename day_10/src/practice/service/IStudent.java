package practice.service;

import practice.model.Student;

import java.util.ArrayList;

public interface IStudent {
    void printInfo(ArrayList<Student> list);
    Student creatStudent();
    Student updatePoint(int id);
    void deleteStudent(int id);
    ArrayList<Student> printInfoByClass(String classroom);
    ArrayList<Student> sortByName(ArrayList<Student> students);
    ArrayList<Student> sortByAge(ArrayList<Student> students);
    ArrayList<Student> sortByPoint(ArrayList<Student> students);
}
