public class HW02 {
    public static void main(String[] args) {
        //  Задача №1
//  Необходимо создать целочисленные переменные a и b,
//  присвоить произвольные значения переменным на ваш выбор и вывести результаты
//  следующих операций с этими переменными: сложение, умножение, вычитание, деление.
        int a = 123;
        int b = 100;

        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a - b);
        System.out.println(a / b);

//  Экстра задача
//  Также вывести остаток от деления и сделать проверку на четность этих переменных.
        double c = 6;
        double d = 2;
        double ostatok = c % d;

//Вывод остатка
        System.out.println("Остаток деления = " + ostatok / d);

// Проверка четности переменной c
        if (c % 2 == 0)
            System.out.println("Переменная с - Четная");
        else
            System.out.println("Переменная с - НЕчетная");
// Проверка четности переменной d
        if (d % 2 == 0)
            System.out.println("Переменная d - Четная");
        else
            System.out.println("Переменная d - НЕчетная");

//  Экстра задача
//  Вывести/напечатать смайлик (не :), а настоящий смайлик одним символом).
        System.out.println("\uD83D\uDE00");
    }
}
