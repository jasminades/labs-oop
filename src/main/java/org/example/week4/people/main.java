package org.example.week4.people;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void printDepartment(List<Person> people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }

    public static void main(String[] args) {

        people.Person pekka = new people.Person("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa");
        people.Person esko = new people.Person("Esko Ukkonen", "Mannerheimintie Street 15 00100 Helsinki");
        System.out.println(pekka);
        System.out.println(esko);

        Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki");
        System.out.println(olli);
        System.out.println("credits " + olli.credits());
        olli.study();
        System.out.println("credits " + olli.credits());

        Teacher pekkaTeacher = new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200);
        Teacher eskoTeacher = new Teacher("Esko Ukkonen", "Mannerheimintie Street 15 00100 Helsinki", 5400);
        System.out.println(pekkaTeacher);
        System.out.println(eskoTeacher);

        List<Person> department = new ArrayList<>();
        department.add(pekka);
        department.add(esko);
        department.add(olli);
        department.add(pekkaTeacher);
        department.add(eskoTeacher);

        printDepartment(department);
    }
}
