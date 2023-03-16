public class practice {
    public static void main(String[] args) {
//        for (int i = 0; i <= 8; i++) {
//            //Левая пустая часть
//            for (int j = 7; j > i; j--) {
//                System.out.print("**");
//            }
//            //Левая часть
//            for (int k = ; k > i; k--) {
//                System.out.print(k + " ");
//            }
//            // Правая часть
////            for (int p = 1; p < i ; p++) {
////                System.out.print(p + " ");
////            }
//
//            System.out.println();
//        }

        for (int i = 8; i > 0; i--) {
//        //Левая пустая часть
//            for (int j = 0; j < i; j++) {
//                System.out.print("**");
//            }
        //Левая часть

        for (int j = 1 ; j < i; j++) {
                for (int l = 1; l < j; l++) {
                    System.out.print(l + " ");
                }
            }
//        // Правая часть
//            for (int p = 1; p < i ; p++) {
//                System.out.print(p + " ");
//            }

            System.out.println();
        }
    }
}
