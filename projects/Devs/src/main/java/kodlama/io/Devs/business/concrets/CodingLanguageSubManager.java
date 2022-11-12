package kodlama.io.Devs.business.concrets;

import kodlama.io.Devs.business.abstracts.CodingLanguageService;
import kodlama.io.Devs.business.abstracts.CodingLanguageSubService;
import kodlama.io.Devs.business.requests.CreateCodingLanguageSubRequest;
import kodlama.io.Devs.business.responses.GetAllCodingLanguageSubResponse;
import kodlama.io.Devs.dataAccess.abstracts.CodingLanguageSubRepository;
import kodlama.io.Devs.entities.concretes.CodingLanguage;
import kodlama.io.Devs.entities.concretes.CodingLanguageSub;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CodingLanguageSubManager implements CodingLanguageSubService {
    private CodingLanguageSubRepository codingLanguageSubRepository;
    CodingLanguageService codingLanguageService;

    public CodingLanguageSubManager(CodingLanguageSubRepository codingLanguageSubRepository, CodingLanguageService codingLanguageService) {
        this.codingLanguageSubRepository = codingLanguageSubRepository;
        this.codingLanguageService = codingLanguageService;
    }

    @Override
    public List<GetAllCodingLanguageSubResponse> getAll() {
        return codingLanguageSubRepository.findAll().stream().map(codingLanguageSub -> new GetAllCodingLanguageSubResponse(codingLanguageSub.getId(), codingLanguageSub.getCodingLanguage().getId(), codingLanguageSub.getLibraName())).collect(Collectors.toList());
    }

    @Override
    public void add(CreateCodingLanguageSubRequest createCodingLanguageSubRequest) {
        CodingLanguage codingLanguage = new CodingLanguage();
        codingLanguage.setId(createCodingLanguageSubRequest.getCodingLanguageId());


        CodingLanguageSub languageSub = new CodingLanguageSub();
        languageSub.setLibraName(createCodingLanguageSubRequest.getLibraName());
        languageSub.setCodingLanguage(codingLanguage);
        this.codingLanguageSubRepository.save(languageSub);

    }

    @Override
    public void update(CreateCodingLanguageSubRequest createCodingLanguageSubRequest, int id) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void deleteAll() {

    }


}
