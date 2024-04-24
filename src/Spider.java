import java.time.LocalDate;
import java.util.List;
/**
 * Семейство пауков
 */
public class Spider extends Animal implements Goable{
    private String classification;

    public Spider(String name, LocalDate birthday, List<LocalDate>
            vactinations, String illness, String owner, String classification) {
        super(name, birthday, vactinations, illness, owner);
        this.classification = classification;
    }
    public String getLegsClassification() {
        return classification;
    }

    @Override
    public double run() {
        System.out.printf("%s going", type);
        return 1.0;
    }
}
