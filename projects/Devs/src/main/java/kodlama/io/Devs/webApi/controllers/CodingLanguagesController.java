package kodlama.io.Devs.webApi.controllers;

import kodlama.io.Devs.business.abstracts.CodingLanguageService;
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

    @RequestMapping("/getall")
    public List<CodingLanguage> getAll() {
        return codingLanguageService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody CodingLanguage codingLanguage) throws Exception {
        codingLanguageService.add(codingLanguage);
    }

    @PostMapping("/update")
    public void update(@RequestBody CodingLanguage codingLanguage,int id) throws Exception {
        codingLanguageService.update(codingLanguage,id);
    }

    @PostMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        codingLanguageService.delete(id);
    }
}
