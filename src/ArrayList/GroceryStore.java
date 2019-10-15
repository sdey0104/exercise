package ArrayList;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLPortType;

import java.util.ArrayList;

public class GroceryStore {

    private int[] myNumbers = new int[50];
    private ArrayList<String> groceryList = new ArrayList<>();

    public GroceryStore(ArrayList<String> groceryList) {
        this.groceryList = groceryList;
    }

//    public void addGroceryItem(String item) {
//        groceryList.add(item);
//    }

    public void printGrocerryList() {
        System.out.println("you have" + groceryList.size() + "items in your groceryList");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + " :- " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
    }

    public void removeGrocery(int position){
        groceryList.remove(position);
    }

    public String findItem(String searchItem){
        boolean exist = groceryList.contains(searchItem);

        int position = groceryList.indexOf(searchItem);
        if(position>=0){
            return Integer.toString(position);
        }
        return null;
    }
}
