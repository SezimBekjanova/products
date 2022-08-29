package kg.megacom.products.models.entities;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Table(name = "products")

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Product {

    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String title;

    @ManyToOne
            @JoinColumn(name = "category_id")
    Category category;


}
