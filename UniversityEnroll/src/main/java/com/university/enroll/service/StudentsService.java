package com.university.enroll.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.university.enroll.model.Course;
import com.university.enroll.model.Program;
import com.university.enroll.model.Student;
import com.university.enroll.repositories.StudentsRepository;

@Service
public class StudentsService {
	private final StudentsRepository studentsRepository;

	public StudentsService(StudentsRepository studentsRepository) {
		this.studentsRepository = studentsRepository;
	}

	/**
	 * Finds a student by email address. Returns {@code Optional.empty()} if a
	 * student with this email doesn't exist
	 */
	public Optional<Student> findStudentByEmail(String email) {
		return Optional.empty();
	}

	/**
	 * Returns all registered students from the database
	 * 
	 * @return
	 */
	public List<Student> getAllRegisteredStudents() {
		return studentsRepository.findAll();
	}

	/**
	 * Adds a new student to the database
	 */
	public void addStudent(String firstName, String lastName, String email, LocalDate dateOfBirth, Program program) {
		Student student = new Student(firstName, lastName, email, dateOfBirth);
		studentsRepository.save(student);
	}

	/**
	 * Finds a student by their id. Returns {@code Optional.empty()} if a student
	 * with this email doesn't exist
	 */
	public Optional<Student> findStudentById(Long id) {
		return Optional.empty();
	}

	/**
	 * Returns all the courses that a given student is enrolled in
	 */
	public Set<Course> getAllStudentCourses(Student student) {
		return Set.of();
	}
}