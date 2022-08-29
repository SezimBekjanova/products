package kg.megacom.products.models.dto.requests;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductRequest {

    Long productId;
    String name;
    double price;
    int percent;
    Long categoryId;

}
