package kodlama.io.Devs.webApi.controllers;

import kodlama.io.Devs.business.abstracts.CodingLanguageService;
import kodlama.io.Devs.business.requests.CreateCodingLanguageRequest;
import kodlama.io.Devs.business.responses.GetAllCodingsLanguageResponse;
import kodlama.io.Devs.entities.concretes.CodingLanguage;
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

    @GetMapping("/getall")
    public List<GetAllCodingsLanguageResponse> getAll() {
        return codingLanguageService.getAll();
    }

    @GetMapping("/getById")
    CodingLanguage getById(@RequestParam int id) throws Exception {
        return this.codingLanguageService.getById(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody CreateCodingLanguageRequest createCodingLanguageRequest) throws Exception {
        this.codingLanguageService.add(createCodingLanguageRequest);

    }

    @PutMapping("/update")
    public void update(@RequestBody CreateCodingLanguageRequest createCodingLanguageRequest,int id) throws Exception {
        codingLanguageService.update(createCodingLanguageRequest,id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) throws Exception {
        codingLanguageService.delete(id);
    }
    @RequestMapping("deletaAll")
    public void deleteAll() {
        codingLanguageService.deleteAll();
    }

}
