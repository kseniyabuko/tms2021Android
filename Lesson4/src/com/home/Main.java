package com.home;

import com.home.model.Address;
import com.home.model.Person;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        Person konstantin = new Person(30, "Konstantin", 169, "Male");
        Address konstantinsAddress = new Address("Belarus", "Vitebsk");
        konstantin.setAddress(konstantinsAddress);
//        konstantin.info();

        Person gleb = new Person(40, "Gleb", 190, "Male");
        Address glebsAddress = new Address("Belarus", "Vitebsk");
        gleb.setAddress(glebsAddress);
//        gleb.info();

        Person oleg = new Person(38, "Oleg", 189, "Male");
        Address olegsAddress = new Address("Belarus", "Braslav");
        oleg.setAddress(olegsAddress);

        Person vadim = new Person(30, "Vadim", 180, "Male");
        Address vadimsAddress = new Address("Belarus", "Smorgon");
        vadim.setAddress(vadimsAddress);

        Person kseniya = new Person(32, "Kseniya", 168, "Female");
        Address kseniyaAddress = new Address("Belarus", "Minsk");
        kseniya.setAddress(kseniyaAddress);

        Person eduard = new Person(19, "Eduard", 184, "Male");
        Address eduardAddress = new Address("Belarus", "Minsk");
        eduard.setAddress(eduardAddress);

        PersonRegistry registry = new PersonRegistry(new Person[]{gleb, konstantin, oleg, vadim, kseniya, eduard});

        System.out.println(registry.countPeople(new Address("Belarus", "Vitebsk")));
        System.out.println(registry.countPeople(new Address("Belarus", "Minsk")));
        System.out.println(registry.countPeople("Belarus"));


        List<Person> personList = registry.getPeople(new Address("Belarus", "Minsk"));
        for (Person person : personList) {
            System.out.println(person.getName());
        }
        MilitaryOffice military2021 = new MilitaryOffice(registry);
        military2021.showSoldiers(new Address("Belarus", "Minsk"));
    }

}