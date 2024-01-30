package main;

import java.time.LocalDate;

public class Eagle extends Animal{
    public Eagle(String nickname, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickname, owner, birthDate, illness);
    }

}
