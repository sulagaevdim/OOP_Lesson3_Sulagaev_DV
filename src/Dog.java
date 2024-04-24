import java.time.LocalDate;
import java.util.List;
/**
 * Семейство собачьих
 */
public class Dog extends Animal implements Goable, Swimable{

    public Dog(String name, LocalDate birthday, List<LocalDate> vactinations, String illness, String owner) {
        super(name, birthday, vactinations, illness, owner);
    }

    @Override
    public double run() {
        System.out.printf("%s going", type);
        return 15.0;
    }

    @Override
    public double swim() {
        System.out.printf("%s swiming", type);
        return 5.0;
    }
}
