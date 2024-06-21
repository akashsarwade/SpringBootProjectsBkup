package com.university.enroll.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.university.enroll.model.Program;

@Service
public class ProgramService {

	/**
	 * Returns the Program object by field of study and degree from the database if
	 * it exists or creates a new object
	 */
	public Program getOrCreateProgram(String fieldOfStudy, Program.Degree degree) {
		Optional<Program> program = Optional.empty(); // Placeholder

		if (program.isPresent()) {
			return program.get();
		}
		return new Program(fieldOfStudy, degree);
	}

	/**
	 * Returns all the programs from the database
	 */
	public List<Program> getAllProgramsWithStudents() {
		return List.of();
	}
}
