public class Area {
    double length;
    double breadth;

    void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    double getArea() {
        return length * breadth;
    }
}

class Main{
    public static void main(String[] args) {
        Area rectangle = new Area();


        double length = 5;
        double breadth = 10;
        rectangle.setDim(length, breadth);


        double area = rectangle.getArea();
        System.out.println("Area of the rectangle: " + area);
    }
}
