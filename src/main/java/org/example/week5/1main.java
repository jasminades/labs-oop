package org.example.week5;

public class Main {
    public static void main(String[] args) {
        CivilService civilService = new CivilService();
        MilitaryService militaryService = new MilitaryService(180);


        System.out.println("Civil Service Days Left: " + civilService.getDaysLeft());
        civilService.work();
        System.out.println("After working: " + civilService.getDaysLeft());

        System.out.println("Military Service Days Left: " + militaryService.getDaysLeft());
        militaryService.work();
        System.out.println("After working: " + militaryService.getDaysLeft());
    }
}
