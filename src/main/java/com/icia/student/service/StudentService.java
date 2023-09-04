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

    public void save(StudentDTO studentDTO) {
        studentReposit.save(studentDTO);
    }

//    public boolean save(StudentDTO studentDTO) {
//        int result = studentReposit.save(studentDTO);
//        if (result > 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }


    public List<StudentDTO> list() {
        return studentReposit.list();
    }




    public void reqdb2(StudentDTO studentDTO) {
        studentReposit.reqdb2(studentDTO);
    }
}
