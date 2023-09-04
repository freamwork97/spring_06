package com.icia.student.reposit;

import com.icia.student.dto.StudentDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentReposit {
    @Autowired
    private SqlSessionTemplate sql;
    public void save(StudentDTO studentDTO) {
        sql.insert("Student.save", studentDTO);
    }


//    public int save(StudentDTO studentDTO) {
//        return sql.insert("Student.save", studentDTO);
//    }


    public List<StudentDTO> list() {
        return sql.selectList("Student.list");
    }

    public StudentDTO detail(int id) {
        return sql.selectOne("Student.detail", id);
    }



    public void reqdb2(StudentDTO studentDTO) {
        sql.update("Student.update",studentDTO);
    }
}
