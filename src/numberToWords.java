public class numberToWords {

    public static void main(String[] arg) {
        int i =1450;
        numberToWords(i);
        System.out.println(reverse(i));
        System.out.println(getDigitCount(i));
    }

    public static void numberToWords(int number) {
        String wordNumber = "";
        String concat="";
        int reverseNumber=0;
        int lastdigit;
        int count = getDigitCount(number);
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            number = reverse(number);
            reverseNumber = number;


            do {
                lastdigit = number % 10;
                String strNumber = "";
                switch (lastdigit) {
                    case 0:
                        strNumber = "Zero";
                        break;
                    case 1:
                        strNumber = "One";
                        break;
                    case 2:
                        strNumber = "Two";
                        break;
                    case 3:
                        strNumber = "Three";
                        break;
                    case 4:
                        strNumber = "Four";
                        break;
                    case 5:
                        strNumber = "Five";
                        break;
                    case 6:
                        strNumber = "Six";
                        break;
                    case 7:
                        strNumber = "Seven";
                        break;
                    case 8:
                        strNumber = "Eight";
                        break;
                    case 9:
                        strNumber = "Nine";
                        break;
                }
                wordNumber = wordNumber +" "+strNumber;
                number = number / 10;
            } while (number > 0);

        }
        if(count == getDigitCount(reverseNumber)){
            System.out.println(wordNumber);
        }
        else {
            for(int i = 1;i<=count-getDigitCount(reverseNumber);i++){
                concat=concat+" "+"Zero";
            }
            wordNumber= wordNumber+""+concat;
            System.out.println(wordNumber);
        }
    }

    public static int reverse(int number) {
        int lastDigit;
        int reverseDigit = 0;
        do {
            lastDigit = number % 10;
            reverseDigit = (reverseDigit * 10) + lastDigit;
            number = number / 10;
        } while (number != 0);
        return reverseDigit;
    }

    public static int getDigitCount(int number){
        if(number<0){
            return -1;
        }
        int count = 0;
        do{
            number=number/10;
            count++;
        }while (number>0);
        return count;
    }

}
