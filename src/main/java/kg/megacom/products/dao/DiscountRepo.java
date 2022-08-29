package kg.megacom.products.dao;

import kg.megacom.products.models.entities.Discount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscountRepo extends JpaRepository<Discount, Long> {
}
