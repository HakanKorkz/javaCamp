package kodlama.io.rentACar.webApi.controllers;

import kodlama.io.rentACar.busines.abstracts.BrandService;
import kodlama.io.rentACar.busines.requests.CreateBrandRequest;
import kodlama.io.rentACar.busines.responses.GetAllBrandsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
public class BrandsController {
    private BrandService brandServices;
    @Autowired
    public BrandsController(BrandService brandServices) {
        this.brandServices = brandServices;
    }

    @GetMapping("/getall")
    public List<GetAllBrandsResponse> getAll(){
        return brandServices.getAll();
    }

    @PostMapping("/add")
    public void add(CreateBrandRequest createBrandRequest) {
        this.brandServices.add(createBrandRequest);
    }

}
