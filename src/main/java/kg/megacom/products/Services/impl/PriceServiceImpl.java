package kg.megacom.products.Services.impl;

import kg.megacom.products.Services.PriceService;
import kg.megacom.products.dao.PriceRepo;
import kg.megacom.products.mappers.PriceMapper;
import kg.megacom.products.models.dto.PriceDto;
import kg.megacom.products.models.dto.requests.ProductRequest;
import kg.megacom.products.models.entities.Price;
import kg.megacom.products.models.entities.Product;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PriceServiceImpl implements PriceService {
    private  final PriceRepo priceRepo;
    private  final PriceMapper priceMapper;

    public PriceServiceImpl(PriceRepo priceRepo) {
        this.priceRepo = priceRepo;
        this.priceMapper = PriceMapper.INSTANCE;
    }

    @Override
    public PriceDto save(ProductRequest productRequest, Product product) {
        Price price = priceMapper.productRequestToPrice(productRequest);
        price.setStartDate(new Date());
        price.setEndDate(new Date(9999, 12,31));
        price.setProduct(product);
        price = priceRepo.save(price);
        return priceMapper.toPriceDto(price);
    }
}
