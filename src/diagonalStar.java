public class diagonalStar {

    public static void main(String[] arg){
        printSquareStar(16);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        for (int row = 0; row < number; row++) {
            for (int column = 0; column < number; column++) {
                if (row == 0 || column == 0 || row == number - 1 ||column == number - 1 || row == column || column == (number - 1) - row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            if (row < number - 1) {
                System.out.println();
            }
        }
    }
}