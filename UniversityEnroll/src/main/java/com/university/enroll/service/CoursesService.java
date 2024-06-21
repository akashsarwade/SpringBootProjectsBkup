package com.university.enroll.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.university.enroll.model.Course;
import com.university.enroll.model.Student;
import com.university.enroll.repositories.CoursesRepository;

@Service
public class CoursesService {
    private final CoursesRepository coursesRepository;

    public CoursesService(CoursesRepository coursesRepository) {
        this.coursesRepository = coursesRepository;
    }

    /**
     * Returns all available courses from the database
     */
    public List<Course> getAllCourses() {
        return coursesRepository.findAll();
    }

    /**
     * Returns a course by its Id if it exists, or {@code Optional.empty()}
     */
    public Optional<Course> findCourse(Long courseId) {
        return Optional.empty();
    }

    /**
     * Enrolls a student in a course
     */
    public void enrollStudent(Course course, Student student) {

    }

    /**
     * Removes a student from a course
     */
    public void unEnrollStudent(Course course, Student student) {

    }
}
