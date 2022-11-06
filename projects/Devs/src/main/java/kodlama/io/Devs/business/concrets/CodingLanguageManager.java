package kodlama.io.Devs.business.concrets;


import kodlama.io.Devs.business.abstracts.CodingLanguageService;
import kodlama.io.Devs.business.requests.CreateCodingLanguageRequest;
import kodlama.io.Devs.business.responses.GetAllCodingsLanguageRequest;
import kodlama.io.Devs.dataAccess.abstracts.CodingLanguageRepository;
import kodlama.io.Devs.entities.concretes.CodingLanguage;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CodingLanguageManager implements CodingLanguageService {
    private CodingLanguageRepository codingLanguageRepository;

    public CodingLanguageManager(CodingLanguageRepository codingLanguageRepository) {
        this.codingLanguageRepository = codingLanguageRepository;
    }

    @Override
    public List<GetAllCodingsLanguageRequest> getAll() {
        return codingLanguageRepository.findAll().stream().map(codingLanguage -> new GetAllCodingsLanguageRequest(codingLanguage.getId(), codingLanguage.getCodeName())).collect(Collectors.toList());
    }


    @Override
    public void add(CreateCodingLanguageRequest createCodingLanguageRequest) throws Exception {

        isValid(createCodingLanguageRequest);
        CodingLanguage codingLanguage = new CodingLanguage();
        codingLanguage.setCodeName(createCodingLanguageRequest.getCodeName());
        this.codingLanguageRepository.save(codingLanguage);

    }

    @Override
    public void update(CreateCodingLanguageRequest createCodingLanguageRequest, int id) throws Exception {

        isValid(createCodingLanguageRequest);
        CodingLanguage codingLanguage = new CodingLanguage();
        codingLanguage.setId(id);
        codingLanguage.setCodeName(createCodingLanguageRequest.getCodeName());
        this.codingLanguageRepository.save(codingLanguage);
    }

        @Override
    public void delete(int id) {
        codingLanguageRepository.deleteById(id);
    }


    private void isValid(CreateCodingLanguageRequest createCodingLanguageRequest) throws Exception {
        for (CodingLanguage codingLanguage1 : codingLanguageRepository.findAll()) {
            if (codingLanguage1.getCodeName().equals("") || codingLanguage1.getCodeName() == null) {
                throw new Exception("Boş geçilemez");
            } else if (codingLanguage1.getCodeName().equals(createCodingLanguageRequest.getCodeName())) {
                throw new Exception(createCodingLanguageRequest.getCodeName() + " Bu isim de zaten bir kayıt vardır");
            }
        }
    }
}
