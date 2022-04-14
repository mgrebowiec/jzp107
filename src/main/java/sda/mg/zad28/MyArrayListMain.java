package sda.mg.zad28;

import java.util.Arrays;
import java.util.List;

public class MyArrayListMain {
    public static void main(String[] args) {
        MyArrayList<Integer> sampleList = new MyArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        List<Integer> result = sampleList.getEveryNthElement(7, 5);
        System.out.println(result);
    }
}
