package kodlama.io.Devs.business.concrets;


import kodlama.io.Devs.business.abstracts.CodingLanguageService;
import kodlama.io.Devs.dataAccess.abstracts.CodingLanguageRepository;
import kodlama.io.Devs.entities.concretes.CodingLanguage;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CodingLanguageManager implements CodingLanguageService {
    private CodingLanguageRepository codingLanguageRepository;
    List<CodingLanguage> codingLanguages;

    public CodingLanguageManager(CodingLanguageRepository codingLanguageRepository) {
        this.codingLanguageRepository = codingLanguageRepository;
        codingLanguages = new ArrayList<>();
    }

    @Override
    public List<CodingLanguage> getAll() {
        return codingLanguageRepository.getAll();
    }

    @Override
    public CodingLanguage getById(int id) {
        return codingLanguageRepository.getById(id);
    }

    @Override
    public void add(CodingLanguage codingLanguage) throws Exception {
        for (CodingLanguage codingLanguage1 : codingLanguageRepository.getAll()) {
            if (codingLanguage1.getCodeName().equals("") || codingLanguage1.getCodeName() == null) {
                throw new Exception("Boş geçilemez");
            } else if (codingLanguage1.getCodeName().equals(codingLanguage.getCodeName())) {
                throw new Exception(codingLanguage.getCodeName() + " Bu isim de zaten bir kayıt vardır");
            }
        }
        codingLanguageRepository.add(codingLanguage);
    }

    @Override
    public void update(CodingLanguage codingLanguage, int id) throws Exception {
        codingLanguages = codingLanguageRepository.getAll();
        for (CodingLanguage codingLanguage1 : codingLanguages) {
            if (codingLanguage1.getId() == id) {
                if (codingLanguage1.getCodeName().equals(codingLanguage.getCodeName())) {
                    throw new Exception(codingLanguage.getCodeName() + " Bu isim de zaten bir kayıt vardır");
                }
                if (codingLanguage1.getCodeName().equals("") || codingLanguage1.getCodeName() == null) {
                    throw new Exception("Boş geçilemez");
                }
                codingLanguageRepository.update(codingLanguage, id);
            }
        }
    }

    @Override
    public void delete(int id) {
        codingLanguageRepository.delete(id);

    }
}
