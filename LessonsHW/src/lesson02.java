public class lesson02 {
    public static void main(String[] args) {

// Переменная - поименновая область памяти

        int apple = 14;
        int people = 3;
        double xyz = 5;
        long LLL= 2147483648L;
        float FFF=3.0F;
        long LLL2= 2147__483_648L; // _ не влияет на тип константы, оно показывает разряд числа

        int sum = apple + people; // 17
        int div = apple / people; // 4
        double div2 = apple / xyz; // 2.8

        System.out.println(sum);
        System.out.println(div);
        System.out.println(div2);

        double c = 10;
        double d = 3;

        System.out.println(c / d); // 3.333333

        String str = "";
        boolean b1 = true;
        boolean b2 = false;

        System.out.println(b1);
        System.out.println(b2);

        char e = 'a'; // это символ ! Это всегда одно определение! Он хранит код символа.
        int bb = 1;
        System.out.println(e + bb);

        int X = 12;
        System.out.println((double) X); // В скобках X  - это значение переменной, а не сама переменная 1. Сначала достаем занчение переменной X 2. Присваем значению переменной тип double
    }
}
