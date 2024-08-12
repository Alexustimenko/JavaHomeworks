package Lesson3Task6;

import java.util.Objects;

public class Product {
    private String name;
    private double price;
    private int quantity;
    public Product(String name,double price,int quantity)
    {
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    public String getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price;
    }
    public int getQuantity()
    {
        return quantity;
    }
    @Override
    public boolean equals(Object obj)
    {
        if(this == obj)
        {
            return true;
        }
        if (obj == null || getClass()!=obj.getClass())
        {
            return false;
        }
        Product product = (Product) obj;
        return Double.compare(product.price,price) == 0 && quantity == product.quantity && Objects.equals(name,product.name);
    }
    @Override
    public int hashCode()
    {
        return Objects.hash(name,price,quantity);
    }
    @Override
    public String toString()
    {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
