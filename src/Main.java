//Logan Andy
//Exercise 8
// 3/5/2025
public class Main {
    public static void main(String[] args) {
        ContactInfo contactInfo1 = new ContactInfo("Logan", "awesomejandy@gmail.com");
        //contactInfo1.display();
        BusinessInfo businessInfo1 = new BusinessInfo("Omar", "116234@swcsd.us","614-580-0010");
        //businessInfo1.display();
        Both.addContact(contactInfo1);
        Both.addContact(businessInfo1);
        Both.displayContacts();
    }
}
