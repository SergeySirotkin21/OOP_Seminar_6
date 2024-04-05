
// I - Принцип разделения интерфейса (Interface Segregation Principle):
// Создайте интерфейсы Driveable и Flyable. Реализуйте их в соответствующих классах Car и Airplane. 
// Теперь классы Car и Airplane зависят только от интерфейсов, которые они используют.
public class IntSegr {
}

interface Driveable {
    void drive();
}
    
interface Flyable{
    void fly();
}
    
class Car implements Driveable {

    @Override
    public void drive() {
       // Реализация движения автомобиля
    }   
}
class Airplane implements Flyable {

    @Override
    public void fly() {
    // Реализация движения самолета    
    }
}
