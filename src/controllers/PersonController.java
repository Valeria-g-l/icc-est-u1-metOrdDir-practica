package controllers;

import models.Person;

public class PersonController {

    public void sortByName(Person[] people) {
        int n = people.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (people[j].getName().compareTo(people[j + 1].getName()) > 0) {
                    // swap people[j] and people[j+1]
                    Person temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                }
            }
        }
    }

}
