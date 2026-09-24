public class Shape {
    public double length;
    public double width;
    public double height;
    public double volume;

    public Shape(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
        calculateVolume();
    }

    public double compareTo(Shape shape) {
        return this.volume - shape.volume;
    }

    private void calculateVolume() {
        this.volume = length * width * height;
    }

    public void cetak() {
        System.out.println("Length : " + length);
        System.out.println("Width  : " + width);
        System.out.println("Height : " + height);
        System.out.println("Volume : " + volume);
    }
}