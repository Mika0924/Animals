package hw4.linkedlist;


public class Main {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.addFirst("John");
        names.addLast("Alice");
        names.addLast("Alic");
        names.addLast("joo");
        names.addLast("Ale");

        for (int i = 0; i < names.size();
             i++) {
            System.out.println(names.get(i));
        }

        System.out.println(STR."Size: \{names.size()}"); // 2

        String name = names.get(3); // "Alice"

        System.out.println(STR."Name at index 1: \{name}");



    }
}

