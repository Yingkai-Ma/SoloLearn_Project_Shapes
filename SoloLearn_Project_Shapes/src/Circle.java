public class Circle extends Shape{
    public Circle(int x) {
        width = x;
    }

    @Override
    void area() {
        double CircleArea = (double)Math.PI*(int)width * (int)width;
        System.out.println(CircleArea);
    }
}