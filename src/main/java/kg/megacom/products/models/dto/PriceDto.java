package kg.megacom.products.models.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import kg.megacom.products.models.entities.Product;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

public class PriceDto {
    Long id;

    double price;

    @JsonFormat(pattern = "dd.MM.yyyy")
    Date startDate;
    @JsonFormat(pattern = "dd.MM.yyyy")
    Date endDate;
    ProductDto product;

}
