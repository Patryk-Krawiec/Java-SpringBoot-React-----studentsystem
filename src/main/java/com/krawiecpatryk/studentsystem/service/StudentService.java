package com.krawiecpatryk.studentsystem.service;

import com.krawiecpatryk.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
