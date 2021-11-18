package dmlab1;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] universe = {1, 2, 3, 4, 5, 6, 7, 8};
        Operations operations = new Operations(universe);

        System.out.println("Input first array");
        int[] arr1 = scanner(universe);
        System.out.println("Input second array");
        int[] arr2 = scanner(universe);

        System.out.println("1.\n Об'єднання множин");
        PrintArray(operations.union(arr1, arr2));
        System.out.println("Перетин множин");
        PrintArray(operations.intersection(arr1, arr2));
        System.out.println("Різниця множин");
        PrintArray(operations.difference(arr1, arr2));
        System.out.println("Доповнення 1 множини");
        PrintArray(operations.compliment(arr1));
        System.out.println("Доповнення 2 множини");
        PrintArray(operations.compliment(arr2));
        System.out.println("Симетрична різниця");
        PrintArray(operations.symmetricalDifference(arr1, arr2));
        System.out.println("Декардовий добуток");
        PrintDecard(operations.decardMultiply(arr1, arr2));
        System.out.println("\n2.\n1 Перевірка на підмножину");
        System.out.println(operations.isSubset(arr1, arr2));
        System.out.println("Рівність множин");
        System.out.println(operations.equals(arr1, arr2));
        System.out.println("\n3.\nМножина 1 у виг. бітового рядка");
        PrintArray(operations.reverse(operations.toBit(arr1)));
        System.out.println("Множина 2 у виг. бітового рядка");
        PrintArray(operations.reverse(operations.toBit(arr2)));
        System.out.println("Об'єднання у вигляді бітового рядка");
        PrintArray(operations.reverse(operations.unionBit(arr1, arr2)));
        System.out.println("Перетин у вигляді бітового рядка");
        PrintArray(operations.reverse(operations.intersectionBit(arr1, arr2)));
        System.out.println("Сим.  бітова різниця");
        PrintArray(operations.reverse(operations.symmetricalDifferenceBit(arr1, arr2)));
        System.out.println("Бітова різниця");
        PrintArray(operations.symmetricalDifference(arr1, arr2));
        System.out.println("Об'єднання у вигляді масиву");
        PrintArray(operations.unionBit(arr1, arr2));
        System.out.println("Сим  бітова різниця у вигляді масиву");
        PrintArray(operations.reverse(operations.toArray(operations.symmetricalDifferenceBit(arr1, arr2))));
    }

    static int[] scanner(int[] universe) {
        int[] res;
        Scanner scanner = new Scanner(System.in);
        res = StringToIntArr(scanner.nextLine());
        Exceptions.isSet(res);
        Exceptions.isUniverse(res, universe);
        return res;

    }

    static int[] StringToIntArr(String strSet) {
        String[] strSetArr = strSet.split(" ");
        int[] userSet = new int[strSetArr.length];
        for (int i = 0; i < userSet.length; i++) {
            userSet[i] = Integer.parseInt(strSetArr[i]);
        }
        return userSet;
    }

    static void PrintDecard(int[][] input) {
        for (int[] el : input) {
            System.out.print(Arrays.toString(el) + ", ");
        }

    }

    static void PrintArray(int[] input) {
        System.out.println(Arrays.toString(input));
    }
}