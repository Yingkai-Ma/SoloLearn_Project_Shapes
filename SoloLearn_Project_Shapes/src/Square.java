public class Square extends Shape{
    public Square(int y) {
        width = y;
    }

    @Override
    void area() {
        int SquareArea = width*width;
        System.out.println(SquareArea);
    }
}
