import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Discount discount = new Discount(15);
        Product product=new Product("bread",discount,50);
        List<Product>products=new ArrayList<>();
        products.add(product);
        discount.setProducts(products);
        discount.discountedPrice();
        System.out.println(products);



    }
}