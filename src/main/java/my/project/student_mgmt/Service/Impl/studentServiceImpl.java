package my.project.student_mgmt.Service.Impl;

import my.project.student_mgmt.Model.Student;
import my.project.student_mgmt.Repository.StudentRepo;
import my.project.student_mgmt.Service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class studentServiceImpl implements studentService {
    @Autowired
    StudentRepo studentRepo;
    @Override
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepo.findById(id).get();
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepo.deleteById(id);
    }
}
