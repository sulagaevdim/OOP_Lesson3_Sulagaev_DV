package pharmacy;

import java.util.*;

public class Pharmacy implements Iterator<Component>, Comparable<Pharmacy>{
    public int index;

    private int price;
    private List<Component> components;

    public Pharmacy() {
        Random random = new Random();
        this.index = random.nextInt(100);
        this.components = new ArrayList<>();
    }
    public void addComponents(Component ... components){
        if (components.length == 0) System.out.println("Вы ничего не добавили");
        Collections.addAll(this.components, components);
    }

    @Override
    public boolean hasNext() {
        return index < components.size();
    }

    @Override
    public Component next() {
//        component c = components.get(index);
//        index++;
//        return c;
        return components.get(index++);
    }
    public boolean equals(Pharmacy o) {
        Collections.sort(this.components);
        Collections.sort(o.components);
        if (this.components.equals(o.components)) return true;
        else return false;
    }
    public int hashCode() {
        return components.toString().hashCode();
    }
    public List<Component> getComponents() {
        return components;
    }

    @Override
    public int compareTo(Pharmacy o) {
        return Integer.compare(this.index, o.index);
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "№='" + index + '\'' +
                ", Components='" + components.toString() + '\'' +
                "}" + "\n";
    }
}
