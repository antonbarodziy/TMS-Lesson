/*Даны 3 целых числа. Найти количество положительных и отрицательных
чисел в исходном наборе.*/

public class Lesson1Task5 {

    public static void main(String[] args) {
        byte numberOfPositive = 0;
        byte numberOfNegative = 0;
        for (int i = 0; i < args.length; i++) {
            if (Integer.parseInt(args[i]) > 0) numberOfPositive++;
            if (Integer.parseInt(args[i]) < 0) numberOfNegative++;
        }
        System.out.println("Количество положительных чисел в исходном наборе: " + numberOfPositive);
        System.out.println("Количество отрицательных чисел в исходном наборе: " + numberOfNegative);
    }

}
