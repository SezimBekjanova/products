package kg.megacom.products.mappers;

import kg.megacom.products.models.dto.CategoryDto;
import kg.megacom.products.models.entities.Category;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {
    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);
    Category toCategory(CategoryDto categoryDto);
    //@Mapping(source = "title", target = "name")
    @InheritInverseConfiguration
    CategoryDto toCategoryDto ( Category category);

}
