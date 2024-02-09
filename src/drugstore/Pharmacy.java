package drugstore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pharmacy implements Iterator<Pharmacy> {
    private List<Pharmacy> components = new ArrayList<>();
    private int index = 0;

    public void addComponents(Pharmacy ... components) {
        for(Pharmacy c : components){
            this.components.add(c);
        }
    }

    @Override
    public boolean hasNext() {
        return index < components.size();
    }

    @Override
    public Pharmacy next() {
        return components.get(index++);
    }
}