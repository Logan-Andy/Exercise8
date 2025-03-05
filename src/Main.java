//Logan Andy
//Exercise 7
// 2/25/2025
public class Main {
    public static void main(String[] args) {
        ContactInfo contactInfo1 = new ContactInfo("Logan", "awesomejandy@gmail.com");
        //contactInfo1.display();
        BusinessInfo businessInfo1 = new BusinessInfo("Omar", "116234@swcsd.us","614-580-0010");
        //businessInfo1.display();
        Both both1 = new Both(contactInfo1, businessInfo1);
        System.out.println(both1);
    }
}