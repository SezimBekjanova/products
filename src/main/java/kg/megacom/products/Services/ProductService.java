package kg.megacom.products.Services;

import kg.megacom.products.models.dto.requests.ProductRequest;

public interface ProductService {
    ProductRequest save(ProductRequest productRequest);
}
