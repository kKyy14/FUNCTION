public class CubeStudent07 {

    private double sideLength;

    public CubeStudent07(double sideLength) {
        this.sideLength = sideLength;
    }

    public double calculateArea() {
        return 6 * Math.pow(sideLength, 2);  
    }

    public double calculateVolume() {
        return Math.pow(sideLength, 3);      
    }

    public static void main(String[] args) {
        CubeStudent07 cube = new CubeStudent07(5);
        System.out.println("Area: " + cube.calculateArea());
        System.out.println("Volume: " + cube.calculateVolume());
    }
}
