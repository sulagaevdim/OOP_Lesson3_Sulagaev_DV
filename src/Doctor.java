import java.time.LocalDate;

public class Doctor extends Medical_Staff{
    private Nurse nurse;

    public Doctor(String firstName, String lastName,
                  LocalDate birthday, Integer experience, String speciality) {
        super(firstName, lastName, birthday, experience, speciality);
        this.nurse = null;
    }

    @Override
    public void working() {
        System.out.println("The doctor diagnosed and treated");
    }

    public Doctor(String firstName, String lastName,
                  LocalDate birthday, Integer experience, String speciality, Nurse nurse) {
        super(firstName, lastName, birthday, experience, speciality);
        this.nurse = nurse;
        }
}
