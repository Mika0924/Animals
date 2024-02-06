package animal;



public class Fish implements Swimable {
    public Fish(String name, Owner owner) {
        super();
    }

    @Override
    public double swim() {
        return 15.0;
    }
}
