/*Даны 2 числа. Вывести большее из них.*/

public class Lesson1Task6 {

    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        if (a > b) {
            System.out.println("Большее число: " + a);
        }
        else if (a < b) {
            System.out.println("Большее число:" + b);
        }
        else {
            System.out.println("Числа равны");
        }

    }

}
