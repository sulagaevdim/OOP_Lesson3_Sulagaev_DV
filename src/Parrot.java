import java.time.LocalDate;
import java.util.List;
/**
 * Семейство попугаев
 */
public class Parrot extends Animal implements Goable, Flyable{
    private String parrotView;

    public Parrot(String name, LocalDate birthday, List<LocalDate>
            vactinations, String illness, String owner, String parrotView) {
        super(name, birthday, vactinations, illness, owner);
        this.parrotView = parrotView;
    }
    public String getLegsCountParrotView() {
        return parrotView;
    }

    @Override
    public double fly() {
        System.out.printf("%s flying", type);
        return 100.0;
    }

    @Override
    public double run() {
        System.out.printf("%s going", type);
        return 5.0;
    }
}
