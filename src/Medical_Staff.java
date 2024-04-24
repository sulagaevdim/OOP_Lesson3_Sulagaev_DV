import java.time.LocalDate;

public abstract class Medical_Staff {
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private Integer experience; //стаж
    private String speciality; // специальность
    private Nurse nurse;
    protected String type;

    public Medical_Staff(String firstName, String lastName,
                  LocalDate birthday, Integer experience,String speciality){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.experience = experience;
        this.speciality = speciality;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return "Doctor " + firstName + " " + lastName;
    }
    public abstract void working();
}
