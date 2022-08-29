package kg.megacom.products.mappers;

import kg.megacom.products.models.dto.DiscountDto;
import kg.megacom.products.models.dto.PriceDto;
import kg.megacom.products.models.dto.requests.ProductRequest;
import kg.megacom.products.models.entities.Discount;
import kg.megacom.products.models.entities.Price;
import org.mapstruct.factory.Mappers;

public interface DiscountMapper {
    DiscountMapper INSTANCE = Mappers.getMapper(DiscountMapper.class);
    Discount productRequestToDiscount(ProductRequest productRequest);
    DiscountDto toDiscountDto(Discount discount);

}
