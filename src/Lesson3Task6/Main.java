package Lesson3Task6;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("PC",100.00,1000);
        Product product2 = new Product("PC",100.00,1000);
        Product product3 = new Product("TV",777.77,147);
        System.out.println("product1.equals(product2): " + product1.equals(product2));
        System.out.println("product1.equals(product3): " + product1.equals(product3));
        System.out.println("product1.hashCode(): " + product1.hashCode());
        System.out.println("product2.hashCode(): " + product2.hashCode());
        System.out.println("product3.hashCode(): " + product3.hashCode());
        System.out.println("Information:");
        System.out.println("product 1: " +product1);
        System.out.println("product 2: "+product2);
        System.out.println("product 3: "+product3);
    }
}
