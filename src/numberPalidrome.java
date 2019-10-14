public class numberPalidrome {
    public static void main(String[] arg){
        System.out.println(isPalindrome(-121));
    }

    public static boolean isPalindrome(int number){
        int reverse = 0;
        int lastDigit =0;
        int orgNumber = number;
       do{
            lastDigit = number % 10;
            reverse = (reverse*10)+lastDigit;
            number = number/10;

        }while(number!=0);
        if(reverse == orgNumber){
            return true;
        }
        return false;
    }




}
