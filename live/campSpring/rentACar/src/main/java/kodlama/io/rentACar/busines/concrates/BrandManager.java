package kodlama.io.rentACar.busines.concrates;

import kodlama.io.rentACar.busines.abstracts.BrandServices;
import kodlama.io.rentACar.busines.requests.CreateBrandRequest;
import kodlama.io.rentACar.busines.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.dataAccsess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concrates.Brand;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BrandManager implements BrandServices {
    private BrandRepository brandRepository;

    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<GetAllBrandsResponse> getAll() {
        List<Brand> brands=brandRepository.findAll();
        List<GetAllBrandsResponse> brandsResponses =new ArrayList<GetAllBrandsResponse>();
        for (Brand brand : brands) {
            GetAllBrandsResponse responseItem=new GetAllBrandsResponse();
            responseItem.setId(brand.getId());
            responseItem.setName(brand.getName());
            brandsResponses.add(responseItem);
        }
        // iş kuralları
        return brandsResponses;
    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {
        Brand brand=new Brand();
        brand.setName(createBrandRequest.getName());
        this.brandRepository.save(brand);
    }
}
