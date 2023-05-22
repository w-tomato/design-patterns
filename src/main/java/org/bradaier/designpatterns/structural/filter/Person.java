package org.bradaier.designpatterns.structural.filter;

import lombok.Data;

/**
 * @author w-tomato
 * @description
 * @date 2023/5/23
 */
@Data
public class Person {

    private String name;

    private String sex;

    public Person(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

}
