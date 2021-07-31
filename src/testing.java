public class testing {

    public static void main(String[] args) {
        if (isDigit(args[0])) {
            int number = Integer.parseInt(Character.toString(args[0].charAt(args[0].length()-1)));
            if (number % 10 == 0 || number % 10 > 4) System.out.println(args[0] + " программистов");
            else if (number % 10 > 1) System.out.println(args[0] + " программиста");
            else if (number % 10 == 1) System.out.println(args[0] + " программист");
        } else System.out.println("Вы ввели не число!");
    }

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}