package repository;

import com.example.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository <Student, Integer>{
	Student findByFname(String fname);
	Student findByLname(String lname);
}
