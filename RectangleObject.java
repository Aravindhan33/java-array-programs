public class RectangleObject {
    double length;
    double breadth;

    RectangleObject(double l, double b) {
        length = l;
        breadth = b;
    }

    public static void main(String[] args) {
        RectangleObject r1 = new RectangleObject(5.4, 3.5);
        RectangleObject r2 = new RectangleObject(4.4, 3.8);
        RectangleObject r3 = new RectangleObject(7.1, 8.2);

        RectangleObject[] r = { r1, r2, r3 };

        for (int i = 0; i < r.length; i++) {
            System.out.println("Area of Rectangle for length " + r[i].length + " and breadth " + r[i].breadth + " is "
                    + r[i].getAreaOfRec());
        }
    }

    double getAreaOfRec() {

        return length * breadth;
    }

}
