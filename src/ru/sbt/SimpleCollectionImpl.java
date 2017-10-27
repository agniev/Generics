package ru.sbt;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by гы on 27.10.2017.
 */
public class SimpleCollectionImpl<E> implements SimpleCollection<E> {

    private final List<E> list = new ArrayList<>();

    @Override
    public void add(E o) {
        list.add(o);
    }

    @Override
    public E getLast() {
        return list.get(list.size()-1);
    }
}
