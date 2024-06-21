package com.university.enroll.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.university.enroll.model.Student;

@Repository
public interface StudentsRepository extends JpaRepository<Student, Long> {
}
