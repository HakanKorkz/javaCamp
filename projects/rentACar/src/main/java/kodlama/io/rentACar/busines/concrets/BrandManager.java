package kodlama.io.rentACar.busines.concrets;

import kodlama.io.rentACar.busines.abstracts.BrandService;
import kodlama.io.rentACar.busines.requests.CreateBrandRequest;
import kodlama.io.rentACar.busines.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.dataAccsess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concrates.Brand;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;

    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<GetAllBrandsResponse> getAll() {
        return brandRepository.findAll().stream().map(brand -> new GetAllBrandsResponse(brand.getId(), brand.getName())).collect(Collectors.toList());

//        List<Brand> brands = brandRepository.findAll();
//        List<GetAllBrandsResponse> responses=new ArrayList<>();
//        for (Brand brand:brands) {
//            responses.add(new GetAllBrandsResponse(brand.getId(),brand.getName()));
//        }
//        return responses;
    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {
        Brand brand=new Brand();
        brand.setName(createBrandRequest.getName());
        this.brandRepository.save(brand);
    }

}
