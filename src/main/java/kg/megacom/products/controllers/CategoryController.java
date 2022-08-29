package kg.megacom.products.controllers;

import kg.megacom.products.Services.CategoryService;
import kg.megacom.products.models.dto.CategoryDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/category")
public class CategoryController {
    private  final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping ("/save")
    public CategoryDto save(@RequestBody CategoryDto categoryDto){
        return  categoryService.save(categoryDto);
    }
}
