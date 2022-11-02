package kodlama.io.Devs.business.abstracts;

import kodlama.io.Devs.entities.concretes.CodingLanguage;

import java.util.List;

public interface CodingLanguageService {
    List<CodingLanguage> getAll();
    CodingLanguage getById(int id);
    void add(CodingLanguage codingLanguage) throws Exception;
    void update(CodingLanguage codingLanguage , int id) throws Exception;
    void delete(int id);

}
