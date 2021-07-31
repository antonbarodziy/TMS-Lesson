/*Даны 3 целых числа. Найти количество положительных чисел в исходном
наборе.*/

public class Lesson1Task4 {

    public static void main(String[] args) {
        byte count = 0;
        for (int i = 0; i < args.length; i++) {
            if (Integer.parseInt(args[i]) > 0) count++;
        }
        System.out.println("Количество положительных чисел в исходном наборе: " + count);
    }

}
