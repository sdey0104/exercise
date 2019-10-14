public class flourBagProb {

    public static void main(String[] arg){
        System.out.println(canPack(6,2,17));

    }



    public static boolean canPack(int bigCount, int smallCount , int goal){
        int diff;
        if(bigCount <0 || smallCount<0 || goal <0){
            return false;
        }
        int kgbigCount = 5*bigCount;
        int kgsmallCount = 1 * smallCount;

        if(goal < (kgbigCount+kgsmallCount)){
            diff = (kgbigCount+kgsmallCount)-goal;
            int remaining = diff % 5;
            if(remaining >= 0 && remaining <= smallCount){
                return true;
            }

            else {
                return false;
            }

        }
        if(goal>(kgbigCount+kgsmallCount)){
            return false;
        }



        if(goal == (kgbigCount+kgsmallCount)){
            return true;
        }



        return false;
    }
}

