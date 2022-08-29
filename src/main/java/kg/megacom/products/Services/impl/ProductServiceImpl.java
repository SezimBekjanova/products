package kg.megacom.products.Services.impl;

import kg.megacom.products.Services.CategoryService;
import kg.megacom.products.Services.PriceService;
import kg.megacom.products.Services.ProductService;
import kg.megacom.products.dao.ProductRepo;
import kg.megacom.products.mappers.ProductMapper;
import kg.megacom.products.models.dto.PriceDto;
import kg.megacom.products.models.dto.requests.ProductRequest;
import kg.megacom.products.models.entities.Price;
import kg.megacom.products.models.entities.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    private  final CategoryService categoryService;
    private final ProductMapper productMapper;
    private final ProductRepo productRepo;
    private final PriceService priceService;
    public ProductServiceImpl(CategoryService categoryService, ProductRepo productRepo, PriceService priceService) {
        this.categoryService = categoryService;
        this.productRepo = productRepo;
        this.priceService = priceService;
        this.productMapper = ProductMapper.INSTANCE;
    }

    @Override
    public ProductRequest save(ProductRequest productRequest) {
        Product product = productMapper.productRequestToProduct(productRequest);
        categoryService.checkExistsByIdAndActive(product.getCategory().getId());
        product = productRepo.save(product);
        PriceDto priceDto = priceService.save(productRequest,product);
        return null;
    }
}
