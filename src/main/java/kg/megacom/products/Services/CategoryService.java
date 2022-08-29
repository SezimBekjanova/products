package kg.megacom.products.Services;

import kg.megacom.products.models.dto.CategoryDto;
import kg.megacom.products.models.entities.Category;

public interface CategoryService {
    CategoryDto save(CategoryDto categoryDto);
    boolean existsById(Long id);
    void checkExistsByIdAndActive(Long id);
    Category findById(Long id);
}
