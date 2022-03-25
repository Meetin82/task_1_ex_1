package ru.vsu.cs.semenov_d_s;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Integer> list1 = readIntArrayFromConsole();
        List<Integer> list2 = readIntArrayFromConsole();

        BigDecimalAnalog bigDecimalAnalog1 = new BigDecimalAnalog(list1, list2);
        System.out.println("Разность чисел: ");
        writeNumberInConsole(bigDecimalAnalog1.subtract());
        System.out.println("\n" + "Сумма чисел: ");
        BigDecimalAnalog bigDecimalAnalog2 = new BigDecimalAnalog(list1, list2);
        writeNumberInConsole(bigDecimalAnalog2.add());
    }

    public static List<Integer> readIntArrayFromConsole() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Введите число, отделяя каждую цифру пробелом: ");
                String line = scanner.nextLine();
                List<Integer> list;
                String[] arr = line.split(" ");
                list = Utils.arrStringToListInt(arr);
                return list;
            } catch (Exception e) {
                System.out.print("Вы ошиблись, попробуйте снова! ");
            }
        }
    }

    private static void writeNumberInConsole(List<Integer> list) {
        for (Integer integer : list) {
            System.out.print(integer);
        }
    }
}
