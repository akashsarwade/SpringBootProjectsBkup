package com.university.enroll.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.university.enroll.model.Course;

@Repository
public interface CoursesRepository extends JpaRepository<Course, Long> {
}
