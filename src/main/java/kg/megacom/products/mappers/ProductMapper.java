package kg.megacom.products.mappers;

import kg.megacom.products.models.dto.requests.ProductRequest;
import kg.megacom.products.models.entities.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);
    @Mapping(source = "categoryId", target = "category.id")
    @Mapping(source = "name", target = "title")
    Product productRequestToProduct(ProductRequest productRequest);
}
