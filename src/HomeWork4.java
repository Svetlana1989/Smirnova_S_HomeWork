//import java.util.Scanner;
//public class HomeWork4 {
//    public static void main(String[] args) {
//        System.out.println("Вы в игре Крестики Нолики");
//        fillMap();
//        printMap();
//        game();
//    }
//
//    // Константы
//    private static final char X = 'X';
//    private static final char O = '0';
//    private static final char DEFAULT = '_';
//    private static final char DELIMITER = '|';
//    private static int steps;
//    private static char[][] MAP;
//
//    // Наполняем карту _
//    private static void fillMap() {
//        System.out.println("Введите размерность размерность поля, x>=2:");
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        if (n>=2) {
//            MAP = new char[n][n];
//            System.out.println("На каждом ходу Вы вводите два числа: номер строки и номер столбца");
//            for (int i = 0; i < MAP.length; i++) {
//                for (int j = 0; j < MAP.length; j++) {
//                    MAP[i][j] = DEFAULT;
//                }
//            }
//        } else {
//            System.out.println("Неверная размерность поля");
//            fillMap();
//        }
//    }
//
//    // Рисуем карту |_|_|_|
//    //              |_|_|_|
//    //              |_|_|_|
//    private static void printMap() {
//        for (int i = 0; i < MAP.length; i++) {
//            for (int j = 0; j < MAP.length; j++) {
//                System.out.print(DELIMITER + "" + MAP[i][j]);
//            }
//            System.out.println(DELIMITER);
//        }
//    }
//
//    private static void game() {
//        steps=0;
//        Scanner in = new Scanner(System.in);
//        while (true) {
//            System.out.println("Делайте Ваш ход:");
//            int x = in.nextInt(), y = in.nextInt();
//            x--;
//            y--;
//            if (validInput(x, y)) {
//                MAP[x][y] = X;
//                steps++;
//                if (isWin(X)) {
//                    System.out.println("Вы победили!");
//                    return;
//                }
//                if (steps == MAP.length * MAP.length){
//                    System.out.println("Ничья");
//                    return;
//                }
//                movePC();
//                if (isWin(O)){
//                    System.out.println("Вы проиграли!");
//                    return;
//                }
//
//            } else {
//                System.out.println("Неверный ход! Будьте повнимательнее!");
//            }
//                printMap();
//        }
//    }
//
//    private static void movePC() {
//        int x, y;
//        do {
//            x = (int)(Math.random() * MAP.length);
//            y = (int)(Math.random() * MAP.length);
//        } while (!validInput(x,y));
//        MAP[x][y] = O;
//        steps++;
//        }
//
//    private static boolean validInput (int x, int y){
//        boolean inMap = x >= 0 && y >= 0 && x < MAP.length && y < MAP.length;
//        return inMap && MAP[x][y] == DEFAULT;
//    }
//
//    private static boolean isWin(char X) {
//          for (int i = 0; i < MAP.length; i++) {
//              boolean diag1 = true;
//              boolean diag2 = true;
//              boolean lineI = true;
//              boolean lineJ = true;
//              for (int j = 0; j < MAP.length; j++) {
//                  lineI = lineI && MAP[i][j] == X;
//              // lineI &= MAP[i][j] == X;
//              // Аккумуляторы (аккумулируем все сравнения)
//                  lineJ &= MAP[j][i] == X;
//                  diag1 &= MAP[j][j] == X;
//                  diag2 &= MAP[j][MAP.length-j-1] == X;
//              }
//              if (lineI || lineJ || diag1 || diag2){
//                  return true;
//              }
//          }
//        return false;
//    }
//}
//
//
//
//
//
//
//
//
//
