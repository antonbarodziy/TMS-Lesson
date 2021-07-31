/*Дано целое число. Если оно является положительным, то прибавить к нему 1.
Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на
10. Вывести полученное число.*/

public class Lesson1Task3 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);

        if (num > 0) num++;
        else if (num < 0) num -= 2;
        else num = 10;
        System.out.println("Полученное число: " + num);
    }
}
