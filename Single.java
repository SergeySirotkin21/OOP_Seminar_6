// S - Принцип единственной ответственности (Single Responsibility Principle):
// Добавьте новый класс OrderLogger, который будет отвечать только за логирование информации
//  о заказах. Теперь класс Order будет отвечать только за размещение заказа, а 
//  OrderLogger - за запись логов.

public class Single {
    public static void main(String[] args) {
        Order sakas = new Order(); 
        sakas.placeOrder();
        OrderLogger logger = new OrderLogger();
        logger.loggerOrder();
    }
    
}
class Order {
  
    public void placeOrder() {
            // Логика размещения заказа
    System.out.println("Ваш заказ успешно размещен.");
    }
}


class OrderLogger {
    public void loggerOrder() {
    // Логика записи  информации о заказах
    System.out.println("Заказ размещен.");

    }
}
