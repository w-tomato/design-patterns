package org.bradaier.designpatterns.structural.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author w-tomato
 * @description 男性过滤器
 * @date 2023/5/23
 */
public class MaleFilter implements Filter{

    @Override
    public List<Person> filter(List<Person> personList) {
        List<Person> people = new ArrayList<>();
        personList.forEach(x -> {
            if ("MALE".equalsIgnoreCase(x.getSex())) {
                people.add(x);
            }
        });
        return people;
    }
}
