package pharmacy;

import javax.swing.plaf.IconUIResource;
import java.util.*;

public class Pharmacy_main {
    public static void main(String[] args) {
        // создаю компоненты
        Component pinicillin = new Component("pinicilin", "10mg", 100);
        Component water = new Component("water", "100ml", 10);
        Component salt = new Component("salt", "1mg", 60);
        Component sugar = new Component("Sugar", "10mg", 40);
        Component starch = new Component("krachmal", "5mg", 30);
        Component paracetamol_av = new Component("paracetamol", "10mg", 70);
        Component trometamol = new Component("trometamol", "4mg", 110);
        Component hlor = new Component("hlorka", "5mg", 25);


        // создаю экземпляры класса Pharmacy
        Pharmacy ibuprofen = new Pharmacy();
        ibuprofen.addComponents(paracetamol_av, starch, water, salt);

        Pharmacy paracetamol = new Pharmacy();
        paracetamol.addComponents(paracetamol_av, starch, water, salt);

        Pharmacy ketarol = new Pharmacy();
        ketarol.addComponents(trometamol, water, sugar);

        Pharmacy saltWater = new Pharmacy();
        saltWater.addComponents(hlor, salt, water);

        Pharmacy sweetWater = new Pharmacy();
        sweetWater.addComponents(sugar, water, hlor);

        //создаю коллекцию из уникальных по составу компонентов препаратов
        Set<Pharmacy> result = new HashSet<>();
        result.add(paracetamol);
        addUniqueDrug(result, ibuprofen);
        addUniqueDrug(result, ketarol);
        addUniqueDrug(result, saltWater);
        addUniqueDrug(result, sweetWater);
        addUniqueDrug(result, paracetamol);

        System.out.println(result.size());

        List<Pharmacy> sortResult = new ArrayList<>();
        sortResult.add(saltWater);
        sortResult.add(sweetWater);
        sortResult.add(ketarol);
        sortResult.add(paracetamol);
        sortResult.add(ibuprofen);
        Collections.sort(sortResult);
        System.out.println(sortResult);



    }
        //метод добавления обьекта в коллекцию при условии, что он уникален (по компонентам)
        public static void addUniqueDrug(Set<Pharmacy> pharmasies, Pharmacy o) {
            int count = 0;
            for (Pharmacy empty : pharmasies) {
                if (empty.equals(o) & empty.hashCode() == o.hashCode()) count++;
            }
            if (count == 0) pharmasies.add(o);
        }

}
