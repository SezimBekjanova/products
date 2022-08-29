package kg.megacom.products.Services;

import kg.megacom.products.models.dto.DiscountDto;
import kg.megacom.products.models.dto.PriceDto;
import kg.megacom.products.models.dto.requests.ProductRequest;
import kg.megacom.products.models.entities.Product;

public interface DiscountService {
     DiscountDto save(ProductRequest productRequest, Product product);
}
