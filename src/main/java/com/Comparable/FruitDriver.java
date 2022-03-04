package com.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FruitDriver {
    public static void main(String[] args)
    {
        Fruit f1 = new Fruit("Apple","Desc", 10);
        Fruit f2 = new Fruit("Pear","Desc", 10);
        Fruit f3 = new Fruit("Orange","Desc", 50);
        Fruit f4 = new Fruit("Banana","Desc", 100);
        Fruit f5 = new Fruit("Grape","Desc", 1);
        Fruit f6 = new Fruit("Apple","Desc", 100);

        List<Fruit> fruits = new ArrayList<>();
        fruits.add(f1);
        fruits.add(f2);
        fruits.add(f3);
        fruits.add(f4);
        fruits.add(f5);
        fruits.add(f6);

        Collections.sort(fruits);

        fruits.forEach(System.out::println);

    }
}
