package my.project.student_mgmt;

import my.project.student_mgmt.Model.Student;
import my.project.student_mgmt.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentMgmtApplication{

    public static void main(String[] args) {
        SpringApplication.run(StudentMgmtApplication.class, args);
    }


}
