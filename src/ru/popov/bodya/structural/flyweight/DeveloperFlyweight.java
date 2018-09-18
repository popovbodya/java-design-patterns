package ru.popov.bodya.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFlyweight {

    private final Map<Specialty, Developer> mDeveloperMap;

    public DeveloperFlyweight() {
        mDeveloperMap = new HashMap<>();
    }

    public Developer getDeveloperBySpecialty(Specialty specialty) {
        Developer developer = mDeveloperMap.get(specialty);
        if (developer == null) {
            switch (specialty) {
                case CPP:
                    System.out.println("Hiring C++ developer");
                    developer = new CppDeveloper();
                    break;
                case JAVA:
                    System.out.println("Hiring Java developer");
                    developer = new JavaDeveloper();
                    break;
                case KOTLIN:
                    System.out.println("Hiring Kotlin developer");
                    developer = new KotlinDeveloper();
            }
            mDeveloperMap.put(specialty, developer);
        }
        return developer;
    }
}
