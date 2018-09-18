package ru.popov.bodya.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * Flyweight позволяет вместить бóльшее количество объектов в отведённую оперативную память.
 * Легковес экономит память, разделяя общее состояние объектов между собой
 * вместо хранения одинаковых данных в каждом объекте.
 */
public class FlyweightUsageExample {

    public static void main(String[] args) {
        DeveloperFlyweight flyweight = new DeveloperFlyweight();
        List<Developer> developerList = new ArrayList<>();
        developerList.add(flyweight.getDeveloperBySpecialty(Specialty.JAVA));
        developerList.add(flyweight.getDeveloperBySpecialty(Specialty.JAVA));
        developerList.add(flyweight.getDeveloperBySpecialty(Specialty.JAVA));
        developerList.add(flyweight.getDeveloperBySpecialty(Specialty.CPP));
        developerList.add(flyweight.getDeveloperBySpecialty(Specialty.JAVA));
        developerList.add(flyweight.getDeveloperBySpecialty(Specialty.CPP));
        developerList.add(flyweight.getDeveloperBySpecialty(Specialty.KOTLIN));
        developerList.add(flyweight.getDeveloperBySpecialty(Specialty.KOTLIN));
        developerList.add(flyweight.getDeveloperBySpecialty(Specialty.KOTLIN));
        developerList.add(flyweight.getDeveloperBySpecialty(Specialty.KOTLIN));
        developerList.add(flyweight.getDeveloperBySpecialty(Specialty.KOTLIN));
        developerList.add(flyweight.getDeveloperBySpecialty(Specialty.CPP));
        developerList.add(flyweight.getDeveloperBySpecialty(Specialty.CPP));

        System.out.println(developerList.size());
    }

}
