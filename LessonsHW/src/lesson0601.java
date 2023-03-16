import java.util.Arrays;

public class lesson0601 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4,}; // Так тоже можно записать массив

        {
            String str = "Hello!"; // В строке не меняется значение
            String str3 = new String("Hello!"); //Так тоже записывать строку

            String str2 = str;
            str2 = "Hi!";

            System.out.println(str);
            System.out.println(str2);
        }

        {
            Integer a = 10; // Reference type
            int b = 50; // value type
        }

        {
            Long L = 10L;
            long l = 1;

            Double D = 10.0;
            double d = 1;
        }

        {
            Integer[] a = new Integer[5];
            int[] b = new int[5];

            System.out.println(Arrays.toString(a)); // [null, null, null, null, null]
            System.out.println(Arrays.toString(b)); // [0, 0, 0, 0, 0]
        }

        {
            String str4 = null;
            str4 = "Sergey";

            System.out.println(str4.indexOf("y"));
        }

        {
            String str = "Sergey";

            String str2 = str.toLowerCase(); // метод возвращает сроку со строчными буквами


            System.out.println(str2);
            System.out.println(str);
        }

        {
            String str = "Sergey";

            str = str.toLowerCase();

            System.out.println(str);
        }

        {
            String str = "Sergey";
            String str2 = "Sergey is programmer";

            str = str.replace("r", "!"); // заменяет указанный символ на новый
           // str2 = str2.indexOf("e"); //

            System.out.println(str);
            System.out.println(str);
        }

        {
            String str = "Sergey is programmer";
            for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i) + "-");
            }

        }

        {
            int[] arr21 = {1, 2, 3,};
            int[] arr22 = {1, 2, 3,};

            System.out.println("Сравниене массивов" + Arrays.equals(arr21,arr22)); // Сравниние массивов
        }

        {
            Integer a = 10;
            Integer b = 10;

            System.out.println("Сравнение Integer");
            System.out.println(a == b);
            System.out.println(a.equals(b));
        }
    }
}
