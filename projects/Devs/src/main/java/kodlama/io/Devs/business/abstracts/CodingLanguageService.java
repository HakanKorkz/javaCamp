package kodlama.io.Devs.business.abstracts;

import kodlama.io.Devs.business.requests.CreateCodingLanguageRequest;
import kodlama.io.Devs.business.responses.GetAllCodingsLanguageResponse;
import kodlama.io.Devs.entities.concretes.CodingLanguage;

import java.util.List;

public interface CodingLanguageService {
    List<GetAllCodingsLanguageResponse> getAll();

    CodingLanguage getById(int id) throws Exception;


    void add(CreateCodingLanguageRequest createCodingLanguageRequest) throws Exception;

    void update(CreateCodingLanguageRequest createCodingLanguageRequest, int id) throws Exception;

    void delete(int id) throws Exception;

    void deleteAll();




}
