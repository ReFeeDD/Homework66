package Homework5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Homework5 Employee1 = new Homework5("Andrey", "QA", "123@mail.ru",
                3752512, 1200, 25);
        Homework5 Employee2 = new Homework5("Vasya", "QA", "777@mail.ru",
                3321454, 800, 32);
        Homework5 Employee3 = new Homework5("Anton", "QA", "sas@mail.ru",
                432567, 1800, 38);
        Homework5 Employee4 = new Homework5("Zhenya", "QA", "lol@mail.ru",
                12546544, 1400, 23);
        Homework5 Employee5 = new Homework5("Vitya", "QA", "sabaka@mail.ru",
                3543267, 500, 45);

        Homework5[] Person = new Homework5[5];
        Person[0] = Employee1;
        Person[1] = Employee2;
        Person[2] = Employee3;
        Person[3] = Employee4;
        Person[4] = Employee5;
        for (int i = 0; i < Person.length; i++) {

            if (Person[i].age > 30) {

                System.out.println("Старше 30 лет : " + Person[i].Name + " " + Person[i].Salary + " " +
                        Person[i].Email +" " + Person[i].Position + " " + Person[i].age);

            }

        }
    }
}