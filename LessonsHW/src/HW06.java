public class HW06 {
// Задача №1
//Дан массив: int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//необходимо вывести сумму всех значений массива.
    public static void main(String[] args) {
        {
            int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
            int sum = 0;

            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            System.out.println("sum = " + sum);
        }
//Задача №2
//Дан массив:int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//необходимо вывести максимальное значение массива.
        {
            int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
            int max = array[0];
            // 1 способ
            for (int i = 0; i < array.length; i++) {
                if (max < array[i]) {
                    max = array[i];
                }
            }
            System.out.println("max = " + max );

            // 2 способ
            int max2 = Integer.MIN_VALUE;

            for (int i = 0; i < array.length; i++) {
                if (max2 < array[i]) {
                    max2 = array[i];
                }
            }
            System.out.println("max2 = " + max2 );

        }

//Задача №3
//Дан массив: int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//необходимо вывести минимальное значение массива.
        {
            int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
            int min = array[0];
            // 1 способ
            for (int i = 0; i < array.length; i++) {
                if (min > array[i]) {
                    min = array[i];
                }
            }
            System.out.println("min = " + min);

            // 2 способ
            int min2 = Integer.MAX_VALUE;

            for (int i = 0; i < array.length; i++) {
                if (min2 > array[i]) {
                    min2 = array[i];
                }
            }
            System.out.println("min2 = " + min2);
        }


// Задача №4
//Дан массив: int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//необходимо вывести среднее арифметическое всех значений массива.

        {
            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            System.out.println("Сред ариф = " + (sum / arr.length));
        }

//Задача №5
//Дан массив: int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//необходимо вывести сумму элементов массива.

        {
            int [][] arr = {
                    {1, 2, 3, 4, 5},
                    {6, 7, 8, 9},
                    {-1, -2, -3, -4},
                    {-5, -6},
            };
            int sum = 0;

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    sum += arr[i][j];
                }
            }
            System.out.println("arr sum = " + sum);
        }
//Задача №6
//Дан массив: int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//необходимо вывести максимальное значение массива.

        {
            int [][] arr = {
                    {1, 2, 3, 4, 5},
                    {6, 7, 8, 9},
                    {-1, -2, -3, -4},
                    {-5, -6},
            };
            int max = arr[0][0];

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (max < arr[i][j]) {
                        max = arr[i][j];
                    }
                }
            }
            System.out.println("arr max = " + max);
        }

    }
}
