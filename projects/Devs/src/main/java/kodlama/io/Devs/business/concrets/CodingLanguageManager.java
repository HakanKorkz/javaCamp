package kodlama.io.Devs.business.concrets;


import kodlama.io.Devs.business.abstracts.CodingLanguageService;
import kodlama.io.Devs.business.requests.CreateCodingLanguageRequest;
import kodlama.io.Devs.business.responses.GetAllCodingsLanguageResponse;
import kodlama.io.Devs.dataAccess.abstracts.CodingLanguageRepository;
import kodlama.io.Devs.entities.concretes.CodingLanguage;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CodingLanguageManager implements CodingLanguageService {
    private final CodingLanguageRepository codingLanguageRepository;

    public CodingLanguageManager(CodingLanguageRepository codingLanguageRepository) {
        this.codingLanguageRepository = codingLanguageRepository;
    }

    @Override
    public List<GetAllCodingsLanguageResponse> getAll() {
        return codingLanguageRepository.findAll().stream().map(codingLanguage -> new GetAllCodingsLanguageResponse(codingLanguage.getId(), codingLanguage.getCodeName())).collect(Collectors.toList());
    }

    @Override
    public CodingLanguage getById(int id) throws Exception {
        isIfIdCheck(id);
        identityCheck(id);
        Optional<CodingLanguage> codingLanguage = this.codingLanguageRepository.findById(id);
        return codingLanguage.orElseThrow(()-> new Exception("Veri bulunamadı"));
    }


    @Override
    public void add(CreateCodingLanguageRequest createCodingLanguageRequest) throws Exception {
        checkNameEmptyDuplication(createCodingLanguageRequest);
        CodingLanguage codingLanguage = new CodingLanguage();
        codingLanguage.setCodeName(createCodingLanguageRequest.getCodeName());
        this.codingLanguageRepository.save(codingLanguage);
    }

    @Override
    public void update(CreateCodingLanguageRequest createCodingLanguageRequest, int id) throws Exception {

        checkNameEmptyDuplication(createCodingLanguageRequest);
        isIfIdCheck(id);
        identityCheck(id);
        CodingLanguage codingLanguage = new CodingLanguage();
        codingLanguage.setId(id);
        codingLanguage.setCodeName(createCodingLanguageRequest.getCodeName());
        this.codingLanguageRepository.save(codingLanguage);
    }

    @Override
    public void delete(int id) throws Exception {
        isIfIdCheck(id);
        identityCheck(id);
        codingLanguageRepository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        codingLanguageRepository.deleteAll();
    }


    private void checkNameEmptyDuplication(CreateCodingLanguageRequest createCodingLanguageRequest) throws Exception {
        String name = createCodingLanguageRequest.getCodeName();

        boolean isNameDuplication = false;

        for (CodingLanguage codingLanguage1 : codingLanguageRepository.findAll()) {
            if (codingLanguage1.getCodeName().equals(createCodingLanguageRequest.getCodeName())) {
                isNameDuplication = true;
                break;
            }
        }

        if (name.isBlank() || name.isEmpty()) {
            throw new Exception("Boş geçilemez");
        }
        if (isNameDuplication) {
            throw new Exception(createCodingLanguageRequest.getCodeName() + " Bu isim de zaten bir kayıt vardır");
        }
    }

    private void isIfIdCheck(int id) throws Exception {
        if (id <= 0) {
            throw new Exception("Girilen ID 0 dan küçük veyahut boş bir değer");
        }
    }

    private void identityCheck(int id) throws Exception {
        List<CodingLanguage> codingLanguageList = this.codingLanguageRepository.findAll();
        boolean await = true;
        for (CodingLanguage codingLanguages : codingLanguageList) {
            if (codingLanguages.getId() == id) {
                await = false;
                break;
            }
        }
        if (await) {
            throw new Exception("aşağıdaki kimliğe sahip bir dil yok: " + id);
        }
    }

}
