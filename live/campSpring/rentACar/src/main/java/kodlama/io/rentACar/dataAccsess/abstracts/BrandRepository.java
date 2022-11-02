package kodlama.io.rentACar.dataAccsess.abstracts;

import kodlama.io.rentACar.entities.concrates.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BrandRepository extends JpaRepository<Brand,Integer> {

}
