// O - Принцип открытости/закрытости (Open/Closed Principle):
// Добавьте новый метод calculateDiscount() в класс Customer, который будет рассчитывать 
// скидку для заказов. Это позволит расширить функциональность класса без изменения его 
// исходного кода.

public class Open {
    public static void main(String[] args) {
        Customer cost = new Customer( 8.0, 1.5 );
        System.out.printf("%s %.2f \n", "сумма = ", cost.getResult());
        Discount rew = new Discount(8.0, 1.5);
        System.out.printf("%s %.2f \n", "сумма = ", rew.calculateDiscount());

        // SilverCustomer customer1 = new SilverCustomer();
        // System.out.printf("%s %.2f \n", "сумма= ", customer1.calculateDiscount(100));
    }
}
class Customer{

    private double price;
    private double volume;

    public Customer(double volume,double price) {
        this.price = price;
        this.volume = volume;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
  
    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;

    }
    public double getResult(){
        return price * volume;
    }
}

interface CalculateDiscount {
    double calculateDiscount();     
}

class Discount extends Customer implements CalculateDiscount {

    public Discount(double volume,double price) {
        super(volume, price);
    }
      
    @Override
    public double calculateDiscount() {
        return super.getResult() * 0.95; 
    }

}

