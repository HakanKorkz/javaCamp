package kodlama.io.rentACar.dataAccsess.abstracts;

import kodlama.io.rentACar.entities.concrates.Brand;

import java.util.List;

public interface BrandRepository {
    List<Brand> getAll();

}
