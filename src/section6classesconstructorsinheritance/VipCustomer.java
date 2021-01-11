package section6classesconstructorsinheritance;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;


    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit,  "test@test.se");
    }

    public VipCustomer() {
        this("Sofie", 1000.00, "test@test.se");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
