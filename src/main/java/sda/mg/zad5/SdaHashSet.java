package sda.mg.zad5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class SdaHashSet extends HashSet<String> {

    private List<String> elements = new ArrayList<>();

    @Override
    public boolean add(String s) {
        elements.add(s);
        return super.add(s);
    }

    @Override
    public boolean remove(Object o) {
        return super.remove(o);
    }

    @Override
    public boolean contains(Object o) {
        return super.contains(o);
    }

    @Override
    public void clear() {
        super.clear();
    }

    @Override
    public int size() {
        return super.size();
    }

    public void printElements() {
        System.out.println(elements);
    }
}
