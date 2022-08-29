package kg.megacom.products.models.dto;


import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

public class CategoryDto {

    Long id;

 String title;
    boolean active;


}