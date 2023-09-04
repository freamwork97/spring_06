package com.icia.student.controller;

import com.icia.student.dto.StudentDTO;
import com.icia.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/save")
    public String  save(){
        return "save";
    }

    @PostMapping("/save")
    public String reqdb1(@ModelAttribute StudentDTO studentDTO) {
        studentService.save(studentDTO);
        return "index";
    }


//    @PostMapping("/save")
//    public String save(@ModelAttribute StudentDTO studentDTO) {
//        boolean result = studentService.save(studentDTO);
//        if (result) {
//            System.out.println("학생등록 성공");
//            return "index";
//        } else {
//            System.out.println("학생등록 실패");
//            return "save";
//        }
//    }


    @GetMapping("/detail")
    public String detail(@RequestParam("id") int id, Model model){
        StudentDTO studentDTO = studentService.detail(id);
        model.addAttribute("student",studentDTO);
        return "detail";
    }

    @GetMapping("/list")
    public String list(Model model){
        List<StudentDTO> studentDTOList = studentService.list();
        System.out.println("studentList = " + studentDTOList);
        model.addAttribute("studentList", studentDTOList);
        return "list";
    }
}
