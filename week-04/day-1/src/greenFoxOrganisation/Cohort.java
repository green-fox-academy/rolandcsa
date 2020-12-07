package greenFoxOrganisation;

import java.util.ArrayList;
import java.util.List;

public class Cohort {
    private final String cohortName;
    private final List<Student> studentList = new ArrayList<>();
    private final List<Mentor> mentorList = new ArrayList<>();

    public Cohort(String cohortName) {
        this.cohortName = cohortName;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void addMentor(Mentor mentor) {
        mentorList.add(mentor);
    }

    public void info() {
        System.out.println("The " + cohortName + " cohort has " + studentList.size() + " students and " + mentorList.size() + " mentors.");
    }
}
