/*В переменную записываем число. Надо вывести на экран сколько в этом
числе цифр и положительное оно или отрицательное. Например,
"это однозначное положительное число". Достаточно будет определить,
является ли число однозначным, двухзначным или трехзначным и более.*/


public class Lesson1Task1 {

    public static void main(String[] args){

        Integer num = Integer.parseInt(args[0]);

        switch (getCount(num)) {
            case 1:
                System.out.println("Однозначное " + getSign(num));
                break;
            case 2:
                System.out.println("Двухзначное " + getSign(num));
                break;
            case 3:
                System.out.println("Трехзначное " + getSign(num));
                break;
            case 4:
                System.out.println("Четырехзначное "+ getSign(num));
                break;
            case 5:
                System.out.println("Пятизначное "+ getSign(num));
                break;
            case 6:
                System.out.println("Шестизначное "+ getSign(num));
                break;
            case 7:
                System.out.println("Семизначное "+ getSign(num));
                break;
            case 8:
                System.out.println("Восьмизначное "+ getSign(num));
                break;
            case 9:
                System.out.println("Девятизначное "+ getSign(num));
                break;
            case 10:
                System.out.println("Десятизначное "+ getSign(num));
                break;
        }
    }

    public static int getCount(int num){
        return(num == 0 ? 1 : (int)Math.log10(Math.abs(num)) + 1);
    }

    public static String getSign(int num){
        if (num < 0){
            return (" отрицательное");
        }
        else if (num > 0){
            return (" положительное");
        }
        else {
            return (" ноль");
        }
    }

}
