package org.example;

import org.example.Entity.Student;

import java.util.List;

public interface Studentdao {
     public int  inserte(Student student1);

    public int change(Student student2);

    public  int deletes(int student3);

    public  Student getStudent(int studentId);

    public List<Student> getMultiPle();

}

