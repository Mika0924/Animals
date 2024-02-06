package animal;
import java.util.Arrays;
import java.util.List;

public class Animal {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Bird bird = new Bird();
        Fish fish = new Fish("fish", new Owner("Fish"));


        System.out.println(STR."Скорость бега собаки: \{dog.run()}");
        System.out.println(STR."Скорость полета птицы: \{bird.fly()}");
        System.out.println(STR."Скорость плавания рыбы: \{fish.swim()}");//

        List<Goable> goableList = List.of(new Dog(), new Dog());
        List<Flyable> flyableList = Arrays.asList(new Bird());
        List<Swimable> swimableList = Arrays.asList(new Fish("1", new Owner("aaa")),new Fish("2", new Owner("fff")));
//        можно так же заполнить остальные показал пример на 1


        printGoable(goableList);
        printSwimable(swimableList);
        printFlyable(flyableList);
    }
    private static void printGoable(List<Goable> goableList) {
        for (Goable goable : goableList) {
            System.out.println(goable.getClass().getSimpleName() + '-' + goable.run());
        }
    }

    private static void printFlyable(List<Flyable> flyableList) {
        for (Flyable flyable : flyableList) {
            System.out.println(flyable.getClass().getSimpleName() + '-' + flyable.fly());
        }
    }

    private static void printSwimable(List<Swimable> swimableList) {
        for (Swimable swimable : swimableList) {
            System.out.println(swimable.getClass().getSimpleName() + '-' + swimable.swim());
        }
    }
}


