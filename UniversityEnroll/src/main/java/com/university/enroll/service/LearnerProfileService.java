package com.university.enroll.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.university.enroll.model.LearnerProfile;

@Service
public class LearnerProfileService {
	/**
	 * Returns all the active students' learner profiles in the database, sorted by
	 * their GPA in descending order
	 */
	public List<LearnerProfile> getActiveStudentProfilesOrderedByGpa() {
		return List.of();
	}
}