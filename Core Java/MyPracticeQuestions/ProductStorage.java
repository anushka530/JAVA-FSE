import java.util.HashSet;

class Product {
    private int id;
    private String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Product other = (Product) obj;
        return id == other.id;
    }
}

public class ProductStorage {
    public static void main(String[] args) {
        HashSet<Product> uniqueProducts = new HashSet<>();

        uniqueProducts.add(new Product(1, "Product A"));
        uniqueProducts.add(new Product(2, "Product B"));
        uniqueProducts.add(new Product(3, "Product C"));
        uniqueProducts.add(new Product(4, "Product D"));
        uniqueProducts.add(new Product(5, "Product E"));
        uniqueProducts.add(new Product(6, "Product F"));
        uniqueProducts.add(new Product(7, "Product G"));
        uniqueProducts.add(new Product(8, "Product H"));
        uniqueProducts.add(new Product(9, "Product I"));
        uniqueProducts.add(new Product(10, "Product J"));


        uniqueProducts.add(new Product(1, "Product A"));

        for (Product product : uniqueProducts) {
            System.out.println("Product ID: " + product.getId() + ", Name: " + product.getName());
        }
    }
}
