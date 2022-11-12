package kodlama.io.Devs.webApi.controllers;

import kodlama.io.Devs.business.abstracts.CodingLanguageSubService;
import kodlama.io.Devs.business.requests.CreateCodingLanguageSubRequest;
import kodlama.io.Devs.business.responses.GetAllCodingLanguageSubResponse;
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

    @PostMapping("/add")
    public void add(@RequestBody CreateCodingLanguageSubRequest createCodingLanguageSubRequest) {
        this.codingLanguageSubService.add(createCodingLanguageSubRequest);
    }
}
