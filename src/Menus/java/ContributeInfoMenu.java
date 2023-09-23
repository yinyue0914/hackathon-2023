package Menus.java;

import UserContributions.java.PlacesToEat;
import UserContributions.java.SpotsNearCampus;
import UserContributions.java.StudySpaces;

import java.util.Scanner;

public class ContributeInfoMenu extends AbstractMenu {


    @Override
    public void displayMenu() {
        System.out.println("Pick a section to contribute a spot in:");
        System.out.println("1: Study spaces");
        System.out.println("2: Places to eat");
        System.out.println("3: Spots near campus");

    }

    @Override
    public void handleUserInput() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a){
            case 1:
                SpotsNearCampusMenu spotsNearCampusMenu = new SpotsNearCampusMenu();
                spotsNearCampusMenu.makeHeader();
                spotsNearCampusMenu.makeDescription();
                spotsNearCampusMenu.addPlace(spotsNearCampusMenu.makeHeader(), spotsNearCampusMenu.makeDescription());
                break;
            case 2:
                PlacesToEatMenu placesToEatMenu = new PlacesToEatMenu();
                placesToEatMenu.makeHeader();
                placesToEatMenu.makeDescription();
                placesToEatMenu.addPlace(placesToEatMenu.makeHeader(), placesToEatMenu.makeDescription());
                break;
            case 3:
                StudySpacesMenu studySpacesMenu = new StudySpacesMenu();
                studySpacesMenu.makeHeader();
                studySpacesMenu.makeDescription();
                studySpacesMenu.addPlace(studySpacesMenu.makeHeader(), studySpacesMenu.makeDescription());
                break;
        }
    }


    public String makeHeader() {
        System.out.println("Enter post header");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public String makeDescription() {
        System.out.println("Enter post description");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }




}
