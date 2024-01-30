package main;

import java.time.LocalDate;

public class Fish extends Animal{

    public Fish(String nickname, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickname, owner, birthDate, illness);
    }
}
