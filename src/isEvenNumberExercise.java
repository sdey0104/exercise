public class isEvenNumberExercise {

    public static void main(String[] arg) {

        int strtNumber = 4;
        int endNumber = 20;

        do {
            if (isEvenNumber(strtNumber)) {
                continue;
            }
            System.out.println("the found even number is ---> " + strtNumber);
            strtNumber++;
        } while (strtNumber <= endNumber);


    }

    public static boolean isEvenNumber(int n) {
        if (n < 1) {
            return false;
        }
        if (n % 2 == 0) {
            return true;
        }
        return false;

    }


}



