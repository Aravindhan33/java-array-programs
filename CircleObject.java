public class CircleObject {
    int radius;

    CircleObject(int radius) {
        this.radius = radius;
    }

    double getArea() {
        double area = 3.14 * radius * radius;
        return area;
    }

    public static void main(String[] args) {
        CircleObject c1 = new CircleObject(3);
        CircleObject c2 = new CircleObject(5);
        CircleObject c3 = new CircleObject(4);

        CircleObject[] c = { c1, c2, c3 };
        for (int i = 0; i < c.length; i++) {
            System.out.println("The Area of the radius of circle " + c[i].radius + "  is: " + c[i].getArea());
        }
    }
}
