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

    @PostMapping("/reqdb1")
    public String reqdb1(@ModelAttribute StudentDTO studentDTO) {
        studentService.reqdb1(studentDTO);
        return "index";
    }


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
