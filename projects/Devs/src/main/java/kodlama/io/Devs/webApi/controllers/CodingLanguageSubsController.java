package kodlama.io.Devs.webApi.controllers;

import kodlama.io.Devs.business.abstracts.CodingLanguageSubService;
import kodlama.io.Devs.business.requests.CreateCodingLanguageSubRequest;
import kodlama.io.Devs.business.responses.GetAllCodingLanguageSubResponse;
import kodlama.io.Devs.entities.concretes.CodingLanguageSub;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/codinLibraries")
public class CodingLanguageSubsController {
    private CodingLanguageSubService codingLanguageSubService;

    public CodingLanguageSubsController(CodingLanguageSubService codingLanguageSubService) {
        this.codingLanguageSubService=codingLanguageSubService;
    }
    @GetMapping("/getall")
    public List<GetAllCodingLanguageSubResponse> getAll() {
        return codingLanguageSubService.getAll();
    }

    @GetMapping("/getById")
    CodingLanguageSub getById(@RequestParam int id) throws Exception {
        return this.codingLanguageSubService.getById(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody CreateCodingLanguageSubRequest createCodingLanguageSubRequest) throws Exception {
        this.codingLanguageSubService.add(createCodingLanguageSubRequest);
    }

    @PutMapping("/update")
    public void update(@RequestBody CreateCodingLanguageSubRequest createCodingLanguageSubRequest,int id) throws Exception {
        this.codingLanguageSubService.update(createCodingLanguageSubRequest,id);

    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        codingLanguageSubService.delete(id);
    }

    @DeleteMapping("/deleteAll")
    public void deleteAll() {
        codingLanguageSubService.deleteAll();
    }

}
