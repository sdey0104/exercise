public class equalityPrinter {

    public static void main(String[] arg){
        printEqual(2,3,-1);
    }

    public static void printEqual(int x , int y, int z){
        if(x<0 || y<0 || z<0){
            System.out.println("Invalid Value");
        }
        else{
            if (x==y & y==z){
                System.out.println("All numbers are equal");
            }
            else if (x==y || y==z || x==z){
                System.out.println("Niether all are equal nor different");
            }
            else if(x!=y && y!=z && x!=z){
                System.out.println("All numbers are different");
            }
        }

    }
}
