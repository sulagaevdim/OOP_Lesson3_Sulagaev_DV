import java.time.LocalDate;
import java.util.*;

public class VetClinic {
    private List<Animal> patients = new ArrayList<>();
    private Map<LocalDate, Map<String, String>> treatmentSchedule = new HashMap<>();

    public void addPatient(Animal animal){
        patients.add(animal);
    }
    public void addPatients(Animal ... animals){
        Collections.addAll(patients, animals);
    }

    public List<Goable> getGoables(){
        List<Goable> result = new ArrayList<>(patients.size());
        for (Animal animal: patients) {
            if(animal instanceof Goable) result.add((Goable) animal);
        }
        return result;
    }
    public List<Flyable> getFlyable(){
        List<Flyable> result = new ArrayList<>(patients.size());
        for (Animal animal: patients) {
            if(animal instanceof Flyable) result.add((Flyable) animal);
        }
        return result;
    }
    public List<Swimable> getSwimables(){
        List<Swimable> result = new ArrayList<>(patients.size());
        for (Animal animal: patients) {
            if(animal instanceof Swimable) result.add((Swimable) animal);
        }
        return result;
    }

    public List<Animal> getPatients() {
        return patients;
    }


    public void addTreatment (LocalDate localDate, Animal animal, Doctor doctor) {
        treatmentSchedule.put(localDate, Map.of(animal.getName(), doctor.getName()));
    }

    public void showTreatment() {
        for (Map.Entry<LocalDate, Map<String, String>> entry : treatmentSchedule.entrySet()) {
            Map<String, String> value = entry.getValue();
            String pit = "";
            String doc = "";
            for (Map.Entry<String, String> entry1 : value.entrySet()) {
                pit = entry1.getKey();
                doc = entry1.getValue();
            }
            System.out.println(entry.getKey() + " назначено лечение пациенту: " + pit + ", Лечащий врач: " + doc);
        }
    }
}
