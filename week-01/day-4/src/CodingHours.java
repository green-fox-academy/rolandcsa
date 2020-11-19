public class CodingHours {
    public static void main(String[] args) {
        int dailyHours = 6;
        int semesterWeeks = 17;
        int workingDays = 5;
        int avarageWorkHours = 52;
        double percentage = ((double) dailyHours * workingDays / avarageWorkHours) * 100;

        System.out.println("An attendee codes " + dailyHours * semesterWeeks * workingDays + " hours in this semester");

        System.out.println("This is " + (int) percentage + "%");
    }
}
