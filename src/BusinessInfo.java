class BusinessInfo extends ContactInfo{
    private String phoneNumber;

    public BusinessInfo(String name, String email, String phoneNumber) {
        super(name, email);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public BusinessInfo(String name, String email) {
        super(name, email);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("This individuals phone number is (" + phoneNumber + ")");
    }

    @Override
    public String toString() {
        return "BusinessInfo{" +
                "phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
