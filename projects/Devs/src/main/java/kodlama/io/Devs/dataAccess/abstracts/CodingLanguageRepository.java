package kodlama.io.Devs.dataAccess.abstracts;

import kodlama.io.Devs.entities.concretes.CodingLanguage;

import java.util.List;

public interface CodingLanguageRepository {
    List<CodingLanguage> getAll();
    CodingLanguage getById(int id);
    void add(CodingLanguage codingLanguage);
    void update(CodingLanguage codingLanguage,int id);
    void delete(int id);
}
