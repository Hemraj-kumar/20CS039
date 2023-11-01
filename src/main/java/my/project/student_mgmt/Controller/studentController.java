package my.project.student_mgmt.Controller;

import my.project.student_mgmt.Model.Student;
import my.project.student_mgmt.Service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class studentController {
    @Autowired
    studentService service;

    //handler method to handle studnts
    @GetMapping("/students")
    public String listStudents(Model model){
        model.addAttribute("index",
                service.getAllStudents());
        return "index";
    }

    @GetMapping("/students/new")
    public String addStudents(Model model){
        //object to hold the data of new student
        Student student=new Student();
        model.addAttribute("student",student);
        return "add_students";
    }
    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student")Student student){
       service.saveStudent(student);
       return "redirect:/students";
    }
    @GetMapping("students/edit/{id}")
    public String editStudent(@PathVariable("id") Long id,Model model){
        model.addAttribute("student",service.getStudentById(id));
        return "edit_student";
    }
    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable("id") Long id,@ModelAttribute("student")Student student){
        Student existing=service.getStudentById(id);
        existing.setId(id);
        existing.setFirstName(student.getFirstName());
        existing.setLastName(student.getLastName());
        existing.setEmail(student.getEmail());
        service.updateStudent(existing);
        return "redirect:/students";
    }
    @GetMapping("/students/delete/{id}")
    public String deleteStudent(@PathVariable("id") Long id){
        service.deleteStudentById(id);
        return "redirect:/students";
    }

}
