import java.util.*;
class Both {
    static ArrayList<ContactInfo> listOfContacts = new ArrayList<>();

    static void addContact(ContactInfo a) {
        listOfContacts.add(a);

    }
    static void displayContacts(){
        for(ContactInfo b : listOfContacts){
            b.display();
        }
    }
}
