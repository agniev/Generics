package ru.sbt;

import org.omg.CORBA.Object;

/**
 * Created by гы on 27.10.2017.
 */
public interface SimpleCollection<E> {
    void add(E o);

    E getLast();
}
