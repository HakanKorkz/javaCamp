package kodlama.io.rentACar.webApi.controllers;

import kodlama.io.rentACar.busines.abstracts.BrandServices;
import kodlama.io.rentACar.entities.concrates.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
public class BrandsController {
    private  BrandServices brandServices;
    @Autowired
    public BrandsController(BrandServices brandServices) {
        this.brandServices = brandServices;
    }

    @GetMapping("/getall")
    public List<Brand> getAll(){
        return brandServices.getAll();
    }

}
