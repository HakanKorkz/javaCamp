package kodlama.io.rentACar.busines.concrates;

import kodlama.io.rentACar.busines.abstracts.BrandServices;
import kodlama.io.rentACar.dataAccsess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concrates.Brand;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BrandManager implements BrandServices {
    private BrandRepository brandRepository;

    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }



    @Override
    public List<Brand> getAll() {
        // iş kuralları
        return brandRepository.getAll();
    }
}
