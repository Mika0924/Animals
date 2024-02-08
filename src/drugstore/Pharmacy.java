package drugstore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pharmacy implements Iterator<Component> {
    private List<Component> components = new ArrayList<>();
    private int index;


    public  void add(Component ... components) {
        for(Component c : components){
            this.components.add(c);
        }
    }

    @Override
    public boolean hasNext() {
        return index <= components.size();
    }

    @Override
    public Component next() {
        return components.get(index++);
    }
}
