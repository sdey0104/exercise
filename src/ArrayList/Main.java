package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

private static Scanner s = new Scanner(System.in);
    public static void main(String[] arg) {
        ArrayList<String> gs = new ArrayList<>();
        System.out.println("Enter no. of Items in the list");
        String item = "";
        int number = s.nextInt();
        for(int i = 0; i<number;i++){
            System.out.println("Enter an Item");
            item = s.next();
            gs.add(item);
        }

        int size = gs.size();
        GroceryStore groceryStore = new GroceryStore(gs);
        groceryStore.printGrocerryList();
        groceryStore.modifyGroceryItem(1,"alu");
        groceryStore.printGrocerryList();
        groceryStore.removeGrocery(size-1);
        groceryStore.printGrocerryList();

    }

}
