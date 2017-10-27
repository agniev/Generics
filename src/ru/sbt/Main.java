package ru.sbt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static ru.sbt.CollectionUtils.nonNull;

/**
 * Created by гы on 27.10.2017.
 */
public class Main {
    public static void main(String[] args) {
//        testSimpleCollection();
//        testCompare();
//        testNonNull();
//        testJoin();
        testAddAll();
    }

    private static void testJoin() {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(4,5,6));
        System.out.println(CollectionUtils.join(list1,list2).toString());
//        List<String> list3 = Arrays.asList("sada","asd");
//        System.out.println(CollectionUtils.join(list1,list3).toString());
    }

    private static void testAddAll() {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(4,5,6));

        CollectionUtils.addAll(list1,list2);
        System.out.println(list2.toString());
    }

    private static void testNonNull() {
        List<Integer> list = Arrays.asList(1,2,3);
        String x = nonNull("Hello");
        System.out.println("nonNull: "+ x);

        Integer y = nonNull(list.get(0));
        System.out.println("nonNull: "+ y);

        String z = nonNull(null);
        System.out.println("nonNull: "+ z);
    }

    private static void testCompare() {
        //        Integer maxInteger = CollectionUtils.max(Arrays.asList(1,2,3));

        Person maxPerson = CollectionUtils.max(Arrays.asList(
                new Person(10),
                new Person(15)),
                new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return Integer.compare(o1.getAge(), o2.getAge());
                    }
                });

        System.out.println(maxPerson.getAge());
    }

    private static void testSimpleCollection() {
        SimpleCollection<Integer> collection = new SimpleCollectionImpl();
        collection.add(1);
        collection.add(3);

        System.out.println(collection.getLast());
    }
}
