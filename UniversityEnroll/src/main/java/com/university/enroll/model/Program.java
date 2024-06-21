package com.university.enroll.model;

public class Program {
	private Long programId;
    private int requiredYearsToGraduation;
    private int requiredCreditsToGraduation;
    private String fieldOfStudy;
    private Degree degree;

    public Program() {
    }

    public Program(String fieldOfStudy, Degree degree) {
        this.fieldOfStudy = fieldOfStudy;
        this.degree = degree;
    }

    public Long getProgramId() {
        return programId;
    }

    public int getRequiredYearsToGraduation() {
        return requiredYearsToGraduation;
    }

    public int getRequiredCreditsToGraduation() {
        return requiredCreditsToGraduation;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public Degree getDegree() {
        return degree;
    }

    public enum Degree {
        ASSOCIATE,
        BACHELOR,
        MASTER,
        PHD,
    }
}


