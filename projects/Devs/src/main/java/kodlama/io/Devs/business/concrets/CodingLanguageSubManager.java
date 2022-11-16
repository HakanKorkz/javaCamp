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
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CodingLanguageSubManager implements CodingLanguageSubService {
    private final CodingLanguageSubRepository codingLanguageSubRepository;
    CodingLanguageService codingLanguageService;

    public CodingLanguageSubManager(CodingLanguageSubRepository codingLanguageSubRepository, CodingLanguageService codingLanguageService) {
        this.codingLanguageSubRepository = codingLanguageSubRepository;
        this.codingLanguageService = codingLanguageService;
    }

    @Override
    public List<GetAllCodingLanguageSubResponse> getAll() {
        return codingLanguageSubRepository.findAll().stream().map(codingLanguageSub -> {
            int codingLanguageId = codingLanguageSub.getCodingLanguage().getId();
            String codingLangName = null;
            try {
                codingLangName = String.valueOf(codingLanguageService.getById(codingLanguageId).getCodeName());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            GetAllCodingLanguageSubResponse getAllCodingLanguageSubResponse = new GetAllCodingLanguageSubResponse();
            getAllCodingLanguageSubResponse.setId(codingLanguageSub.getId());
            getAllCodingLanguageSubResponse.setCodingLanguageName(codingLangName);
            getAllCodingLanguageSubResponse.setLibraName(codingLanguageSub.getLibraName());
            return getAllCodingLanguageSubResponse;

        }).collect(Collectors.toList());
    }

    @Override
    public CodingLanguageSub getById(int libraId) throws Exception {
        Optional<CodingLanguageSub> codingLanguageSub=this.codingLanguageSubRepository.findById(libraId);
        return codingLanguageSub.orElseThrow(()->new Exception("Veri bulunamadı"));
    }

    @Override
    public void add(CreateCodingLanguageSubRequest createCodingLanguageSubRequest) throws Exception {
        codingLanguageService.getById(createCodingLanguageSubRequest.getCodingLanguageId());

        CodingLanguage codingLanguage = new CodingLanguage();
        codingLanguage.setId(createCodingLanguageSubRequest.getCodingLanguageId());


        CodingLanguageSub languageSub = new CodingLanguageSub();
        languageSub.setLibraName(createCodingLanguageSubRequest.getLibraName());
        languageSub.setCodingLanguage(codingLanguage);
        this.codingLanguageSubRepository.save(languageSub);

    }

    @Override
    public void update(CreateCodingLanguageSubRequest createCodingLanguageSubRequest, int id) throws Exception {

        CodingLanguage language=codingLanguageService.getById(createCodingLanguageSubRequest.getCodingLanguageId());
        CodingLanguageSub languageSub=new CodingLanguageSub(id, createCodingLanguageSubRequest.getLibraName(), language);
        this.codingLanguageSubRepository.save(languageSub);


    }

    @Override
    public void delete(int id) {
        this.codingLanguageSubRepository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        this.codingLanguageSubRepository.deleteAll();
    }


}
