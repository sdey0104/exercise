public class sumOddexe {
    public static void main(String[] arg) {
        System.out.println(sumOdd(10,5));
    }


    public static boolean isOdd(int number) {
        if (number < 1) {
            return false;
        }
        if (number % 2 != 0) {
            return true;
        }
        return false;

    }


    public static int sumOdd(int start , int end){
        int sum = 0;
        if(start>end ){
            return -1;
        }
        if(start <0 || end<0){
            return -1;
        }
        for(int i = start;i<=end;i++){
            if(isOdd(i)){
                System.out.println("Found odd value as"+i);
                sum += i;
            }

        }
        return sum;
    }

}
