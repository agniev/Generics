package ru.sbt;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * Created by гы on 27.10.2017.
 */
public class CollectionUtils {

    public static<E> E nonNull(E o){
        if (o == null){
            throw new NullPointerException();
        } else return o;
    }

    public static<E> List<E> join(List<E> list1, List<E> list2){
        List result = new ArrayList();
        result.addAll(list1);
        result.addAll(list2);
        return result;
    }

    public static<E> void addAll(List<? extends E> source, List<? super E> destination){
        destination.addAll(source);
    }

    public static<E> E max(List<? extends  E> list, Comparator<? super E> comparator){
        E max = list.get(0);
        for (E i: list){
            if (comparator.compare(i, max) > 0){
                max = i;
            }
        }
        return max;
    }
}
