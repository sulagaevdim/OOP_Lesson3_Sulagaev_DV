import java.time.LocalDate;
import java.util.List;
/**
 * Семейство кошачьих
 */
public class Cat extends Animal implements Goable, Swimable {
    private int legsCount;
    public Cat(String name, LocalDate birthday, List<LocalDate> vactinations,
               String illness, String owner, int legsCount) {
        super(name, birthday, vactinations, illness, owner);
        this.legsCount = legsCount;
    }

    public  int getLegsCount() {
        return legsCount;
    }

    @Override
    public double swim() {
        System.out.printf("%s swiming", type);
        return 5.0;
    }

    @Override
    public double run() {
        System.out.printf("%s going", type);
        return 10.0;
    }
}
