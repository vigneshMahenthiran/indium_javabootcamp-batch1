public class ShapeMain {
    public static void main(String[] args) {
//        Shape square = new Shape();
//        square.add(new Square(10));
//        Square s1 = (Square) square.get();
//        System.out.println(s1.getArea());
        
        Shape<Square> square = new Shape<>(new Square(10));
//        square.add(new Square(10));
//        System.out.println(square.get().getArea());
        System.out.println(square.getArea());

        Shape<Rectangle> rectangle = new Shape<>(new Rectangle(5,10));
//        rectangle.add(new Rectangle(5,10));
//        System.out.println(rectangle.get().getArea());
        System.out.println(rectangle.getArea());
    }
}
