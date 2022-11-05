package kodlama.io.rentACar.dataAccsess.concretes;

import kodlama.io.rentACar.dataAccsess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class InMemoryBrandRepository implements BrandRepository {
    List<Brand> brands;

    public InMemoryBrandRepository() {
        brands = new ArrayList<Brand>();
        brands.add(new Brand(1,"Fiat"));
        brands.add(new Brand(2,"Tofaş"));
        brands.add(new Brand(3,"Renult"));
        brands.add(new Brand(4,"Toyota"));
        brands.add(new Brand(5,"Citroen"));
    }

    @Override
    public List<Brand> getAll() {
        return brands;
    }
}
