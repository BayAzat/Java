public class HW02 {
    public static void main(String[] args) {
        //  Задача №1
//  Необходимо создать целочисленные переменные a и b,
//  присвоить произвольные значения переменным на ваш выбор и вывести результаты
//  следующих операций с этими переменными: сложение, умножение, вычитание, деление.
        int a = 17;
        int b = 4;

        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a - b);
        System.out.println(a / b);
        // Способы изменения типа на double
        System.out.println(a * 1.0 / b); // * 1.0 используем для изменения типа на double
        System.out.println((double)a / b); // Такой вариант не рекоммендуется

//  Экстра задача
//  Также вывести остаток от деления и сделать проверку на четность этих переменных.
        double c = 7;
        double d = 2;
        double ostatok = c % d;

//Вывод остатка
        System.out.println("с mod d = " + c % d);

// Проверка четности переменной c
        if (c % 2 == 0) {
            System.out.println("Переменная с - Четное");
        } else {
            System.out.println("Переменная с - НЕ четное");
        }
// Проверка четности переменной d
        if (d % 2 == 0) {
            System.out.println("Переменная d - Четное");
        } else {
            System.out.println("Переменная d - НЕ четное");
        }
//  Экстра задача
//  Вывести/напечатать смайлик (не :), а настоящий смайлик одним символом).
        System.out.println("\uD83D\uDE00");
    }
}
