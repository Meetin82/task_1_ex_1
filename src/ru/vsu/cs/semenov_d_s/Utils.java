package ru.vsu.cs.semenov_d_s;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class Utils {

    public static List<Integer> arrStringToListInt(String[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(parseInt(arr[i]));
        }
        return list;
    }

    public static List<Integer> arrIntToListInt(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        return list;
    }
}
