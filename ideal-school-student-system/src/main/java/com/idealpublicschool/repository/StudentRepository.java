
package com.idealpublicschool.repository;

import com.idealpublicschool.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {}
