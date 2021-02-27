//import com.sun.source.tree.ReturnTree;
//
//import javax.imageio.spi.ImageInputStreamSpi;
//import java.util.Random;
//import java.util.Scanner;
//import java.util.stream.IntStream;
//
//public class HomeWork3 {
//    public static void main(String[] args) {
//        guessNumber();
//        guessWord();
//
//
//    }
//
//    public static void guessNumber() {
//        /*** @param 1. Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3
////         * попытки угадать это число.
//         * При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число,чем загаданное,
//         * или меньше. После победы или проигрыша выводится запрос – «Повторить игру еще раз?
//         * 1 – да / 0 – нет»(1 – повторить, 0 – нет).*/
//        System.out.println("Угадайте число от 0 до 9. У вас есть три попытки.");
//        System.out.println("Введите число:");
//        Random rand = new Random();
//        int a = rand.nextInt(10);
//        System.out.println("(Подсказка) Число, которое мы угадываем:" + " " + a);
//        Scanner in = new Scanner(System.in);
//        int x = 0;
//        for (int i = 0; i < 3; i++) {
//            System.out.println("Попытка №" + " " + (i + 1));
//            x = in.nextInt();
//            if (x >= 0 && x <= 9 || x == 0 || x == 9) {
//                if (x == a) {
//                    System.out.println("Вы угадали! Поздравляем!");
//                    break;
//                }
//                if (x > a) {
//                    System.out.println("Вы ввели число, которое больше загаданного");
//                }
//                if (x < a) {
//                    System.out.println("Вы ввели число, которое меньше загаданного");
//                }
//            } else {
//                System.out.println("Вы ввели число вне диапазона");
//            }
//        }
//
//        System.out.println("Повторить игру еще раз? 1 - Да, 0 - Нет");
//        int com = in.nextInt();
//        if (com == 1) guessNumber();
//        else {
//            System.out.println("Спасибо за игру!");
//        }
//        System.out.println();
//
//    }
//
//    public static void guessWord() {
//        /**
//         * @param 2. Создать массив из слов String[] words = {...}.
//         * При запуске программы компьютер загадывает слово,запрашивает ответ у пользователя,
//         * сравнивает его с загаданным словом и сообщает, правильно ли ответил пользователь.
//         * Если слово не угадано, компьютер показывает буквы, которые стоят на своих местах.
//         * apple – загаданное
//         * apricot - ответ игрока
//         * ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
//         * Для сравнения двух слов посимвольно можно пользоваться:
//         * String str = "apple";
//         * char a = str.charAt(0); - метод вернет char, который стоит в слове str на первой позиции
//         * Играем до тех пор, пока игрок не отгадает слово.
//         * Используем только маленькие буквы.*/
//
//        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
//        "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
//        "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
//        Random rand = new Random();
//        String indexWord = words[rand.nextInt(words.length)];
//        System.out.println("Угадайте слово");
//        System.out.println("Введите слово:");
//        System.out.println("(Подсказка) Слово, которое мы угадываем:" + " " + indexWord);
//        Scanner in = new Scanner(System.in);
//
//        while (true){
//            String result = "";
//            String word = in.nextLine();
//            System.out.println("Вы ввели слово:" + " " + word);
//            int minWordLength = Math.min(indexWord.length(), word.length());
//            int latticeQuantity = 15 - minWordLength;
//
//            for (int i = 0; i < minWordLength; i++) {
//                if (indexWord.charAt(i) == word.charAt(i)) {
//                    result += indexWord.charAt(i);
//                } else {
//                    result += "#";
//                }
//            }
//            if (result.equals(indexWord)) {
//                System.out.println("Вы отгадали слово:" + " " + indexWord);
//                break;
//            } else {
//                System.out.print("Итог:" + " " + result + ("#".repeat(latticeQuantity)));
//                System.out.println();
//                System.out.print("Попробуйте еще раз");
//            }
//            System.out.println();
//        }
//    }
//
//}
//
//
