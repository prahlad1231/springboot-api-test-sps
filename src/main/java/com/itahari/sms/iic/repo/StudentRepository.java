package com.itahari.sms.iic.repo;

import com.itahari.sms.iic.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, String> {

}
