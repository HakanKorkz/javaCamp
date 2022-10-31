package kodlama.io.rentACar.dataAccsess.concrates;

import kodlama.io.rentACar.dataAccsess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concrates.Brand;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class InMemoryBrandRepository implements BrandRepository {
    List<Brand> brands;

    public InMemoryBrandRepository() {
        brands=new ArrayList<Brand>();
        brands.add(new Brand(1,"Fiat"));
        brands.add(new Brand(2,"BMW"));
        brands.add(new Brand(3,"Mercedes"));
        brands.add(new Brand(4,"Audi"));
        brands.add(new Brand(5,"Renault"));

    }

    @Override
    public List<Brand> getAll() {

        return brands;
    }
}
