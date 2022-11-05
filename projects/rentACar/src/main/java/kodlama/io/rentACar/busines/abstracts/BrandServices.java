package kodlama.io.rentACar.busines.abstracts;

import kodlama.io.rentACar.busines.requests.CreateBrandRequest;
import kodlama.io.rentACar.busines.responses.GetAllBrandsResponse;

import java.util.List;
public interface BrandServices {
    List<GetAllBrandsResponse> getAll();
    void add(CreateBrandRequest createBrandRequest);
}
