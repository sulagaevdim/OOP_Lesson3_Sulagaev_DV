import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static javax.swing.UIManager.get;



public class Main {
    public static void main(String[] args) {

        Cat pushok = new Cat("Пушок", LocalDate.of(2017, 9, 15), new LinkedList<>(),
                "глисты", "Наталья Сулагаева", 4);
        Dog pirat = new Dog("Пират", LocalDate.of(2023, 6, 18), new LinkedList<>(),
                "косоглазие", "Виктор Сулагаев");
        Parrot archi = new Parrot("Арчи", LocalDate.of(2020, 9, 28), new LinkedList<>(),
                "авитаминоз", "Дарья Клокова", "волнистый");
        Fish nemo = new Fish("Нэмо", LocalDate.of(2024, 1, 22), new LinkedList<>(),
                "пучеглазие", "Любовь Митина", "хищник");
        Spider mrCrabs = new Spider("Mr.Краббс", LocalDate.of(2019, 10, 8),
                new LinkedList<>(),"линька", "Татьяна Фомичева", "Nhandu_Chromatus");

        VetClinic vetClinic = new VetClinic();
        vetClinic.addPatient(pushok, pirat, archi, nemo, mrCrabs);
        System.out.println(vetClinic.getPatients());
        System.out.println(vetClinic.getGoables());


    }
}