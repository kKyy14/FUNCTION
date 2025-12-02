public class VarargsExample {

    
    static void showData(String name, double price, int... quantities) {
        System.out.println("Product Name : " + name);
        System.out.println("Price        : " + price);
        System.out.print("Quantities   : ");

        for (int q : quantities) {
            System.out.print(q + " ");
        }

        System.out.println("\n");
    }

    public static void main(String[] args) {
        
        showData("Notebook", 12.5, 3, 5, 2);
        showData("Pencil", 2.0, 10);
        showData("Bag", 45.0);  
}
