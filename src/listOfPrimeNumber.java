public class listOfPrimeNumber {

    public static void main(String[] arg){

        int count = 0;
        int sum = 0;
       for(int i =1;i<=2;i++){
            if(isPrime(97)){
                System.out.println(i+" "+"is a prime number");
                count++;
            }

        }
       System.out.println("number of prime count till 1000 is : "+ count);

//        for(int i =1 ;i<=1000;i++){
//            if(divisible3and5(i)){
//                sum += i;
//                System.out.println("divisible by 3 and 5"+" "+"--->"+i);
//                count++;
//            }
//            if(count == 10){
//                System.out.println("sum ---> "+sum);
//                break;
//            }
//        }

    }



    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i =2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static boolean divisible3and5(int n){
        if(n%3==0 && n%5==0){
            return true;
        }
        return false;
    }
}
