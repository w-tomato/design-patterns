package org.bradaier.designpatterns.structural.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author w-tomato
 * @description
 * @date 2023/5/23
 */
public class Test {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Robert","Male"));
        people.add(new Person("John","Male"));
        people.add(new Person("Laura","Female"));
        people.add(new Person("Diana","Female"));
        people.add(new Person("Mike","Male"));
        people.add(new Person("Bobby","Male"));

        new MaleFilter().filter(people).forEach(System.out::println);
        System.out.println("------------");
        new FemaleFilter().filter(people).forEach(System.out::println);


    }

}
