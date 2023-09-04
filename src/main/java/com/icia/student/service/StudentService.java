package com.icia.student.service;

import com.icia.student.dto.StudentDTO;
import com.icia.student.reposit.StudentReposit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentReposit studentReposit;

    public StudentDTO detail(int id) {
        return studentReposit.detail(id);

    }

    public void reqdb1(StudentDTO studentDTO) {
        studentReposit.reqdb1(studentDTO);

    }

    public List<StudentDTO> list() {
        return studentReposit.list();
    }
}
