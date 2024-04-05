// L - Принцип подстановки Барбары Лисков (Liskov Substitution Principle):
// Создайте класс Square, который наследуется от класса Rectangle. Убедитесь, что все методы,
//  работающие с Rectangle, также корректно работают с Square, не изменяя их поведения.


public class Leskov {
    
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(6.2, 4.5);
        System.out.printf("%s %.2f \n", "Площадь прямоугольника = ", rectangle.calculateArea());
        System.out.printf("%s %.2f \n", "Отношение сторон = ", rectangle.divideSides());
        Square square = new Square(4.5, 4.5);
        System.out.printf("%s %.2f \n", "Площадь квадрата = ", square.calculateArea());
        System.out.printf("%s %.2f \n", "Отношение сторон = ", square.divideSides());
    }
}

class Rectangle{

    public double width;
    public double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }

    public double divideSides() {
        return width / height;
    }

}
class Square extends Rectangle{

    public Square(double width, double height) {
        super(width, height);
     
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    // @Override
    // public double calculateArea() {
    //     return super.calculateArea();
    // }

    @Override
    public double divideSides() {
        return width / height;
    }

    // @Override
    // public double divideSides() {
    //     return super.divideSides();
    // }
}
