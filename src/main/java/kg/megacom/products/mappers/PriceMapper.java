package kg.megacom.products.mappers;

import kg.megacom.products.models.dto.PriceDto;
import kg.megacom.products.models.dto.requests.ProductRequest;
import kg.megacom.products.models.entities.Price;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PriceMapper {
    PriceMapper INSTANCE = Mappers.getMapper(PriceMapper.class);
    Price productRequestToPrice(ProductRequest productRequest);

    PriceDto toPriceDto(Price price);
}
