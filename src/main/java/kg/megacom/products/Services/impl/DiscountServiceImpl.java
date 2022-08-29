package kg.megacom.products.Services.impl;

import kg.megacom.products.Services.DiscountService;
import kg.megacom.products.dao.DiscountRepo;
import kg.megacom.products.mappers.DiscountMapper;
import kg.megacom.products.models.dto.DiscountDto;
import kg.megacom.products.models.dto.requests.ProductRequest;
import kg.megacom.products.models.entities.Discount;
import kg.megacom.products.models.entities.Product;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.Date;
@Service
public class DiscountServiceImpl implements DiscountService {
    private final DiscountRepo discountRepo;
    private final DiscountMapper discountMapper;


    public DiscountServiceImpl(DiscountRepo discountRepo) {
        this.discountRepo = discountRepo;
        this.discountMapper = DiscountMapper.INSTANCE;
    }

    @Override
    public DiscountDto save(ProductRequest productRequest, Product product) {
        Discount discount = discountMapper.productRequestToDiscount(productRequest);
        DiscountDto discountDto = new DiscountDto();
        discount.setStartDate(new Date());
        discount.setEndDate(new Date(9999, 12,31));
        discount.setProduct(product);
        discount.setPercent(discountDto.getPercent());
        discount = discountRepo.save(discount);
        return discountMapper.toDiscountDto(discount);
        /*
        Price price = priceMapper.productRequestToPrice(productRequest);
        price.setStartDate(new Date());
        price.setEndDate(new Date(9999, 12,31));
        price.setProduct(product);
        price = priceRepo.save(price);
        return priceMapper.toPriceDto(price);
         */
    }
}
