package main;

import java.time.LocalDate;

public class Cat extends Animal{
    public Cat(String nickname, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickname, owner, birthDate, illness);
    }

    public Cat(){
        super();
    }
}
