package controllers;

import models.Person;

public class PersonController {
    public PersonController() {

    }

    // Metodo sortByName
    // Burbuja mejorada
    public void sortByName(Person[] people) {
        for (int i = 0; i < people.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < people.length - 1 - i; j++) {
                if (people[j].getName().compareTo(people[j + 1].getName()) > 0) {
                    Person temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                    swapped = true;
                }
                if (swapped) {
                    i = -1;
                    break;
                }
            }
        }
    }
}