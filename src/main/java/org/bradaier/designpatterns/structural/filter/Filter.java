package org.bradaier.designpatterns.structural.filter;

import java.util.List;

/**
 * @author w-tomato
 * @description 过滤接口，用于过滤器模式，直接所有过滤类都实现这个接口就完事儿了
 * @date 2023/5/23
 */
public interface Filter {

    List<Person> filter(List<Person> personList);

}
