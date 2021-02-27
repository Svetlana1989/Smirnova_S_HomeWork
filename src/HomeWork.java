//import java.util.Scanner;
//
//public class HomeWork {
//
//    // 1.Создать пустой проект в IntelliJ IDEA и прописать метод main().
//    public static void main(String[] args) {
//        System.out.println("Задача 3");
//        System.out.println(ur1_3(1, 1, 1, 1));
//        System.out.println("Задача 4");
//        System.out.println(ur1_4(3, 4));
//        System.out.println("Задача 5");
//        ur1_5(10);
//        System.out.println("Задача 6");
//        System.out.println(ur1_6(10));
//        System.out.println("Задача 7");
//        ur1_7("Михаил");
//        System.out.println("Задача 8");
//        ur1_8(2020);
//
//        // 2.Создать переменные всех пройденных типов данных и инициализировать их значения.
//        // Целые числа
//        byte byteVar1 = 127;
//        byte byteVar2 = -128;
//        short shortVar1 = 32767;
//        short shortVar2 = -32768;
//        int intVar1 = 2000000000;
//        int intVar2 = (int) 2e9;
//        long longVar1 = (long) 1e18;
//        long longVar2 = 123123123L;
//        // Вещественные числа
//        float floatVar = 123.445f;
//        double doubleVar = 1.5d;
//        // Символы
//        char symbol1 = '\'';
//        char symbol2 = 'a';
//        // Правда/ложь
//        boolean boolVar1 = true;
//        boolean boolVar2 = false;
//    }
//
//    // 3. Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
//    // где a, b, c, d – аргументы этого метода, имеющие тип float.
//    public static float ur1_3(float a, float b, float c, float d) {
//        return (a * (b + (c / d)));
//    }
//
//    // 4. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
//    // в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
//    public static boolean ur1_4(int a, int b) {
//        int c = a + b;
//        return ((20 >= c) && (c > 10));
//    }
//
//    // 5. Написать метод, которому в качестве параметра передается целое число, метод должен
//    // напечатать в консоль, положительное ли число передали или отрицательное.
//    // Замечание: ноль считаем положительным числом.
//    public static void ur1_5(int a) {
//        if (a >= 0) {
//            System.out.println("Число положительное");
//        } else {
//            System.out.println("Число отрицательное");
//        }
//    }
//
//    // 6. Написать метод, которому в качестве параметра передается целое число.
//    // Метод должен вернуть true, если число отрицательное,
//    // и вернуть false если положительное.
//    public static boolean ur1_6(int a) {
//        if (a < 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    // 7. Написать метод, которому в качестве параметра передается строка,
//    // обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
//    public static void ur1_7(String name) {
//        System.out.println("Привет, " + name + "!");
//    }
//
//    // 8. * Написать метод, который определяет, является ли год високосным,и выводит сообщение в консоль.
//    // Каждый 4-й год является високосным,кроме каждого 100-го, при этом каждый 400-й – високосный.
//    public static void ur1_8(int a) {
//        if (a % 4 == 0) {
//            if (a % 100 == 0) {
//                if (a % 400 == 0) {System.out.println("Год високосный");}
//                else {System.out.println("Год не високосный");}
//            } else {System.out.println("Год високосный");}
//        } else {
//            System.out.println("Год не високосный");}
//    }
//}
