import java.time.LocalDate;

public class Nurse extends Medical_Staff{
    private Doctor doctor;

    public Nurse(String firstName, String lastName, LocalDate birthday,
                 Integer experience, String speciality, Doctor doctor) {
        super(firstName, lastName, birthday, experience, speciality);
        this.doctor = doctor;
    }

    @Override
    public void working() {
        System.out.println("The nurse made notes on the patient's chart");
    }

}
