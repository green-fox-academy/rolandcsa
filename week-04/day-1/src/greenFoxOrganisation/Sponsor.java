package greenFoxOrganisation;

public class Sponsor extends Person {
    private final String company;
    private Integer hiredStudents = 0;

    public Sponsor() {
        company = "Google";
    }

    public Sponsor(String name, Integer age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
    }

    @Override
    public void introduce() {
        System.out.println(super.commonIntroduce() + " who represents " + company + " and hired " + hiredStudents + " students so far.");
    }

    @Override
    public void getGoal() {
        System.out.println(commonGetGoal() + " Hire brilliant junior software developers.");
    }

    public void hire() {
        hiredStudents++;
    }
}
