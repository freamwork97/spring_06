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
    public String save() {
        return "save";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute StudentDTO studentDTO) {
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
    public String detail(@RequestParam("id") int id, Model model) {
        StudentDTO studentDTO = studentService.detail(id);
        model.addAttribute("student", studentDTO);
        return "detail";
    }

    @GetMapping("/list")
    public String list(Model model) { // 가져갈게 있을 때 Model사용
        List<StudentDTO> studentDTOList = studentService.list();
        System.out.println("studentList = " + studentDTOList);
        model.addAttribute("studentList", studentDTOList); // 화면에 가져갈 데이터
        return "list"; // 브라우저에 출력할 jsp 파일 이름
    }

    @GetMapping("/update")
    public String update(@RequestParam("id") int id, Model model) {
        StudentDTO studentDTO = studentService.detail(id);
        model.addAttribute("student", studentDTO);
        System.out.println("id = " + id);
        return "update";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute StudentDTO studentDTO) {
        studentService.update(studentDTO);
        System.out.println("studentDTO = " + studentDTO);
        return "redirect:/list";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") int id, Model model) {
        studentService.delete(id);
        return "redirect:/list";
    }
//    @GetMapping("/delete")
//    public String delete(@RequestParam("id") int id, Model model) {
//        studentService.delete(id);
//        // redirect 방식 쓰지 않고 직접 리스트 가져와서 list.jsp로 이동
//        List<StudentDTO> studentDTOList = studentService.list();
//        model.addAttribute("studentList", studentDTOList);
//        return "list";
//    }

}
