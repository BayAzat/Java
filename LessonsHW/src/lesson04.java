public class lesson04 {
    public static void main(String[] args) {
        // в Java 4 цикла
//        for (" до начала цикла "; "перед началом итерации" ; после каждой итерации )
//            for ( объявление переменной; " возвращает true/false"; "двигает цикл вперед")

        for (int i = 0; i < 5; i = i + 1){
            System.out.println(i);
            System.out.println("Hi!");
        }

        System.out.println("End");

        // while do - цикл пердусловия
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            System.out.println("Hi!");
            i = i + 1;
        }

        // do while - цикл с постусловием (перевернытый цикл while)
//        do {
//
//        } while ();

    }
}
