//import java.util.Scanner;
//import java.util.stream.IntStream;
//
//public class HomeWork2 {
//    public static void main(String[] args) {
//
//        // 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//        // С помощью цикла и условия заменить 0 на 1, 1 на 0;
//        System.out.println("Задание 1");
//        System.out.println("1 1 0 0 1 0 1 1 0 0");
//        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 0) {
//                arr[i] = 1;
//            } else arr[i] = 0;
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//
//        // 2. Задать пустой целочисленный массив размером 8.
//        // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
//        System.out.println("Задание 2");
//        System.out.println("0 3 6 9 12 15 18 21");
//        int[] arr2 = new int[8];
//        arr2[0] = 0;
//        for (int i = 1; i < arr2.length; i++) {
//            arr2[i] = arr2[i - 1] + 3;
//        }
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.print(arr2[i] + " ");
//        }
//        System.out.println();
//
//        // 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
//        // и числа меньшие 6 умножить на 2;
//        System.out.println("Задание 3");
//        System.out.println("1 5 3 2 11 4 5 2 4 8 9 1");
//        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//        for (int i = 0; i < arr3.length; i++) {
//            if (arr3[i] < 6) {
//                arr3[i] = arr3[i] * 2;
//            }
//            System.out.print(arr3[i] + " ");
//        }
//        System.out.println();
//
//        // 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое)
//        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
//        System.out.println("Задание 4");
//        int[][] arr4 = {{14, 56, 13, 17}, {70, 0, 13, 12}, {8, 17, 24, 3}, {12, 6, 9, 8}};
//        for (int i = 0; i < arr4.length; i++) {
//            for (int j = 0; j < arr4.length; j++) {
//                if (i == j || i == arr4.length - 1 - j) {
//                    arr4[i][j] = 1;
//                } else {
//                }
//                System.out.printf("%4d", arr4[i][j]);
//            }
//            System.out.println();
//        }
//
//        // 5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы
//        System.out.println("Задание 5");
//        System.out.println("1 5 3 2 11 4 5 2 4 8 9 1");
//        int[] arr5 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//        int min = arr5[0];
//        int max = arr5[0];
//        for (int i = 0; i < arr5.length; i++) {
//            if (max <= arr5[i]) {
//                max = arr5[i];
//            }
//            if (min >= arr5[i]) {
//                min = arr5[i];
//            }
//        }
//        System.out.println(min);
//        System.out.println(max);
//
//        // 6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
//        // метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
//        // Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
//        // граница показана символами ||, эти символы в массив не входят.
//        System.out.println("Задание 6");
//        System.out.println("2 2 2 1 2 2 10 1");
//        int sum = 0;
//        int sumEnd = 0;
//        int[] arr6 = {2, 2, 2, 1, 2, 2, 10, 1};
//        for (int i = 0; i < arr6.length; i++) {
//            sum = sum + arr6[i];
//            sumEnd = IntStream.of(arr6).sum() - sum;
//            if (sum == sumEnd){
//                break;
//            }
//        }
//        System.out.println(sum);
//        System.out.println(sumEnd);
//    }
//}
//
