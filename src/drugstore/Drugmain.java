package drugstore;

import drugstore.components.Water;

import java.util.Iterator;

public class Drugmain {
    public static void main(String[] args) {
        Component water = new Water("Water", 10D, 1);
        Component azitronite = new Water("Azitronite", 2D, 14);
        Component penicillin = new Water("Penicillin", 1.6D, 6);

        Pharmacy p1 = new Pharmacy();
        p1.add(water, azitronite);

        Pharmacy p2 = new Pharmacy();
        p2.add(penicillin, water);

        Iterator<Component> iterator2 = p2;

        while (iterator2.hasNext()) {
            System.out.println(p2.next().toString());
        }
    }
}
