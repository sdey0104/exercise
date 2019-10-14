public class leapYear {
    public static void main(String[] arg) {
        //System.out.println(getDaysInMonth(2,9000));
        System.out.println( isLeapYear(1924));
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if (year % 400 == 0) {
            return true;
        }
        if(year % 4 ==0 && year % 100 !=0){
            return true;
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        int i = 0;
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }
        if (isLeapYear(year)) {
            i = 29;
        } else {
            i = 28;
        }
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;

            case 2:
                return i;

            case 4:
            case 6:
            case 9:
            case 11:

                return 30;

            default:
                return -1;

        }

    }

}
