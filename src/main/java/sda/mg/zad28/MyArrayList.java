package sda.mg.zad28;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MyArrayList<E> extends ArrayList<E> {

    public MyArrayList(Collection<? extends E> c) {
        super(c);
    }

    public List<E> getEveryNthElement(int startIndex, int skip) {
        if (startIndex > size() - 1) {
            return Collections.emptyList();
        }

        List<E> result = new ArrayList<>();
        for (int i = startIndex; i < size(); i+= skip + 1) {
            result.add(get(i));
        }
        return result;
    }
}
