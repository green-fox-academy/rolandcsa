package greenFoxOrganisation;

public class Mentor extends Person {
    private final String level;

    public Mentor() {
        level = "intermediate";
    }

    public Mentor(String name, Integer age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }

    @Override
    public void introduce() {
        System.out.println(super.commonIntroduce() + " " + level + " mentor.");
    }

    @Override
    public void getGoal() {
        System.out.println(commonGetGoal() + " Educate brilliant junior software developers.");
    }
}
