package Mobile;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contacts> contactList = new ArrayList<>();
    private String number;

    public MobilePhone(String number) {
        this.number = number;
        this.contactList = new ArrayList<Contacts>();
    }

    public boolean addNewContact(Contacts contacts) {
        if (findContact(contacts.getName()) >= 0) {
            System.out.println("Contact already on the file");
            return false;
        }
        contactList.add(contacts);
        return true;
    }

    private int findContact(Contacts contacts) {
        return this.contactList.indexOf(contacts);
    }

    private int findContact(String name) {
        for (int i = 0; i < this.contactList.size(); i++) {
            Contacts contacts = this.contactList.get(i);
            if (contacts.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contacts contacts){
        if(findContact(contacts)>=0){
            return contacts.getName();
        }
        return null;
    }

    public Contacts queryContact(String name){
        int position = findContact(name);
        if (position >= 0) {

            return this.contactList.get(position);
        }
        return null;

    }

    public boolean updateContact(Contacts oldContact, Contacts newContact) {
        int foundPos = findContact(oldContact);
        if (foundPos < 0) {
            System.out.println(oldContact.getName() + " , was not found");
            return false;
        }
        if (findContact(newContact.getName()) >= 0) {
            System.out.println("Contact already on the file");
            return false;
        }

        this.contactList.set(foundPos, newContact);
        System.out.println(oldContact.getName() + "was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contacts contacts){
        int foundPos = findContact(contacts);
        if (foundPos < 0) {
            System.out.println(contacts.getName() + " , was not found");
            return false;
        }
        this.contactList.remove(foundPos);
        System.out.println(contacts.getName() +" is deleted");
        return true;
    }

    public void printContact(){
        System.out.println("Contact List");
        for(int i = 0 ;i<contactList.size();i++){
            System.out.println((i+1)+" . "+this.contactList.get(i).getName()+" --> "+this.contactList.get(i).getNumber());
        }
    }

}
