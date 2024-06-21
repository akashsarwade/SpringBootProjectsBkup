package com.university.enroll.model;

public class LearnerProfile {


		private Long profileId;

		private int numberOfCredits;

		private float gpa;// grade point average
		private boolean isGraduated;
		private short startYear;

		public LearnerProfile() {
		}

		public LearnerProfile(short startYear) {
			this.startYear = startYear;
		}

		public Long getProfileId() {
			return profileId;
		}

		public int getNumberOfCredits() {
			return numberOfCredits;
		}

		public float getGpa() {
			return gpa;
		}

		public boolean isGraduated() {
			return isGraduated;
		}

		public short getStartYear() {
			return startYear;
		}
	}
