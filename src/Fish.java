import java.time.LocalDate;
import java.util.List;
/**
 * Семейство рыб
 */
public class Fish extends Animal implements Swimable{
    private String fishType;

    public Fish(String name, LocalDate birthday, List<LocalDate>
            vactinations, String illness, String owner, String fishType) {
        super(name, birthday, vactinations, illness, owner);
        this.fishType = fishType;
    }
    public String getLegsFishType() {
        return fishType;
    }


    @Override
    public double swim() {
        System.out.printf("%s swiming", type);
        return 3.0;
    }
}