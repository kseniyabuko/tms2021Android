package com.home;

import com.home.model.Address;
import com.home.model.Person;

public class MilitaryOffice {
    private PersonRegistry registry;

    public MilitaryOffice(PersonRegistry registry) {
        this.registry = registry;
    }

    public void showSoldiers(Address address) {
        System.out.println("Welcome to the Army!");
        for (Person person : registry.getCitizens()) {
            Address personAddress = person.getAddress();
            if (personAddress.getCountry() == "Belarus") {
                if (person.getGender() == "Male") {
                    if (person.getAge() >= 18 && person.getAge() <= 27) {
                        System.out.println(person.getName());
                    }
                }
            }
        }
    }

}
