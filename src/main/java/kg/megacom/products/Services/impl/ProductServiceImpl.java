package kg.megacom.products.Services.impl;

import kg.megacom.products.Services.CategoryService;
import kg.megacom.products.Services.DiscountService;
import kg.megacom.products.Services.PriceService;
import kg.megacom.products.Services.ProductService;
import kg.megacom.products.dao.ProductRepo;
import kg.megacom.products.mappers.ProductMapper;
import kg.megacom.products.models.dto.DiscountDto;
import kg.megacom.products.models.dto.PriceDto;
import kg.megacom.products.models.dto.requests.ProductRequest;
import kg.megacom.products.models.entities.Product;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    private  final CategoryService categoryService;
    private final ProductMapper productMapper;
    private final ProductRepo productRepo;
    private final PriceService priceService;
    private final DiscountService discountService;
    public ProductServiceImpl(CategoryService categoryService, ProductRepo productRepo, PriceService priceService,  DiscountService discountService) {
        this.categoryService = categoryService;
        this.productRepo = productRepo;
        this.priceService = priceService;
        this.discountService = discountService;
        this.productMapper = ProductMapper.INSTANCE;
    }

    @Override
    public ProductRequest save(ProductRequest productRequest) {
        Product product = productMapper.productRequestToProduct(productRequest);
        categoryService.checkExistsByIdAndActive(product.getCategory().getId());
        product = productRepo.save(product);
        DiscountDto discountDto = discountService.save(productRequest,product);
        PriceDto priceDto = priceService.save(productRequest,product);
        return null;
    }
}