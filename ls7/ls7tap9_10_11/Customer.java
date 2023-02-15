package ls7tap9_10_11;

public class Customer {
    String customer;
    double money;

    public Customer(String customer, double money) {
        this.customer = customer;
        this.money = money;
    }

    public boolean tranfer(double money)
    {
        this.money -=money;
        return true;

    }
    public boolean sender(double money)
    {
        this.money +=money;
        return true;

    }
    public String getInfo(){
        return "Name: " + customer +"\nmoney: " + money;
    }
}

