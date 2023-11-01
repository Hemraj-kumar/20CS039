package my.project.student_mgmt.Service;

import my.project.student_mgmt.Model.Student;

import java.util.List;

public interface studentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
    Student updateStudent(Student student);
    Student getStudentById(Long id);
    void deleteStudentById(Long id);
}
