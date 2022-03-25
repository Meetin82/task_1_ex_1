package ru.vsu.cs.semenov_d_s;

import java.util.ArrayList;
import java.util.List;

public class BigDecimalAnalog {
    List<Integer> listOfNum1;
    List<Integer> listOfNum2;

    public BigDecimalAnalog(List<Integer> listOfNum1, List<Integer> listOfNum2) {
        this.listOfNum1 = listOfNum1;
        this.listOfNum2 = listOfNum2;
    }

    public List<Integer> add() {
        fillWithZerosInList();
        List<Integer> listResult = new ArrayList<>();
        for (int i = 0; i < listOfNum1.size(); i++) {
            listResult.add(listOfNum1.get(i) + listOfNum2.get(i));
        }
        for (int i = listResult.size() - 1; i >= 0; i--) {
            if (listResult.get(i) > 9) {
                int tenOfNumber = listResult.get(i) / 10;
                if (i > 0) {
                    listResult.set(i - 1, listResult.get(i - 1) + tenOfNumber);
                    listResult.set(i, listResult.get(i) - tenOfNumber * 10);
                } else {
                    listResult.set(0, listResult.get(i) - tenOfNumber * 10);
                    listResult.add(0, tenOfNumber);
                }
            }
        }
        return listResult;
    }

    public List<Integer> subtract() {
        List<Integer> greaterNumber = new ArrayList<>(List.copyOf(compareNumbersForGreaterNumber()));
        List<Integer> tempGreaterNumber = List.copyOf(greaterNumber);
        List<Integer> lesserNumber;
        fillWithZerosInList();
        List<Integer> listResult = new ArrayList<>();
        if (listOfNum1.equals(listOfNum2)) {
            listResult.add(0);
            return listResult;
        }
        if (greaterNumber.equals(listOfNum1)) {
            lesserNumber = List.copyOf(listOfNum2);
        } else {
            lesserNumber = List.copyOf(listOfNum1);
        }
        for (int i = greaterNumber.size() - 1; i >= 0; i--) {
            int difference = greaterNumber.get(i) - lesserNumber.get(i);
            if (difference < 0) {
                greaterNumber.set(i - 1, greaterNumber.get(i - 1) - 1);
            }
            listResult.add(0, difference);
        }
        for (int i = listResult.size() - 1; i >= 0; i--) {
            if (listResult.get(i) < 0) {
                listResult.set(i, listResult.get(i) + 10);
            }
        }
        for (int i = 0; i < listResult.size(); i++) {
            if (listResult.get(0) == 0) {
                listResult.remove(0);
            }
        }
        if (!listOfNum1.equals(tempGreaterNumber)) {
            listResult.set(0, -1 * listResult.get(0));
        }
        return listResult;
    }

    private void fillWithZerosInList() {
        while (listOfNum1.size() != listOfNum2.size()) {
            if (listOfNum1.size() > listOfNum2.size()) {
                listOfNum2.add(0, 0);
            } else {
                listOfNum1.add(0, 0);
            }
        }
    }

    private List<Integer> compareNumbersForGreaterNumber() {
        List<Integer> greaterNumber = new ArrayList<>();
        if (listOfNum1.size() > listOfNum2.size()) {
            greaterNumber = listOfNum1;
        } else if (listOfNum2.size() > listOfNum1.size()) {
            greaterNumber = listOfNum2;
        } else {
            for (int i = 0; i < listOfNum1.size(); i++) {
                if (listOfNum1.get(i) > listOfNum2.get(i)) {
                    greaterNumber = listOfNum1;
                    return greaterNumber;
                }
                if (listOfNum2.get(i) > listOfNum1.get(i)) {
                    greaterNumber = listOfNum2;
                    return greaterNumber;
                }
            }
        }
        return greaterNumber;
    }
}
