public class HW04 {
    public static void main(String[] args) {

        /*Задача №1
Необходимо вывести числа от 0 до 15.
*/
        System.out.println("Задача №1");

        {
            for (int i = 0; i <= 15; i = i + 1) {
                System.out.println(i);
            }
        }

/*Задача №2
Необходимо вывести все положительные степени числа
5 которые меньше 10000, вывести результат возведения в степень.
 */
        System.out.println();
        System.out.println("Задача №2");

        {
            for (int i = 1; i < 10000; i = i * 5) {
                System.out.println(i);
            }
        }

/*Задача №3
Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
Реализовать 2 варианта:
1) использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
2) без использования конструкции if (шаг цикла на ваше усмотрение).
*/

//1) использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
        System.out.println();
        System.out.println("Задача №3 1 способ");
        {
            for ( int i = 40; i <= 60; i = i + 1) {
                if (i % 4 == 0) {
                    System.out.println(i);
                }
            }
        }

        System.out.println();
        System.out.println("Задача №3 2 способ");
        {
            for (int i = 40; i <= 60; i+=4) {
                System.out.println(i);
            }
        }
/*Напишите Java-программу, которая выводит числа от 1 до 100.
        Для чисел, кратных 3, выведите "Fizz" вместо числа,
        а для чисел, кратных 5, выведите "Buzz".
        Для чисел, кратных как 3, так и 5, выведите "FizzBuzz".
         */

//        {
//            for (int i = 1; i <= 100; i++) {
//
//                if (i % 3 == 0 && i % 5 == 0) {
//                    System.out.println(i + " FizzBuzz");
//                } else if (i % 5 == 0) {
//                    System.out.println(i + " Buzz");
//                } else if (i % 3 == 0) {
//                    System.out.println(i + " Fizz");
//                } else {
//                    System.out.println(i);
//                }
//            }
//            System.out.println();
//        }
    }
}
