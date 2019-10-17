public class Palindrome {

    public static void main(String[] arg) {


        String paa = "123454321";
        String strPaa = paa.replaceAll(" ", "").toLowerCase();
        int length = strPaa.length();
        String revPaa="";
        for ( int i = length - 1; i >= 0; i-- ) {
            revPaa = revPaa + strPaa.charAt(i);
        }

        if (paa.equals(revPaa)) {
            System.out.println("palindrome");
        }


    }


}

