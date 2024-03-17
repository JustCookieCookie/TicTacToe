//Java Program
//File: TicTacToe

import java.util.Scanner;

class TicTacToe {
    public static void main(String[] args) {

        //Начальный текст
        System.out.println("Это игра в Крестики-Нолики!");

        //Данные
        int strips = 0;
        int line = 0;
        int ygrek = 1;
        int ticTacToe = 10;
        boolean question = true;
        int controllYX = 0;
        int x = 0;
        int y = 0;
        String userAnswer = "yes";

        //Создаем массив
        String field[][] = new String [3][3];

        //Назначаем массив
        field[0][0] = " ";
        field[0][1] = " ";
        field[0][2] = " ";
        field[1][0] = " ";
        field[1][1] = " ";
        field[1][2] = " ";
        field[2][0] = " ";
        field[2][1] = " ";
        field[2][2] = " ";


//Цикл повтора игры
do {
        Scanner scanner = new Scanner(System.in); //Сканнер
        //Данные новые
        strips = 0;
        line = 0;
        ygrek = 1;
        ticTacToe = 10;
        question = true;
        controllYX = 0;
        x = 0;
        y = 0;

    //За кого играем
        do {
            System.out.println("----------------------");
            System.out.print("За кого играем (x или o)? ");
            String userXO = scanner.nextLine();
            if (userXO.equals("o") || userXO.equals("O")) {
                ticTacToe = 1;
                break;
            } else if (userXO.equals("x") || userXO.equals("X")) {
                ticTacToe = 0;
                break;
            } else {
                System.out.println("Я вас не понял!");
            }
        } while (true);


        //Пишем кординаты x
        System.out.println("    1   2   3");
        System.out.println();

        //Выводим его на экран
        for (int i = 0; i < field.length; i++) {
            System.out.print(ygrek + "   ");   //Пишем кординаты y
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
                strips++;
                if (strips == 0 || strips == 1 || strips == 2) {
                    System.out.print(" | ");  //Пишем |
                }
            }

        //Пишем -
        System.out.println();
        line++;
        ygrek++;

        if (line == 1 || line == 2) {
            System.out.print("   ");
            for (int strip = 0; strip < 11; strip++) {
                System.out.print("-");
            }
        }

        System.out.println();
        strips = 0;
    }
        System.out.println("----------------------");

    //Огромный цикл ходьбы
    do {

        //Делаем проверку ничьи!!!!!!!
        if ((field[0][0].equals("x") || field[0][0].equals("o")) &&
            (field[0][1].equals("x") || field[0][1].equals("o")) &&
            (field[0][2].equals("x") || field[0][2].equals("o")) &&
            (field[1][0].equals("x") || field[1][0].equals("o")) &&
            (field[1][1].equals("x") || field[1][1].equals("o")) &&
            (field[1][2].equals("x") || field[1][2].equals("o")) &&
            (field[2][0].equals("x") || field[2][0].equals("o")) &&
            (field[2][1].equals("x") || field[2][1].equals("o")) &&
            (field[2][2].equals("x") || field[2][2].equals("o"))) {
            ticTacToe = 3;
            System.out.println("НИЧЬЯ!");
        }

        //Ходят x
        x = 0;
        y = 0;
        if (ticTacToe == 0) {
            System.out.println("Ходят крестики!");

            //Спрашиваем кординаты x
            do {
                if (x > 3 || x < 1) {
                    if (controllYX >= 1) {
                        System.out.println();
                        System.out.println("Вводите реальные координаты!");
                        System.out.println();
                    }
                    System.out.print("Введите координаты x: ");
                    x = scanner.nextInt();
                    controllYX++;
                } else {
                    break;
                }
            } while (true);

            controllYX = 0;

            //Спрашиваем кординаты y
            do {
                if (y > 3 || y < 1) {
                    if (controllYX >= 1) {
                        System.out.println();
                        System.out.println("Вводите реальные координаты!");
                        System.out.println();
                    }
                    System.out.print("Введите координаты y: ");
                    y = scanner.nextInt();
                    controllYX++;
                } else {
                    break;
                }
            } while (true);


            //Перерисовываем доску
            System.out.println();
            strips = 0;
            line = 0;
            ygrek = 1;
            ticTacToe = 0;
            question = true;
            controllYX = 0; //Новые данные

            x--;
            y--;
            if (field[y][x] == " ") {
                ticTacToe = 1;
                field[y][x] = "x";

            //Пишем кординаты x
            System.out.println("    1   2   3");
            System.out.println();

            //Выводим его на экран
            for (int i = 0; i < field.length; i++) {
                System.out.print(ygrek + "   ");   //Пишем кординаты y
                for (int j = 0; j < field[i].length; j++) {
                    System.out.print(field[i][j]);
                    strips++;
                    if (strips == 0 || strips == 1 || strips == 2) {
                        System.out.print(" | ");  //Пишем |
                        }
                }

            //Пишем -
            System.out.println();
            line++;
            ygrek++;

            if (line == 1 || line == 2) {
                System.out.print("   ");
                for (int strip = 0; strip < 11; strip++) {
                    System.out.print("-");
                }
            }

            System.out.println();
            strips = 0;
            }
            System.out.println("----------------------");

        } else {
            ticTacToe = 0;
            System.out.println("Место занято!");
            System.out.println("----------------------");
        }

    }

        //Делаем проверку победы x!!!!!!!
        if (field[0][0].equals("x") && field[0][1].equals("x") && field[0][2].equals("x") ||
            field[1][0].equals("x") && field[1][1].equals("x") && field[1][2].equals("x") ||
            field[2][0].equals("x") && field[2][1].equals("x") && field[2][2].equals("x") ||

            field[0][0].equals("x") && field[1][0].equals("x") && field[2][0].equals("x") ||
            field[0][1].equals("x") && field[1][1].equals("x") && field[2][1].equals("x") ||
            field[0][2].equals("x") && field[1][2].equals("x") && field[2][2].equals("x") ||

            field[0][0].equals("x") && field[1][1].equals("x") && field[2][2].equals("x") ||
            field[0][2].equals("x") && field[1][1].equals("x") && field[2][0].equals("x")) {
            ticTacToe = 3;
            System.out.println("ПОБЕДИЛИ КРЕСТИКИ!");
        }

        //Ходят o
        x = 0;
        y = 0;
        if (ticTacToe == 1) {
            System.out.println("Ходят нолики!");

            //Спрашиваем кординаты x
            do {
                if (x > 3 || x < 1) {
                    if (controllYX >= 1) {
                        System.out.println();
                        System.out.println("Вводите реальные координаты!");
                        System.out.println();
                    }
                    System.out.print("Введите координаты x: ");
                    x = scanner.nextInt();
                    controllYX++;
                } else {
                    break;
                }
            } while (true);

            controllYX = 0;

            //Спрашиваем кординаты y
            do {
                if (y > 3 || y < 1) {
                    if (controllYX >= 1) {
                        System.out.println();
                        System.out.println("Вводите реальные координаты!");
                        System.out.println();
                    }
                    System.out.print("Введите координаты y: ");
                    y = scanner.nextInt();
                    controllYX++;
                } else {
                    break;
                }
            } while (true);


            //Перерисовываем доску
            System.out.println();
            strips = 0;
            line = 0;
            ygrek = 1;
            ticTacToe = 0;
            question = true;
            controllYX = 0; //Новые данные

            x--;
            y--;
        if (field[y][x] == " ") {
            ticTacToe = 0;
            field[y][x] = "o";

            //Пишем кординаты x
            System.out.println("    1   2   3");
            System.out.println();

            //Выводим его на экран
            for (int i = 0; i < field.length; i++) {
                System.out.print(ygrek + "   ");   //Пишем кординаты y
                for (int j = 0; j < field[i].length; j++) {
                    System.out.print(field[i][j]);
                    strips++;
                    if (strips == 0 || strips == 1 || strips == 2) {
                        System.out.print(" | ");  //Пишем |
                        }
                }

            //Пишем -
            System.out.println();
            line++;
            ygrek++;

            if (line == 1 || line == 2) {
                System.out.print("   ");
                for (int strip = 0; strip < 11; strip++) {
                    System.out.print("-");
                }
            }

            System.out.println();
            strips = 0;
            }
            System.out.println("----------------------");

        } else {
            ticTacToe = 1;
            System.out.println("Место занято!");
            System.out.println("----------------------");
        }

    }

        //Делаем проверку победы o!!!!!!!
        if (field[0][0].equals("o") && field[0][1].equals("o") && field[0][2].equals("o") ||
            field[1][0].equals("o") && field[1][1].equals("o") && field[1][2].equals("o") ||
            field[2][0].equals("o") && field[2][1].equals("o") && field[2][2].equals("o") ||

            field[0][0].equals("o") && field[1][0].equals("o") && field[2][0].equals("o") ||
            field[0][1].equals("o") && field[1][1].equals("o") && field[2][1].equals("o") ||
            field[0][2].equals("o") && field[1][2].equals("o") && field[2][2].equals("o") ||

            field[0][0].equals("o") && field[1][1].equals("o") && field[2][2].equals("o") ||
            field[0][2].equals("o") && field[1][1].equals("o") && field[2][0].equals("o")) {
            ticTacToe = 3;
            System.out.println("ПОБЕДИЛИ НОЛИКИ!");
        }

        //Сыграем ли еще
        if (ticTacToe == 3) {
            Scanner scanner2 = new Scanner(System.in);
            do {
                System.out.println("----------------------");
                System.out.println("Сыграем ещё раз (Yes или No)? ");
                userAnswer = scanner2.nextLine();

                if (userAnswer.equals("No") || userAnswer.equals("NO") || userAnswer.equals("no")) {
                    System.exit(0);
                    scanner.close();
                    scanner2.close();
                } else if (userAnswer.equals("Yes") || userAnswer.equals("YES") || userAnswer.equals("yes")) {
                    ticTacToe = 10;
                    strips = 0;
                    line = 0;
                    ygrek = 1;
                    question = true;
                    controllYX = 0; //Новые данные
                    //Назначаем массив
                    field[0][0] = " ";
                    field[0][1] = " ";
                    field[0][2] = " ";
                    field[1][0] = " ";
                    field[1][1] = " ";
                    field[1][2] = " ";
                    field[2][0] = " ";
                    field[2][1] = " ";
                    field[2][2] = " ";
                }

                if (!userAnswer.equals("No") && !userAnswer.equals("NO") && !userAnswer.equals("no") && !userAnswer.equals("Yes") && !userAnswer.equals("YES") && !userAnswer.equals("yes")) {
                    System.out.println();
                    System.out.println("Я вас не понял!");
                    ticTacToe = 3;
                }
            } while (!userAnswer.equals("No") && !userAnswer.equals("NO") && !userAnswer.equals("no") && !userAnswer.equals("Yes") && !userAnswer.equals("YES") && !userAnswer.equals("yes"));
        }

    } while (ticTacToe != 10);
} while (true);
    }
}