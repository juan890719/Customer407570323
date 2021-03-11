public class Customer {
    String id;
    int all_money;
    int discount;
    int money;

    public Customer(String id, int all_money, int discount, int money) {
        this.id = id;
        this.all_money = all_money;
        this.discount = discount;
        this.money = money;
    }
    public void print() {
        System.out.println(id + "\t" + all_money + "\t" + discount + "\t" + money);
    }
}
