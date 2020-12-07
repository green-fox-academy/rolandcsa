package greenFoxOrganisation;

public class Person {

    protected String name;
    protected Integer age;
    protected String gender;

    public Person() {
        name = "Jane Doe";
        age = 30;
        gender = "female";
    }

    public Person(String name, Integer age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    protected String commonIntroduce() {
        return "Hi, I'm " + name + ", a " + age + " year old " + gender;
    }

    public void introduce() {
        System.out.println(commonIntroduce() + ".");
    }

    protected String commonGetGoal() {
        return "My goal is:";
    }

    public void getGoal() {
        System.out.println(commonGetGoal() + " Live for the moment!");
    }
}
