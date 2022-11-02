package kodlama.io.Devs.dataAccess.concretes;

import kodlama.io.Devs.dataAccess.abstracts.CodingLanguageRepository;
import kodlama.io.Devs.entities.concretes.CodingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class InMemoryCodingLanguage implements CodingLanguageRepository {
    List<CodingLanguage> codingLanguages;

    public InMemoryCodingLanguage() {
        codingLanguages = new ArrayList<CodingLanguage>();
        codingLanguages.add(new CodingLanguage(1, "PHP"));
        codingLanguages.add(new CodingLanguage(2, "JavaScript"));

    }

    @Override
    public List<CodingLanguage> getAll() {
        return codingLanguages;
    }

    @Override
    public CodingLanguage getById(int id) {
        for (CodingLanguage codingLanguage : codingLanguages) {
            if (codingLanguage.getId() == id) {
                return codingLanguage;
            }
        }

        return null;
    }

    @Override
    public void add(CodingLanguage codingLanguage) {
        codingLanguages.add(codingLanguage);
    }

    @Override
    public void update(CodingLanguage codingLanguage, int id) {
        for (CodingLanguage codingLanguage1 : codingLanguages) {
            if (codingLanguage1.getId()==id) {
                codingLanguage1.setCodeName(codingLanguage.getCodeName());
            }
        }

    }

    @Override
    public void delete(int id) {
        codingLanguages.remove(id-1);
    }
}
