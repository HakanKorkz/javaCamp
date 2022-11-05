package kodlama.io.rentACar.dataAccsess.abstracts;

import kodlama.io.rentACar.entities.concretes.Brand;

import java.util.List;


public interface BrandRepository {
    List<Brand> getAll();

}