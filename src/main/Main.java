package main;

import jdk.internal.access.JavaLangInvokeAccess;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Cat fluffy = new Cat("Буська", new Owner("Сергей"),LocalDate.of(2021, 10, 5), new Illness("Болеет"));
        Fish desire = new Fish("Желание", new Owner("Артем"), LocalDate.of(2023, 9, 15), new Illness("Болеет"));
        Eagle neon = new Eagle("Неон", new Owner("Люсен"), LocalDate.of(2019, 10, 10), new Illness("Выздровил"));
        Cat fluff = new Cat("Флаффи", new Owner("Сергей"),LocalDate.of(2021, 10, 5), new Illness("Болеет"));
        Fish craving  = new Fish("Туся", new Owner("Артем"), LocalDate.of(2023, 9, 15), new Illness("Болеет"));
        Eagle nine = new Eagle("Дарси", new Owner("Люсен"), LocalDate.of(2019, 10, 10), new Illness("Выздровил"));
        desire.Fly();
        fluffy.ToGo();
        fluffy.Swim();
        fluffy.Fly();
        neon.Swim();
    }
}
//Date date = new Date();
//
//SimpleDateFormat sdf = new SimpleDateFormat();
//String dateString = sdf.format(date);
//
//        System.out.println(dateString);