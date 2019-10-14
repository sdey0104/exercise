public class switchStatementExercise {

    public static void main(String[] arg) {
//        int switchValue = 9;
//
//        switch (switchValue) {
//            case 1:
//                System.out.println("value is 1");
//                break;
//            case 2:
//                System.out.println("value is 2");
//
//            default:
//                System.out.println("niether 1 nor 2");


//        }

        char character = 'A';
        switch (character) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println(character+" "+ "was found");
                break;

            default:
                System.out.println("not found");
        }

    }
}
