package com.libraryproject.libraryProject.menu.domain;

import java.util.Scanner;

public class AuthorsMenu {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the authors' menu! Please, choose what do you want to do! ");
        System.out.println("1. Add an author ->");
        System.out.println("2. Remove an author ->");
        System.out.println("3. Find author by ID ->");
        System.out.println("4. Find author by name ->");
        System.out.println("5. Update any information about author by ID ->");
        System.out.println("6. Show all authors ->");
        System.out.println("7. Choose that for to return in MAIN MENU for librarians:");//return in main menu(RestaurantProgramList -> mainAction)
        System.out.println("0. Exit!");
        System.out.println();
        int inputSelection = scanner.nextInt();
        switch (inputSelection) {
            case 1:
        }}
}
