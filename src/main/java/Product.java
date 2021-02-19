import lombok.Builder;
import lombok.Data;

@Data

public class Product {
    Integer id;
    String productName;
    Integer cost;

    public Product(int id, String productName,int cost) {
        this.id = id;
        this.productName = productName;
        this.cost = cost;

    }
    }