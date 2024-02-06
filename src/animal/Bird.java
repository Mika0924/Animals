package animal;

public class Bird implements Flyable {
    @Override
    public double fly() {
        return 20.0; // скорость полета птицы в км/ч
    }
}
