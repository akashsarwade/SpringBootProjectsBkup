package com.university.enroll.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Courses")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long courseId;

	private String title;
	private String description;
	private int numberOfCredits;

	public Course() {
	}

	public Course(String title, String description, int numberOfCredits) {
		this.title = title;
		this.description = description;
		this.numberOfCredits = numberOfCredits;
	}

	public int getNumberOfCredits() {
		return numberOfCredits;
	}

	public Long getCourseId() {
		return courseId;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}
}
