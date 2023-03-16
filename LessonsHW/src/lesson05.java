import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class lesson05 {
    public static void main(String[] args) {
// Массивы

//        {
//            int[] array =  {10, 100, 1000, 10000, 1000000}; // Константный массив
//            System.out.println(array[0]);
//            System.out.println(array.length); // длина массива
//
//        }

//        {
//            int[] arr1 = {10, 100, 1000, 10000, 1000000};
//            int[] arr2 = arr1; // Работает как ссылка на объект. Аналог ярлыков на одну и туже папку
//
//            arr2[0] = 20; //  это означает arr2[0] == arr1[0]
//
//            System.out.println( arr1[0] );
//            System.out.println( Arrays.toString(arr1) ); // Вывод всего массива
//        }
// Пробежаться по всем значения массива
//        {
//            int[] arr1 = {10, 100, 1000, 10000, 1000000};
//            for (int i = 0; i < arr1.length; i++){
//                System.out.println(i + " ->" + arr1[i]);
//            }
//        }

        // Генерация нового массива
//        {
//            int[] arr = {}; // Пустой массив
//
//            int[] arr1 = new int[100000]; // массив с количеством символов 100 тыс
//            System.out.println(Arrays.toString(arr1));
//
//        }

//        {
//            int[] arr1 = new int[6];
//
//            for (int i = 0, p = 1; i < arr1.length; p *= 5, i++){
//                arr1[i] = p;
//            }
//            System.out.println(Arrays.toString(arr1));
//        }

        // Многомерные массивы

        {
            int[][] arr = { //длина массива =3 с кол-вом элементов =9
                    {1, 10, 100},
                    {2, 20},  // в Java мвссиы может быть рваным
                    {3, 30, 300, 3000}
            };
            System.out.println(Arrays.toString(arr));
            System.out.println(Arrays.deepToString(arr)); // вывод всех элементов массива
        }

        // Как обратиться к элементу массива в массиве?
        {
            int[][] arr = {
                    {1, 10, 100},
                    {2, 20},
                    {3, 30, 300, 3000}
            };
            System.out.println(arr[0][2]);
            System.out.println(arr[1][1]);
            System.out.println(arr[2][3]);
        }

        // Как вывести все элементы сложных массивов с помощью цикла?

        {
            int [][] arr = {
                {1, 10, 100},
                {2, 20},
                {3, 30, 300, 3000}
            };

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.println(arr[i][j]);
                }

            }

        }



//        //break
//        {
//            for (int i = 0; i < 16; i++) {
//                if (i == 7) {
//                    break;
//                }
//                System.out.println(i);
//            }
//        }
//
//        // continue
//
//        {
//            for (int i = 0; i < 16; i++) {
//                if (i == 7) {
//                    continue;
//                }
//                System.out.println(i);
//            }
//        }
//
//        {
//            for (int i = 0; i < 16; i++) {
//                if (i == 7 || i == 14) {
//                    continue;
//                }
//                System.out.println(i);
//            }
//        }

        // Вложенные циклы

//        {
//            for (int i = 0; i < 15; i++) {
//                for (int j = 0; j < 5; j++)
//                    System.out.println("i=" + i + " , j=" + j);
//
//            }
//        }
    }
}
