public class Rectangle3D {

    private double length, height, width;
    public void showParameters() {
        System.out.println("Length: " + this.length);
        System.out.println("Height: " + this.height);
        System.out.println("Width: " + this.width);
    }


    public double getHeight() {
        return this.height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public double getArea() {
        return 0;
    }
}
