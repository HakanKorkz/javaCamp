package kodlama.io.Devs.webApi.controllers;

import kodlama.io.Devs.business.abstracts.CodingLanguageService;
import kodlama.io.Devs.business.requests.CreateCodingLanguageRequest;
import kodlama.io.Devs.business.responses.GetAllCodingsLanguageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/codinlanguages")
public class CodingLanguagesController {
    private CodingLanguageService codingLanguageService;

    @Autowired
    public CodingLanguagesController(CodingLanguageService codingLanguageService) {
        this.codingLanguageService = codingLanguageService;
    }

    @RequestMapping("/getall")
    public List<GetAllCodingsLanguageRequest> getAll() {
        return codingLanguageService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody CreateCodingLanguageRequest createCodingLanguageRequest) throws Exception {
        this.codingLanguageService.add(createCodingLanguageRequest);

    }

    @PostMapping("/update")
    public void update(@RequestBody CreateCodingLanguageRequest createCodingLanguageRequest,int id) throws Exception {
        codingLanguageService.update(createCodingLanguageRequest,id);
    }

    @PostMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        codingLanguageService.delete(id);
    }

}
