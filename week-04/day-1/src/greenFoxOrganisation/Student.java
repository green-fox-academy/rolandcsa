package greenFoxOrganisation;

public class Student extends Person {
    private final String previousOrganisation;
    private Integer skippedDays = 0;

    public Student() {
        previousOrganisation = "The School of Life";
    }

    public Student(String name, Integer age, String gender, String previousOrganisation) {
        super(name, age, gender);
        this.previousOrganisation = previousOrganisation;
    }

    @Override
    public void introduce() {
        System.out.println(super.commonIntroduce() + " from " + previousOrganisation + " who skipped " + skippedDays + " days from the course already.");
    }

    @Override
    public void getGoal() {
        System.out.println(commonGetGoal() + " Be a junior software developer.");
    }

    public void skipDays(int numberOfDays) {
        skippedDays = skippedDays + numberOfDays;
    }
}
