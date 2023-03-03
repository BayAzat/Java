public class lesson03 {
    public static void main(String[] args) {

        int a = 1;
        a = a + 1;
        a = a + 1 + a + 2;

        int b = 2 + 1;
        a = b + a +1;

        char c = 0;

        System.out.println("a=" + a);
        System.out.println(b);
        System.out.println(c);

        if (a % 2 == 0){
            System.out.println("a Не четное");
            b = 2;
        } else {
            System.out.println("a Четное");

            if (a == 8 ) {
                System.out.println("a=8");
            } else {
                System.out.println("a is not 8");
            }
        }
// else {... if ...} можно сократить применяя else if
        if (a % 2 == 0){
            System.out.println("a Не четное");
            b = 2;
        } else if (a == 8 ) {
                System.out.println("a=8");
        } else if (a == 10 ) {
                System.out.println("a is not 10");
        } else {
            System.out.println("a is something else");
        }

        if (b < a) {
            System.out.println("b less then a");
        }
        /*
        a > b больше
        a >= b больше или равно
        a == b равно
        a != b не равно
        a <= b меньше или равно
        a < b меньше
         */

        // Булево значение
        System.out.println("a % 2 == 0 is " + (a % 2 == 0));

        //&& and - логическое умножение
        System.out.println("====================================");
        System.out.println("true && false = " + (true && false));
        System.out.println("true && true = " + (true && true));
        System.out.println("false && true = " + (false && true));
        System.out.println("false && false = " + (false && false));

        // || or - логическое сложение
        System.out.println("====================================");
        System.out.println("true || false = " + (true || false));
        System.out.println("true || true = " + (true || true));
        System.out.println("false || true = " + (false || true));
        System.out.println("false || false = " + (false || false));

        // != not - применяеться только к true / false
        System.out.println("====================================");
        System.out.println("!false = " + (!false));
        System.out.println("!true = " + (!true));

        // Порядок выполнений операций:1. ! 2. && 3. ||

        System.out.println("====================================");
        // Цикл for
        //for ( область инициализация/объявляем переменную ; проверка (пока значение true) ; зона изменения переменной)

        for (int l = 1; l <= 5; l = l + 1) {
            System.out.print(l + " ");
        }

        System.out.println();

        for (int l = 10; l > 0; l = l - 1) {
            System.out.print(l + " ");
        }

        // Зона видимости
        // 1 вариант
        int y;

        for (y = 10; y > 0; y = y - 1) {
            System.out.print(y + " ");
        }

        if (1> 2){
            y = 5;
        }
        // 2 вариант

        for (int p = 10; p > 0; p = p - 1) {
            System.out.print(p + " ");
        }

        if (1> 2){
            int p = 5;
        }

        int p = 99;
        System.out.println(p);

    }
}

