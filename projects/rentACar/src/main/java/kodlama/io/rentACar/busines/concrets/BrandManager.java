package kodlama.io.rentACar.busines.concrets;

import kodlama.io.rentACar.busines.abstracts.BrandService;
import kodlama.io.rentACar.dataAccsess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;

    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAll() {
        return brandRepository.getAll();
    }

}
