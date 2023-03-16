public class lesson06 {
    public static void main(String[] args) {
        // 2 варианта создания массивов
        int[] arr0 = {}; // используют это вариант
        int arr1[] = {}; // лучше не использовать

        int[] arr2 = new int[10];

        int[] arr = {10, 2, 3, 8, 2, 4, 6};
// Поиск мин значения в массиве
        int result = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (result > arr[i]) {
                result = arr[i];
            }
        }
        System.out.println("min= " + result);

// Поиск макс значения в массиве
        int result2 = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (result2 < arr[i]) {
                result2 = arr[i];
            }
        }
        System.out.println("max= " + result2);

// Сумма всех элементов массива
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("sum= " + sum);

// Количество элементов массива
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;
        }
        System.out.println("count - " + count);

// Сумма всех элементов 2мер массива
        int[][] array = {
                {10, 5},
                {3, 8, 2},
                {},
                {6}};

        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                summ += array[i][j];
            }

        }
        System.out.println("summ= " + summ);

// Мин значение среди всех элементов 2мер массива
        int min2 = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (min2 > array[i][j]) {
                    min2 = array[i][j];
                }
            }
        }
        System.out.println("min2= " + min2);

        {
            int[] array10 = {10, 5, 3, 8, 2, 6};

            int min = Integer.MAX_VALUE; // выводит макс элемент массива
            for (int i = 0; i < array10.length; i++) {
                if (min > array10[i]) {
                    min = array10[i];
                }
            }
            System.out.println("min3= " + min);
        }

        {
            int[] array10 = {10, 5, 3, 8, 2, 6};

            int max = Integer.MIN_VALUE; // вывоит макс элемент массива
            for (int i = 0; i < array10.length; i++) {
                if (max < array10[i]) {
                    max = array10[i];
                }
            }
            System.out.println("max3= " + max);
        }


    }
}
