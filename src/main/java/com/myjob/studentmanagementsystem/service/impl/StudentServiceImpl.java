package com.myjob.studentmanagementsystem.service.impl;

import com.myjob.studentmanagementsystem.entity.Student;
import com.myjob.studentmanagementsystem.repository.StudentRepository;
import com.myjob.studentmanagementsystem.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

}
